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
						<h5>GET 방식 데이터 전달</h5>
						<div>
							<a class="btn btn-info btn-sm" href="method1?param1=안녕?&param2=5&param3=2020-02-02">전달</a>
						</div>
					</div>
					<div class="sector">	
						<h5>POST 방식 데이터 전달</h5>
						<div>
							<form method="post" action="method2">
								<input type="text" name="param1" value="잘가"/><br/>
								<input type="number" name="param2" value="67764745"/><br/>
								<input type="date" name="param3" value="1994-09-01"/><br/>
								<button class="btn btn-info btn-sm">전달</button>
							</form>
						</div>
					</div>
					<div class="sector">	
						<h5>디폴트값</h5>
						<div>
							<form method="post" action="method3">
								<input type="text" name="param1" value="잘가"/><br/>
								<input type="number" name="param2" value="67764745"/><br/>
								<input type="date" name="param3" value="1994-09-01"/><br/>
								<button class="btn btn-info btn-sm">전달</button>
							</form>
						</div>
					</div>
					<div class="sector">
						<h5>객체로 받기</h5>
						<div>
							<form method="post" action="method4">
								<input type="text" name="param1" value="잘가"/><br/>
								<input type="number" name="param2" value="67764745"/><br/>
								<input type="date" name="param3" value="1994-09-01"/><br/>
								<button class="btn btn-info btn-sm">전달</button>
							</form>
						</div>
					</div>
					
				</div>
			</div>
		</div>
	</body>
</html>