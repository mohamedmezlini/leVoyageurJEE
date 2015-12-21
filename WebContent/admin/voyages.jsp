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

						<h1 class="head1"> les utilisateurs  qui existent </h1>
					</div>
	<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12   "  >


	<%@include file="ajoutervoyage.jsp"%> 
	
	
<div id="example_wrapper" class="dataTables_wrapper form-inline dt-bootstrap">

 
   <div class="row">     
      <div class="col-sm-12">
         <table id="example" class="table table-striped table-bordered dataTable" cellspacing="0" width="100%" role="grid" aria-describedby="example_info" style="width: 100%;">
            <thead>
               <tr role="row">
                  <th class="sorting_asc" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-sort="ascending" aria-label=" ID : activate to sort column descending" style="width: 138px;"> ID </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  nom  : activate to sort column ascending" style="width: 219px;">  Date d'arrivee  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  prenom  : activate to sort column ascending" style="width: 99px;">  Date de depart  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  adresse  : activate to sort column ascending" style="width: 43px;">  nbDispo  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="   mail  : activate to sort column ascending" style="width: 43px;">   nbVendu  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  tel  : activate to sort column ascending" style="width: 91px;">  pays  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  cin  : activate to sort column ascending" style="width: 91px;">  prix  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  login  : activate to sort column ascending" style="width: 91px;">  ville d'arrivee  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  mdp  : activate to sort column ascending" style="width: 76px;">  ville de depart  </th>

                <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  modifier : activate to sort column ascending" style="width: 76px;">  Modifier  </th>
               </tr>
            </thead>
            <tfoot>
               <tr>

			<th rowspan="1" colspan="1"> ID</th>
			<th rowspan="1" colspan="1"> Date d'arrivee</th>
			<th rowspan="1" colspan="1"> date de depart</th>
			<th rowspan="1" colspan="1"> nbDispo</th>
			<th rowspan="1" colspan="1"> nbVendu</th>
			<th rowspan="1" colspan="1"> pays</th>
			<th rowspan="1" colspan="1"> prix</th>
			<th rowspan="1" colspan="1"> ville d'arrivee</th>
			<th rowspan="1" colspan="1"> ville de depart</th>
			
			<th rowspan="1" colspan="1"> Modifier</th>
			</tr>
 </tfoot>
            <tbody>
		
		<c:forEach items="${listeVoyages}" var="Voyage">
			<tr>
				<td><c:out value="${Voyage.idVoyage}" /></td>
				<td><c:out value="${Voyage.dateArrivee}" /></td>
	 		 <td><c:out value="${Voyage.dateDepart}" /></td>
				<td><c:out value="${Voyage.nbDispo}" /></td>
				<td><c:out value="${Voyage.nbVendu}" /></td>
				<td><c:out value="${Voyage.pays}" /></td>
				<td><c:out value="${Voyage.prix}" /></td>
				<td><c:out value="${Voyage.villeArrivee}" /></td>
				<td><c:out value="${Voyage.villeDepart}" /></td> 
				


				<td><a href="${context}/admin/ModifierVoyage?id=${Voyage.idVoyage}">Modifier</a></td>
				
			</tr>
		</c:forEach>
	</tbody>
         </table>
      </div>
   </div>

</div>



	</div>
</div>
</div>
	<%@include file="footer.jsp"%> <br>

</body>
</html>