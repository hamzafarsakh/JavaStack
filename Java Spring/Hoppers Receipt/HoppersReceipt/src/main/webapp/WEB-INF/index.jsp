<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>Customer Name: <c:out value="${name}"/></div>
<div>Item Name: <c:out value="${itemName}"/></div>
<div>Price: <c:out value="${price}"/></div>
<div>Description: <c:out value="${description}"/></div>
<div>Vendor: <c:out value="${vendor}"/></div>
</body>
</html>