<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
<%@include file="header.jsp"%> <br>

</head>
<body>
<c:if test="${sessionScope.role=='Admin'}">
   <%@include file="navadmin.jsp"%>
</c:if>
<c:if test="${sessionScope.role=='Client'}">
   <p class="succes">Vous êtes connecté(e) avec le login :
		${sessionScope.sessionUtilisateur.login} , en tant que : ${sessionScope.role}.</p>
	<%@include file="navclient.jsp"%>
</c:if>

<%@include file="footer.jsp"%>

</body>
</html>