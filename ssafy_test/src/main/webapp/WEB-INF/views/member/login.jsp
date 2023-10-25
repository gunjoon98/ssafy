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
	<h1>로그인 페이지</h1>
	
	<form action="${root}/member/login" method="POST">
		<label for="id">아이디</label><br>
		<input type="text" name="memberId" id="id"/><br>
		<label for="password">패스워드</label><br>
		<input type="text" name="password" id="password"/><br>
		<button>로그인</button>
		<a href="${root}">취소</a>
	</form>
</body>
</html>