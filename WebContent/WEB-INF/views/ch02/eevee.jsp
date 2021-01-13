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
		<link rel="stylesheet" href="/webapp2/resources/css/main.css">
	</head>

	<body>
		<div class="wrap">
			<jsp:include page="/WEB-INF/views/include/header.jsp"/>
			
			<div class="mainCenter">
		
				<jsp:include page="/WEB-INF/views/include/menu.jsp"/>
			
				<div class="content">
					<div class="sector">
						<h5>요청 맵핑</h5>
						<div>
							<a class="btn btn-info btn-sm" href="request1">request1 요청</a>
							<a class="btn btn-info btn-sm" href="request2">request2 요청</a>
							<a class="btn btn-info btn-sm" href="dahye">나는 짱이야</a>
							<a class="btn btn-info btn-sm" href="goodjob">꼬부기</a>
							<a class="btn btn-outline-primary btn-sm" href="">이브이 키우기</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>