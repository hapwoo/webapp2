<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/main.css">
	</head>

	<body>
		<div class="wrap">
			<jsp:include page="/WEB-INF/views/include/header.jsp"/>
			
			<div class="mainCenter">
		
				<jsp:include page="/WEB-INF/views/include/menu.jsp"/>
			
				<div class="content">
					<div class="sector">
						<h5>이브이 진화시키기</h5>
						<h4>이브이에게 어떤 돌을 줄까요?</h4>
						
						<div>
							<a href="javascript:water()"><img src="<%=application.getContextPath()%>/resources/img/stone_water.png"/></a>
							<a href="javascript:thunder()"><img src="<%=application.getContextPath()%>/resources/img/stone_thunder.png"/></a>
							<a href="javascript:fire()"><img src="<%=application.getContextPath()%>/resources/img/stone_fire.png"/></a>
							<a href="javascript:grass()"><img src="<%=application.getContextPath()%>/resources/img/stone_grass.png"/></a>
							<a href="javascript:ice()"><img src="<%=application.getContextPath()%>/resources/img/stone_ice.png"/></a>
						</div>
						<script type="text/javascript">
							function water() {
								$.ajax({
									url: "water",
									method: "post",
									success: function(data) {
										$("#eevee").html(data);
									}
								});
							};
							function thunder() {
								$.ajax({
									url: "thunder",
									method: "post",
									success: function(data) {
										$("#eevee").html(data);
									}
								});
							};
							
							
							function fire() {
								$.ajax({
									url: "fire",
									method: "post",
									success: function(data) {
										$("#eevee").html(data);
									}
								});
							};
							
							function grass() {
								$.ajax({
									url: "grass",
									method: "post",
									success: function(data) {
										$("#eevee").html(data);
									}
								});
							};
							
							function ice() {
								$.ajax({
									url: "ice",
									method: "post",
									success: function(data) {
										$("#eevee").html(data);
									}
								});
							};
							
						
						</script>
						
						<div id="eevee"><img src="<%=application.getContextPath()%>/resources/img/eevee.png" width="200px"/></div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>