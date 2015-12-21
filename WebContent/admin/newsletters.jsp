<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion newsletters</title>
<%@include file="header.jsp"%> <br>

</head>
<body>



	<%@include file="navadmin.jsp"%> 



<!-- ============================================  le contenu du site ==================================-->
<div class=" container  content-body">


<div class=" row" style =" margin-top: 53px;"
>
<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12 text-center">

						<h1 class="head1"> les Newsletters  qui existent </h1>
					</div>
	<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12   "  >

<div id="example_wrapper" class="dataTables_wrapper form-inline dt-bootstrap">

 
   <div class="row">     
      <div class="col-sm-12">
         <table id="example" class="table table-striped table-bordered dataTable" cellspacing="0" width="100%" role="grid" aria-describedby="example_info" style="width: 100%;">
            <thead>
               <tr role="row">
                  <th class="sorting_asc" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-sort="ascending" aria-label=" ID : activate to sort column descending" style="width: 138px;"> ID </th>
                 <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  Mail  : activate to sort column ascending" style="width: 91px;">  Mail </th>
            <th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="  Supprimer  : activate to sort column ascending" style="width: 91px;">  Supprimer </th>
             </tr>
            </thead>
            <tfoot>
               <tr>

			<th rowspan="1" colspan="1"> ID Newletter</th>
			<th rowspan="1" colspan="1"> Mail </th>
			<th rowspan="1" colspan="1"> Supprimer </th>
			</tr>
 </tfoot>
            <tbody>

		<c:forEach items="${listeNewsletters}" var="news">
			<tr>
				<td><c:out value="${news.idNewsletter}" /></td>
				<td><c:out value="${news.mail}" /></td>
				<td><a
					href="${context }/admin/SupprimerNewsletter?id=${news.idNewsletter}">Supprimer</a></td>

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