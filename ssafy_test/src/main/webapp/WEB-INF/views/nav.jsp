<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li><a href="${pageContext.request.contextPath}/product/list">상품 목록</a></li>
		<li><a href="${pageContext.request.contextPath}/product/regist">상품 등록</a></li>
		<c:if test="${ empty sessionScope.userinfo }">
			<li><a href="${pageContext.request.contextPath}/member/login">로그인</a></li>
		</c:if>
		<c:if test="${ not empty sessionScope.userinfo }">
			<li><a href="${pageContext.request.contextPath}/member/logout">로그아웃</a></li>
		</c:if>
	</ul>
</body>
</html>