<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact</title>
</head>
<body>
	<fieldset>
		<legend>Contactez-nous</legend>
		<form method="post" action="EnvoiContact?id=${sessionScope.sessionUtilisateur.idClient}">
			Objet : <input type="text" name="objet" /><br> Sujet :
			<textarea name="sujet"></textarea>
			<br> <input type="submit" value="Envoyez" />
		</form>
	</fieldset>
</body>
</html>