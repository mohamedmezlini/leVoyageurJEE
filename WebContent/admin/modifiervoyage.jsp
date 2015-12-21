<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="context" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion voyage</title>
<%@include file="header.jsp"%> <br>

</head>
<body>



	<%@include file="navadmin.jsp"%> 



<!-- ============================================  le contenu du site ==================================-->
<div class=" container  content-body">


<div class=" row" style =" margin-top: 53px;"
>
<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12 text-center">

						<h1 class="head1"> Modifier Voyage ${Voyage.idVoyage}</h1>
					</div>
	<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12   "  >
	
	<form class="form" method="post"
				action="ModifierVoyage?idv=${Voyage.idVoyage}">
	<div class="form-group">
							<label for="nom3" class="col-sm-4 control-label">Pays</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" value="${Voyage.pays}" name="pays">
							</div>
						</div>
						<input type="text" value="${Voyage.idVoyage}" name="idv">
									
						<div class="form-group">
							<label for="nom3" class="col-sm-4 control-label">Ville
								departe</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" value="${Voyage.villeDepart}" name="ville_d"
									required="required">
							</div>
						</div>
						<div class="form-group">
							<label for="nom3" class="col-sm-4 control-label">Ville
								Arrivee</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" value="${Voyage.villeArrivee}" name="ville_a"
									required="required">
							</div>
						</div>
						<div class="form-group">
							<label for="nom3" class="col-sm-4 control-label">date
								departe</label>
							<div class="col-sm-8">
								<input type="date" class="form-control" value="${Voyage.dateDepart}"  name="date_d"
									required="required">
							</div>
						</div>
						<div class="form-group">
							<label for="nom3" class="col-sm-4 control-label">date
								arrivee</label>
							<div class="col-sm-8">
								<input type="date" class="form-control" value="${Voyage.dateArrivee}" name="date_a"
									required="required">
							</div>
						</div>
						<div class="form-group">
							<label for="nom3" class="col-sm-4 control-label">disonibilite</label>
							<div class="col-sm-8">
								<input type="number" class="form-control" value="${Voyage.nbDispo}"  name="disponible"
									required="required">
							</div>
						</div>
						<div class="form-group">
							<label for="nom3" class="col-sm-4 control-label">prix</label>
							<div class="col-sm-8">
								<input type="text" name="prix" value="${Voyage.prix}" class="form-control"
									required="required">
							</div>
						</div>

						 
						<div class="form-group">
							<div class="col-sm-12 pull-rigth">
								<button class="btn btn-warning" type="submit"  >Modifier</button>
							</div>
						</div>
					</form>

	</div>
</div>
</div>
	<%@include file="footer.jsp"%> <br>

</body>
</html>