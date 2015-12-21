<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>




							<a  data-toggle="modal" data-target="#myModal" style="text-decoration :none"> 
								S'inscrire
							</a>

							<!-- Modal -->
							<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
								<div class="modal-dialog" role="document">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
											<h4 class="modal-title" id="myModalLabel">S'inscrire </h4>
										</div>


											<form class="form-horizontal" method="post" action="Inscription">

										<div class="modal-body">


									


												<div class="form-group">
													<label for="nom3" class="col-sm-2 control-label">Nom</label>
													<div class="col-sm-10">
														<input type="text" class="form-control" id="nom3" placeholder="Nom" name="nom" required="required">
													</div>
												</div>

												<div class="form-group">
													<label for="prenom3" class="col-sm-2 control-label">Prénom</label>
													<div class="col-sm-10">
														<input type="text" class="form-control" id="prenom3" placeholder="Prenom" name="prenom" required="required">
													</div>
												</div>

												<div class="form-group">
													<label for="login3" class="col-sm-2 control-label">login</label>
													<div class="col-sm-10">
														<input type="text" class="form-control" id="login3" placeholder="Nom Utilisateur" name="login" required="required">
													</div>
												</div>

												<div class="form-group">
													<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
													<div class="col-sm-10">
														<input type="email" name="mail" class="form-control" id="inputEmail3" placeholder="Email" required="required">
													</div>
												</div>
												<div class="form-group">
													<label for="inputPassword3" class="col-sm-2 control-label">Password</label>
													<div class="col-sm-10">
														<input type="password" class="form-control" id="inputPassword3" placeholder="Password" name="mdp" required="required">
													</div>
												</div>

												


												<div class="form-group">
													<label for="tel3" class="col-sm-2 control-label">tel</label>
													<div class="col-sm-10">
														<input type="tel" class="form-control" name="tel" id="tel3" placeholder="tel" required="required">
													</div>
												</div>


												<div class="form-group">
													<label for="cin3" class="col-sm-2 control-label">CIN</label>
													<div class="col-sm-10">
														<input type="number" class="form-control" name="cin" id="cin3" placeholder="CIN" required="required">
													</div>
												</div>


												<div class="form-group">
													<label for="adresse3" class="col-sm-2 control-label">Adresse</label>
													<div class="col-sm-10">
														<input type="text" name="adresse" class="form-control" id="Adresse3" placeholder="Adresse" required="required">
													</div>
												</div>


												<div class="form-group">
													<label for="cin3" class="col-sm-2 control-label">Sex</label>
													<div class="col-sm-10">
														<input type="text" class="form-control" name="sex" id="cin3" placeholder="CIN" required="required">
													</div>
												</div>


												<div class="form-group">
													<label for="adresse3" class="col-sm-2 control-label">Age</label>
													<div class="col-sm-10">
														<input type="number" name="age" class="form-control" id="Adresse3" placeholder="Adresse" required="required">
													</div>
												</div>


										





										</div>
										<div class="modal-footer">
											<button type="submit" class="btn btn-warning">Enregistrer</button>
										</div>
										
										</form>
									</div>
								</div>
							</div>