<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

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
			<%--공통 헤더--%>
			<jsp:include page="/WEB-INF/views/include/header.jsp"/>
			
			<%--내용--%>
			<div class="mainCenter">
					<%--공통메뉴--%>
					<jsp:include page="/WEB-INF/views/include/menu.jsp"/>
					
					<div class="content">
							<div class="sector">
								<h5>EL로 스칼라값 (숫자, 문자열, 논리값 ) 읽기</h5>
								<div>
									<div>이름 : ${name}</div>
									<div>나이 : ${age}</div>
									<div>직업 : ${job}</div>
								</div>
							</div>
							<div class="sector">
								<h5>EL로 객체의 데이터 읽기</h5>
								<div>
									<div>이름 : ${pocketmonBook.name}</div>
									<div>속성 : ${pocketmonBook.personality}</div>
									<div>나이 : ${pocketmonBook.age}</div>
									<div>생일 : ${pocketmonBook.birthday}</div>
								</div>
							</div>
							
							<div class="sector">
								<h5>EL로 객체의 데이터 읽기</h5>
								<div>
									<table style="width:auto;" class="table table-sm table-bordered">
										<tr>
											<th>이름</th>
											<th>속성</th>
											<th>나이</th>
											<th>생일</th>
										</tr>
										<c:forEach var="pocketmon" items="${pocketmonList}">
											<tr>
												<td>${pocketmon.name}</td>
												<td>${pocketmon.personality}</td>
												<td>${pocketmon.age}</td>
												<td><fmt:formatDate value="${pocketmon.birthday}" pattern="yyyy-MM-dd"/></td>
											</tr>
										</c:forEach>
									</table>
								
								</div>
								
							</div>
					</div>
			</div>
		</div>
	</body>
</html>