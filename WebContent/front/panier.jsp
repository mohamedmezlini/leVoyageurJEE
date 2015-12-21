<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Panier</title>

<%@include file="head.jsp"%> <br>
</head>
<body>

<%@include file="nav.jsp"%> <br>
<%@include file="carousel.jsp"%> <br>
<%-- <%@include file="aprescarousel.jsp"%> <br> --%>


<div class="container-fluid">
<section class="row">

			<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12 text-center">

				<h1 class="head1">Votre Panier  </h1>
			</div>
<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12 text-center">

	
<div id="example_wrapper" class="dataTables_wrapper form-inline dt-bootstrap">

 
   <div class="row">     
      <div class="col-sm-12">
         <table id="example" class="table table-striped table-bordered dataTable" cellspacing="0" width="100%" role="grid" aria-describedby="example_info" style="width: 100%;">
            <thead>
               <tr role="row">
                 <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  nom  : activate to sort column ascending" style="width: 219px;">  Date d'arrivee  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  prenom  : activate to sort column ascending" style="width: 99px;">  Date de depart  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  adresse  : activate to sort column ascending" style="width: 43px;">  nbDispo  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="   mail  : activate to sort column ascending" style="width: 43px;">   nbVendu  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  tel  : activate to sort column ascending" style="width: 91px;">  pays  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  cin  : activate to sort column ascending" style="width: 91px;">  prix  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  login  : activate to sort column ascending" style="width: 91px;">  ville d'arrivee  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  mdp  : activate to sort column ascending" style="width: 76px;">  ville de depart  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  cin  : activate to sort column ascending" style="width: 91px;">  Etat </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  login  : activate to sort column ascending" style="width: 91px;">  Prix total  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  mdp  : activate to sort column ascending" style="width: 76px;">  nombe reserve  </th>

                <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  Valider : activate to sort column ascending" style="width: 76px;">  Valider  </th>
                <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  Annuler : activate to sort column ascending" style="width: 76px;">  Annuler </th>
               </tr>
            </thead>
            <tfoot>
               <tr>

			<th rowspan="1" colspan="1"> Date d'arrivee</th>
			<th rowspan="1" colspan="1"> date de depart</th>
			<th rowspan="1" colspan="1"> nbDispo</th>
			<th rowspan="1" colspan="1"> nbVendu</th>
			<th rowspan="1" colspan="1"> pays</th>
			<th rowspan="1" colspan="1"> prix</th>
			<th rowspan="1" colspan="1"> ville d'arrivee</th>
			<th rowspan="1" colspan="1"> ville de depart</th>
			<th rowspan="1" colspan="1"> etat</th>
			<th rowspan="1" colspan="1"> Prix Total</th>
			<th rowspan="1" colspan="1"> nombre reserve</th>
			
			<th rowspan="1" colspan="1"> Valider</th>
			<th rowspan="1" colspan="1"> Annuler</th>
			</tr>
 </tfoot>
            <tbody>
<c:forEach items="${listePaniers}" var="panier" varStatus="status">
			
		<tr>
		
				<td><c:out value="${listeVoyages[status.index].dateArrivee}" /></td>
	 		 <td><c:out value="${listeVoyages[status.index].dateDepart}" /></td>
				<td><c:out value="${listeVoyages[status.index].nbDispo}" /></td>
				<td><c:out value="${listeVoyages[status.index].nbVendu}" /></td>
				<td><c:out value="${listeVoyages[status.index].pays}" /></td>
				<td><c:out value="${listeVoyages[status.index].prix}" /></td>
				<td><c:out value="${listeVoyages[status.index].villeArrivee}" /></td>
				<td><c:out value="${listeVoyages[status.index].villeDepart}" /></td> 
		
		
				<td><c:out value="${panier.etat}" /></td>
				<td><c:out value="${panier.prix}" /></td>
				<td><c:out value="${panier.nb}" /></td>
				<td><a
					href="${context}/front/ValiderPanier?idc=${panier.client.idClient}&idv=${panier.voyage.idVoyage}">Valider</a>
					</td>
					<td><a
					href="${context}/front/SupprimerDuPanier?idc=${panier.client.idClient}&idv=${panier.voyage.idVoyage}">Supprimer</a></td>
				</td>
			</tr>
			
			


</c:forEach>

</tbody>
         </table>
      </div>
   </div>

</div>


</div>
</section>
</div>
<%-- <%@include file="news.jsp"%> <br> --%>
<%@include file="footer.jsp"%> <br>
</body>
</html>