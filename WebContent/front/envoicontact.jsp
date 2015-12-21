<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voyages</title>

<%@include file="head.jsp"%> <br>
</head>
<body>

<%@include file="nav.jsp"%> <br>
<%@include file="carousel.jsp"%> <br>
<%-- <%@include file="aprescarousel.jsp"%> <br> --%>


<div class="container-fluid">
<section class="row">

			<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12 text-center">

				<h1 class="head1">envoyer cotact </h1>
			</div>



		<form class="form" method="post" action="EnvoiContact?id=${sessionScope.sessionUtilisateur.idClient}">
			Objet : <input class="form-control" type="text" name="objet" /><br> Sujet :
			<textarea class="form-control" name="sujet"></textarea>
			 <input class="btn btn-warning" type="submit" value="Envoyez" />
		</form>
		
		
</section>
</div>
<%-- <%@include file="news.jsp"%> <br> --%>
<%@include file="footer.jsp"%> <br>
</body>
</html>