<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion contacts</title>
<%@include file="header.jsp"%>
<br>

</head>
<body>



	<%@include file="navadmin.jsp"%>



	<!-- ============================================  le contenu du site ==================================-->
	<div class=" container  content-body">


		<div class=" row" style="margin-top: 53px;">
			<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12 text-center">

				<h1 class="head1">les Contacts qui existent</h1>
			</div>
			<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12   ">

				<div id="example_wrapper"
					class="dataTables_wrapper form-inline dt-bootstrap">


					<div class="row">
						<div class="col-sm-12">
							<table id="example"
								class="table table-striped table-bordered dataTable"
								cellspacing="0" width="100%" role="grid"
								aria-describedby="example_info" style="width: 100%;">
								<thead>
									<tr role="row">
										<th class="sorting_asc" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1" aria-sort="ascending"
											aria-label=" ID : activate to sort column descending"
											style="width: 138px;">ID Contact</th>
										<th class="sorting" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1"
											aria-label="  idC  : activate to sort column ascending"
											style="width: 219px;">Id Client</th>
										<th class="sorting" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1"
											aria-label="  etat  : activate to sort column ascending"
											style="width: 99px;">Sujet</th>
										<th class="sorting" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1"
											aria-label="  objet  : activate to sort column ascending"
											style="width: 43px;">Objet</th>
										<th class="sorting" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1"
											aria-label="  Repondre  : activate to sort column ascending"
											style="width: 91px;">Reponse</th>
									
										<th class="sorting" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1"
											aria-label="  Repondre  : activate to sort column ascending"
											style="width: 91px;">Repondre</th>
									</tr>
								</thead>
								<tfoot>
									<tr>

										<th rowspan="1" colspan="1">ID Contact</th>
										<th rowspan="1" colspan="1">Id Client</th>
										<th rowspan="1" colspan="1">Objet</th>
										<th rowspan="1" colspan="1">Sujet</th>
										<th rowspan="1" colspan="1">Reponse</th>
										<th rowspan="1" colspan="1">Repondre</th>
									</tr>
								</tfoot>
								<tbody>

									<c:forEach items="${listeContacts}" var="contact">
										<tr>
											<td><c:out value="${contact.idContact}" /></td>
											<td><c:out value="${contact.client.idClient}" /></td>
											<td><c:out value="${contact.objet}" /></td>
											<td><c:out value="${contact.sujet}" /></td>
											<td><c:out value="${contact.repondre}" /></td>
											<td>
											
											
											
											
											
											
											
											
											
												
												
							<a  data-toggle="modal" data-target="#myModal${contact.idContact}" style="text-decoration :none"> 
								Repondre
							</a>

							<!-- Modal -->
							<div class="modal fade" id="myModal${contact.idContact}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
								<div class="modal-dialog" role="document">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
											<h4 class="modal-title" id="myModalLabel">Repondre</h4>
										</div>


											<form class="form-horizontal" method="post" action="RepondreContactAdmin?id=${contact.idContact}">

										<div class="modal-body">


									


												<div class="form-group">
													<label for="adresse3" class="col-sm-2 control-label">Reponse</label>
													<div class="col-sm-10">
														<input type="text" name="des" class="form-control" id="Adresse3" placeholder="Adresse" required="required">
													</div>
												</div>


										





										</div>
										<div class="modal-footer">
											<button type="submit" class="btn btn-warning">Repondre</button>
										</div>
										
										</form>
									</div>
								</div>
							</div>
												
												
												
												</td>

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
	<%@include file="footer.jsp"%>
	<br>

</body>
</html>