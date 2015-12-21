<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="context" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion clients</title>
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


	<%@include file="ajouterclient.jsp"%> 
	
	
<div id="example_wrapper" class="dataTables_wrapper form-inline dt-bootstrap">

 
   <div class="row">     
      <div class="col-sm-12">
         <table id="example" class="table table-striped table-bordered dataTable" cellspacing="0" width="100%" role="grid" aria-describedby="example_info" style="width: 100%;">
            <thead>
               <tr role="row">
                  <th class="sorting_asc" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-sort="ascending" aria-label=" ID : activate to sort column descending" style="width: 138px;"> ID </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  nom  : activate to sort column ascending" style="width: 219px;">  Nom  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  prenom  : activate to sort column ascending" style="width: 99px;">  Prenom  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  adresse  : activate to sort column ascending" style="width: 43px;">  Adresse  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="   mail  : activate to sort column ascending" style="width: 43px;">   Mail  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  tel  : activate to sort column ascending" style="width: 91px;">  Tel  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  cin  : activate to sort column ascending" style="width: 91px;">  CIN  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  login  : activate to sort column ascending" style="width: 91px;">  Login  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  mdp  : activate to sort column ascending" style="width: 76px;">  MDP  </th>
                  <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  role  : activate to sort column ascending" style="width: 76px;">  Role  </th>
            	   <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  solde  : activate to sort column ascending" style="width: 76px;">  Solde  </th>
                <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  modifier : activate to sort column ascending" style="width: 76px;">  Modifier  </th>
               <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  supprimer  : activate to sort column ascending" style="width: 76px;">  supprimer  </th>
               </tr>
            </thead>
            <tfoot>
               <tr>

			<th rowspan="1" colspan="1"> ID</th>
			<th rowspan="1" colspan="1"> Nom</th>
			<th rowspan="1" colspan="1"> Prenom</th>
			<th rowspan="1" colspan="1"> Adresse</th>
			<th rowspan="1" colspan="1"> Mail</th>
			<th rowspan="1" colspan="1"> Tel</th>
			<th rowspan="1" colspan="1"> CIN</th>
			<th rowspan="1" colspan="1"> Login</th>
			<th rowspan="1" colspan="1"> MDP</th>
			<th rowspan="1" colspan="1"> Role</th>
			<th rowspan="1" colspan="1"> Solde</th>
			<th rowspan="1" colspan="1"> Modifier</th>
			<th rowspan="1" colspan="1"> Supprimer</th>
			</tr>
 </tfoot>
            <tbody>
		
		<c:forEach items="${listeClients}" var="client">
			<tr>
				<td><c:out value="${client.idClient}" /></td>
				<td><c:out value="${client.nom}" /></td>
				<td><c:out value="${client.prenom}" /></td>
				<td><c:out value="${client.adresse}" /></td>
				<td><c:out value="${client.mail}" /></td>
				<td><c:out value="${client.tel}" /></td>
				<td><c:out value="${client.cin}" /></td>
				<td><c:out value="${client.login}" /></td>
				<td><c:out value="${client.mdp}" /></td>
				<td><c:out value="${client.role}" /></td>
				<td><c:out value="${client.compte.solde}" /></td>
				<td><a href="${context}/admin/ModifierClient?id=${client.idClient}">Modifier</a></td>
				<td><a
					href="${context}/admin/SupprimerClient?id=${client.idClient}">Supprimer</a></td>

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