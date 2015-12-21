<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="style.css">
<title>Accueil</title>
</head>
<body class="body">
<%@include file="nav.jsp"%> <br>
	Accueil
	<br>
	<br> Tableau devises version JSTL : <br>
	<table border="1">
		<tr>
			<th>Code devise</th>
			<th>Libelle</th>
			<th>Code pays</th>
			<th></th>
		</tr>
		<c:forEach items="${liste2}" var="devise">
			<tr>
				<td><c:out value="${devise.code_d}" /></td>
				<td><c:out value="${devise.libelle}" /></td>
				<td><c:out value="${devise.code_pays}" /></td>

			</tr>
		</c:forEach>
	</table>
	<br> Nombre d'acces a l'espace securise : ${cookie.compteur.value}
</body>
</html>