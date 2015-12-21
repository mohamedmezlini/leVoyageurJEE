Menu : <br>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="context" value="${pageContext.request.contextPath}" />
<script src="${context}/themes/js/jquery.js"></script>

<a href="${context}/admin/Clients">Gestion clients</a> <br>
<a href="${context}/admin/Newsletters">Gestion newsletters</a> <br>
<a href="${context}/Deconnexion">Deconnexion</a>