<a data-toggle="modal" data-target="#myvoyaoo"
	style="text-decoration: none"> Ajouter Voyage </a>
<!-- Modal -->
<div class="modal fade" id="myvoyaoo" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabe">
	<div class="modal-dialog" role="document">
		<div class="modal-content" style="height: 445PX;">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabe">Ajouter Voyage</h4>
			</div>
			<div class="modal-body">
				<form action="AjouterVoyage" method="POST">
					<div class="form-group">
						<label for="nom3" class="col-sm-4 control-label">Pays</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" name="pays">
						</div>
					</div>
					<div class="form-group">
						<label for="nom3" class="col-sm-4 control-label">Ville
							departe</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" name="ville_d"
								required="required">
						</div>
					</div>
					<div class="form-group">
						<label for="nom3" class="col-sm-4 control-label">Ville
							Arrivee</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" name="ville_a"
								required="required">
						</div>
					</div>
					<div class="form-group">
						<label for="nom3" class="col-sm-4 control-label">date
							departe</label>
						<div class="col-sm-8">
							<input type="date" class="form-control" name="date_d"
								required="required">
						</div>
					</div>
					<div class="form-group">
						<label for="nom3" class="col-sm-4 control-label">date
							arrivee</label>
						<div class="col-sm-8">
							<input type="date" class="form-control" name="date_a"
								required="required">
						</div>
					</div>
					<div class="form-group">
						<label for="nom3" class="col-sm-4 control-label">disonibilite</label>
						<div class="col-sm-8">
							<input type="number" class="form-control" name="disponible"
								required="required">
						</div>
					</div>
					<div class="form-group">
						<label for="nom3" class="col-sm-4 control-label">prix</label>
						<div class="col-sm-8">
							<input type="text" name="prix" class="form-control"
								required="required">
						</div>
					</div>


					<div class="form-group">
						<div class="col-sm-12 pull-rigth">
							<button class="btn btn-warning" type="submit">Sauvegarder</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>