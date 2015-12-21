Menu Client: <br>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="context" value="${pageContext.request.contextPath}" />
<script src="${context}/themes/js/jquery.js"></script>

<a href="${context}/admin/EnvoiContact">Contactez-nous</a> <br>
<a href="${context}/admin/Contacts?id=${sessionScope.sessionUtilisateur.idClient}">Voir contacts/réponses</a> <br>
<a href="${context}/Deconnexion">Deconnexion</a>