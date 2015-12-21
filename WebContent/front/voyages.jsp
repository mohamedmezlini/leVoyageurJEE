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

				<h1 class="head1">Choisissez votre destination </h1>
			</div>


<c:forEach items="${listeVoyages}" var="voyage">
			
			<%-- 	<c:out value="${voyage.dateArrivee}" />
	 		 	<c:out value="${voyage.dateDepart}" />
				<c:out value="${voyage.nbDispo}" />
				<c:out value="${voyage.nbVendu}" />
				<c:out value="${voyage.pays}" />
				<c:out value="${voyage.prix}" />
				<c:out value="${voyage.villeArrivee}" />
				<c:out value="${voyage.villeDepart}" /> 
				


				<a href="${context}/admin/ModifierClient?id=${voyage.idVoyage}">Modifier</a>
				<a
					href="${context}/admin/SupprimerClient?id=${voyage.idVoyage}">Supprimer</a>

			
		 --%>





<div class="col-lg-3 col-md-3 col-xs-6  col-sm-4 ">

<div class=" col-lg-11 col-md-11 col-xs-11 col-sm-11 art-block">
    <div class="banner"> 
        <img  class=" img-responsive center-block img-thumbnail" src="/LeVoyageur/images/gris.jpg" alt="">
        <div class=" caption captionpanier">
            <div class=" captionpanier "><label> Pays </label><c:out value="${voyage.pays}" /></div>
            <div class=" captionpanier "><label>Prix</label><span><c:out value="${voyage.prix}" /></span></div>            
            <div class="  captionpanier date"><label>Date</label><span><c:out value="${voyage.dateArrivee}" /> //
	 		 	<c:out value="${voyage.dateDepart}" /></span></div>
            <form method="post" action="AjouterAuPanier?id_cl=${sessionScope.sessionUtilisateur.idClient}">

               <fieldset>
                <label>
                    <span>Quantity</span>
                    <input type="text" size="2" maxlength="2" name="nb" value="1" style="color: black;" />
                </label>

            </fieldset>
            <input type="hidden" name="id_voy" value="${voyage.idVoyage}" />
            <button type="submit" class="   btn btn-warning  fa fa-shopping-cart" >Ajouter</button>
        </form>
    </div> 
</div>
</div>
</div>


</c:forEach>
</section>
</div>
<%-- <%@include file="news.jsp"%> <br> --%>
<%@include file="footer.jsp"%> <br>
</body>
</html>