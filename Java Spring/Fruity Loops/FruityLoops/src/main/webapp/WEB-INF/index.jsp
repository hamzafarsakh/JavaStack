
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<h1>Fruit Store</h1>
<table>
	<tr>
		<th>name</th>
		<th>price</th>
	</tr>
	 <c:forEach var="fruit" items="${fruits}">
	<tr>
		<td><c:out value="${fruit.name}"></c:out></td>
		<td><c:out value="${fruit.price}"></c:out></td>
	</tr>
    </c:forEach>
</table>
</body>
</html>