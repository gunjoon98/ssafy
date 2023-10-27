<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../nav.jsp" %> 
	<h1>상품 정보 등록</h1>
	
	<form action="${root}/product/regist" method="POST">
		<label for="code">고유번호</label><br>
		<input type="text" name="code" id="code"/><br>
		<label for="model">모델</label><br>
		<input type="text" name="model" id="model"/><br>
		<label for="price">가격</label><br>
		<input type="text" name="price" id="price"/><br>
		<button>등록</button>
		<a href="${root}">취소</a>
	</form>
</body>
</html>