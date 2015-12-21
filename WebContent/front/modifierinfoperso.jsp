<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voyages</title>

<%@include file="head.jsp"%>
<br>
</head>
<body>

	<%@include file="nav.jsp"%>
	<br>
	<%@include file="carousel.jsp"%>
	<br>
	<%-- <%@include file="aprescarousel.jsp"%> <br> --%>


	<div class="container-fluid">
		<section class="row">

		<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12 text-center">

			<h1 class="head1">Modifier info personnel</h1>
		</div>
		<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12 text-center">

			<form class="form" method="post"
				action="ModifInfoPerso?idc=${clt.idClient}">


				<input type="hidden" name="idc" value="${clt.idClient}"
					disabled="disabled" /> <input type="hidden" type="text"
					name="role" value="${clt.role}" />

				<div class="form-group">
					<label for="nom3" class="col-sm-2 control-label">Nom</label>
					<div class="col-sm-10">

						<input class="form-control" type="text" name="nom"
							value="${clt.nom}" />
					</div>
				</div>

				<div class="form-group">
					<label for="prenom3" class="col-sm-2 control-label">Prénom</label>
					<div class="col-sm-10">
						<input class="form-control" type="text" name="prenom"
							value="${clt.prenom}" />
					</div>
				</div>

				<div class="form-group">
					<label for="prenom3" class="col-sm-2 control-label">Adresse</label>
					<div class="col-sm-10">
						<input class="form-control" type="text" name="adresse"
							value="${clt.adresse}" />
					</div>
				</div>

				<div class="form-group">
					<label for="prenom3" class="col-sm-2 control-label">mail</label>
					<div class="col-sm-10">
						<input class="form-control" type="text" name="mail"
							value="${clt.mail}" />
					</div>
				</div>

				<div class="form-group">
					<label for="prenom3" class="col-sm-2 control-label">tel</label>
					<div class="col-sm-10">
						<input class="form-control" type="text" name="tel"
							value="${clt.tel}" />
					</div>
				</div>

				<div class="form-group">
					<label for="prenom3" class="col-sm-2 control-label">cin</label>
					<div class="col-sm-10">
						<input class="form-control" type="text" name="cin"
							value="${clt.cin}" />
					</div>
				</div>

				<div class="form-group">
					<label for="prenom3" class="col-sm-2 control-label">login</label>
					<div class="col-sm-10">

						<input class="form-control" type="text" name="login"
							value="${clt.login}" />
					</div>
				</div>

				<div class="form-group">
					<label for="prenom3" class="col-sm-2 control-label">Mot de
						passe</label>
					<div class="col-sm-10">
						<input class="form-control" type="password" name="mdp"
							value="${clt.mdp}" />
					</div>
				</div>





				<div class="form-group">
					<label for="cin3" class="col-sm-2 control-label">Sex</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="sex"
							value="${clt.sex}" id="cin3" placeholder="CIN"
							required="required">
					</div>
				</div>


				<div class="form-group">
					<label for="adresse3" class="col-sm-2 control-label">Age</label>
					<div class="col-sm-10">
						<input type="number" name="age" class="form-control"
							value="${clt.age}" id="Adresse3" placeholder="Adresse"
							required="required">
					</div>
				</div>




				<div class="form-group">
					<div class="col-sm-10 pull-rigth">

						<button class="btn btn-warning" type="submit">Modifier</button>
					</div>
				</div>



			</form>
		</div>
		</section>
	</div>
	<%-- <%@include file="news.jsp"%> <br> --%>
	<%@include file="footer.jsp"%>
	<br>
</body>
</html>