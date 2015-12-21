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
						<li class="active"><a  href="${context}/Index"   role="button" aria-haspopup="true" aria-expanded="false">Accueil  <span class="sr-only">(current)</span></a></li>
						<li class=""><a href="${context}/admin/Voyages"  role="button" aria-haspopup="true" aria-expanded="false">Voyages</a></li>
						<li class=""><a href="${context}/admin/GestionContacts"  		role="button" aria-haspopup="true" aria-expanded="false">Contacts</a></li>
						<li class=""><a href="${context}/admin/Newsletters"  		role="button" aria-haspopup="true" aria-expanded="false">Newlettres</a></li>
						<li class=""><a href="${context}/admin/Clients"  		role="button" aria-haspopup="true" aria-expanded="false">Utilisateurs</a></li>
						<li class=""><a href="${context}/admin/Stat"  		role="button" aria-haspopup="true" aria-expanded="false">Statistique </a></li>
						
					</ul>
					


					<ul class="nav navbar-nav pull-right">



						<li class="dropdown" id="menuLogin">

	 <button class="dropdown-toggle    btn btn-warning fa fa-user" href="#" data-toggle="dropdown" id="menuLogin">Bienvenue 
								${sessionScope.sessionUtilisateur.login}


								
							</button>
							<div  class="dropdown-menu col-lg-8" style="padding:17px;">

								<div class="lienpc">
									<a href="${context}/admin/ModifInfoPerso"> Modifier votre compte </a>
								</div>
								
								<div class="lienpc">
									<a href="${context}/admin/Panier"> voir panier</a>
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

