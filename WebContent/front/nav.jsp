	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<c:set var="context" value="${pageContext.request.contextPath}" />
	
	
		
		<nav class="  navbar navbar-default navbar-fixed-top nav-menu-milieu" >
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#"> <span class=" fa fa-2x fa-plane">leVoyageur </span></a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a  href="#"   role="button" aria-haspopup="true" aria-expanded="false">A propos  <span class="sr-only">(current)</span></a></li>
						<li class=""><a href="${context }/front/Voyages"  role="button" aria-haspopup="true" aria-expanded="false">Voyages</a></li>
						<li class=""><a href="${context}/front/EnvoiContact"  role="button" aria-haspopup="true" aria-expanded="false">Contact</a></li>
						<li class=""><a href="${context}/front/Contacts?id=${sessionScope.sessionUtilisateur.idClient}"  role="button" aria-haspopup="true" aria-expanded="false">les Contacts</a></li>
					</ul>
					<form class="navbar-form navbar-left" method="post" action="voyages.php" role="search">
						<div class="form-group">
							<input type="text" name="pays" class="form-control" placeholder="Search">
						</div>
						<button name="chercher" type="submit" class="btn btn-default">Chercher</button>
					</form>
					
					

					<ul class="nav navbar-nav pull-right">



						<li class="dropdown" id="menuLogin">

	 <button class="dropdown-toggle    btn btn-warning fa fa-user" href="#" data-toggle="dropdown" id="menuLogin">Bienvenue 
								${sessionScope.sessionUtilisateur.login}


								
							</button>
							<div  class="dropdown-menu col-lg-8" style="padding:17px;">

								<div class="lienpc">
									<a href="${context}/front/ModifInfoPerso?id=${sessionScope.sessionUtilisateur.idClient}"> Modifier votre compte </a>
								</div>
								
								<div class="lienpc">
									<a href="${context}/front/Panier?id=${sessionScope.sessionUtilisateur.idClient}""> voir panier</a>
								</div>

								<div class="lienpc">
									<a class=" btn btn-warning" href="${context}/Deconnexion"> Deconnexion</a>
								</div>

								
							</div>



					</li>
				</ul>
			</div><!-- /.navbar-collapse -->
		</div><!-- /.container-fluid -->
	</nav>


	<div class=" row">
		<div class="  col-xs-offset-11 col-md-offset-11 col-lg-offset-11 navbar-fixed-top " id="panier" >
			<a href="panier.php" class="btn btn-social-icon btn-facebook" onclick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-facebook']);"> <i  class="fa fa-3x fa-shopping-cart"></i></a>
		</div>
	</div>
