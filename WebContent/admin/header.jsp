

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
    
    
	<meta charset="utf-8">

	<meta name="format-detection" content="telephone=no" />
	<link rel="shortcut icon" href="${context}images/levoyageur.ico">

	<link rel="stylesheet" href="${context}/css/bootstrap.min.css">
	<link rel="stylesheet" href="${context}/css/font-awesome.css">
	<link rel="stylesheet" href="${context}/css/font-awesome.4.4.css">
	<link rel="stylesheet" href="${context}/css/voyageur.css">

	<link rel="stylesheet" type="text/css" href="${context}/css/dataTables.bootstrap.min.css">
	<style type="text/css" class="init">
	
	</style>

<script src="/LeVoyageur/js/Chart.js"></script>
	
  <script type="text/javascript" language="javascript" src="${context}/js/jquery-1.11.3.min.js">
	</script>
	<script type="text/javascript" language="javascript" src="${context}/js/jquery.dataTables.min.js">
	</script>
	<script type="text/javascript" language="javascript" src="${context}/js/dataTables.bootstrap.min.js">
	</script>
	
	
  <script type="text/javascript" language="javascript" src="${context}/js/bootstrap.min.js"></script>
<script type="text/javascript" class="init">
	
$(document).ready(function() {
	$('#example').DataTable();
} );

	</script>

    