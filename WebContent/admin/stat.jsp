<html><head>
		<title>Line Chart</title>
	<%@include file="header.jsp"%> <br>

</head>
<body>



	<%@include file="navadmin.jsp"%> 

<!-- ============================================  le contenu du site ==================================-->
<div class=" container  content-body">


<div class=" row" style =" margin-top: 53px;"
>
 <div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12 text-center">

						<h1 class="head1"> echelle selon l'age  </h1>
					</div>
	<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12 text-center  "  >




		<div style="width:30%">
			<div>
				<canvas id="canvas" height="298" width="398" style="width: 398px; height: 298px;"></canvas>
			</div>
		</div> 
		


	


 
	</div>
	<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12 text-center">

						<h1 class="head1"> echelle selon sex  </h1>
					</div>
	<div class=" col-lg-12 col-md-12 col-xs-12 col-sm-12 text-center  "  >


	<!-- 
	<div style="width:30%">
			<div>
				<canvas id="sex" height="298" width="398" style="width: 398px; height: 298px;"></canvas>
			</div>
		</div>
		</div> -->
</div>
</div>


	<%@include file="footer.jsp"%> <br>
	
	
	<!-- 
	 <script>
		
		var sex=${sex}
		var barChartData = {
			labels : ["Homme","Femme"],
			datasets : [
				
				{
					label: "My Second dataset",
					fillColor : "rgba(151,187,205,0.2)",
					strokeColor : "rgba(151,187,205,1)",
					pointColor : "rgba(151,187,205,1)",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "rgba(151,187,205,1)",
					data : sex
				}
			]

		}

	window.onload = function(){
		var ctx1 = document.getElementById("sex").getContext("2d");
		window.myLine = new Chart(ctx1).Bar(barChartData, {
			responsive: true
		});
	}


	</script>  -->
	
<script>
		var randomScalingFactor = function(){ return Math.round(Math.random()*100)};
		var nbInscri=${nbInscri}
	
		var lineChartData = {
			labels : ["10-20","21-30","31-40"],
			datasets : [
				
				{
					label: "My Second dataset",
					fillColor : "rgba(151,187,205,0.2)",
					strokeColor : "rgba(151,187,205,1)",
					pointColor : "rgba(151,187,205,1)",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "rgba(151,187,205,1)",
					data : nbInscri
				}
			]

		}

	window.onload = function(){
		var ctx = document.getElementById("canvas").getContext("2d");
		window.myLine = new Chart(ctx).Line(lineChartData, {
			responsive: true
		});
	}


	</script> 

</body>
</html>