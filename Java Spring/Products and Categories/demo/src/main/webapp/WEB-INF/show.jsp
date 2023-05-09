<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ssss</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <h1>home Page</h1>
    <div><a href="/products/new">new product</a><a href="/categories/new">new categorie</a></div>
    <div>
        
        <h2>products</h2>

        
        <ul>
            <c:forEach var="Produc" items="${allProducts}">
                <li><a href="/products/${Produc.id}"><c:out value="${Produc.name}"/></a></li>
            </c:forEach>
        </ul>

        <h2>categories</h2>
        <ul>
            <c:forEach var="Categori" items="${allCategories}">
                <li><a href="/categories/${Categori.id}"><c:out value="${Categori.name}"/></a></li>
            </c:forEach>
        </ul>
    </div>
</body>
</html>

