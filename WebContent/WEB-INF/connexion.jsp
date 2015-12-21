
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Connexion</title>
        
    <link href="css/bootstrap.min.css" rel="stylesheet">

   
    <!-- Custom styles for this template -->
    <link href="css/sigin.css" rel="stylesheet">

	<meta name="format-detection" content="telephone=no" />
	<link rel="shortcut icon" href="${context }/images/levoyageur.ico">

	<link rel="stylesheet" href="${context }/css/bootstrap.min.css">
	<link rel="stylesheet" href="${context }/css/font-awesome.css">
	<link rel="stylesheet" href="${context }/css/font-awesome.4.4.css">
	<link rel="stylesheet" href="${context }/css/voyageur.css">


<script src="js/jquery.js"></script>
<!-- Preloader -->



<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>


    </head>
    <body>
     <div class="container-fluid">
        <form class="form-signin" method="post" action="Connexion">
            
                <h2 class="form-signin-heading">Connectez-Vous  </h2>
        <label for="inputEmail" class="sr-only">Log in </label>
        
        
                <input type="text" id="inputEmail" class="form-control"  placeholder="log-in" required="" autofocus="" name="login" value="<c:out value="${utilisateur.login}"/>" size="20" maxlength="60" />

                <span class="erreur">${service.erreurs['login']}</span>
                

                  <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="inputPassword" class="form-control"  placeholder="Password" required=""  name="pwd" value="" size="20" maxlength="20" />
                <span class="erreur">${service.erreurs['mdp']}</span>


                <button class="btn btn-lg btn-warning btn-block" type="submit">Sign in</button>
   
                
                <p class="${empty service.erreurs ? 'succes' : 'erreur'}">${service.message}</p>
                
               
                

            
        </form>
        <div class="form-signin"><%@include file="inscription.jsp"%> 
        </div>
        </div>



    </body>
    
    
</html>