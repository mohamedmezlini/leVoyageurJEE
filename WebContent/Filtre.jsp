<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    <c:set var="context" value="${pageContext.request.contextPath}" />
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accee réfusée </title>

	<link rel="stylesheet" href="${context }/css/bootstrap.min.css">
</head>
<body>

<div class="container-fluid">
	<div class="row">
		<div  style="margin-top:10%; " class="  col-lg-offset-4 col-md-offset-4 col-xs-offset-4 col-lg-10 col-md-10 col-xs-10">
			<img class="img-responsive" alt="" src="${context }/images/accessdenied.jpg">
		</div>
	</div>
</div>

</body>
</html>