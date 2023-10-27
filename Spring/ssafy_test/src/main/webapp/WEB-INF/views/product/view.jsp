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
	<h1>상품 목록</h1>
	<table>
		<tr>
			<th>코드</th>
			<th>모델</th>
			<th>가격</th>
		</tr>
		<tr>
			<th>${product.code}</th>
			<th>${product.model}</th>
			<th>${product.price}</th>
		</tr>
	</table>
	<a href="${root}/product/delete?code=${product.code}">삭제</a>
</body>
</html>