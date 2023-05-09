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
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <a href="/show">home</a>
    <h1>categories</h1>
    <c:forEach items="${catForProduct1}" var="categorie1">
                     <li>${categorie1.name}</li>
              
              </c:forEach>  
    <h1>add new product </h1>
    <form action="/products/${product1.id}" method="post">


        <p>
            <label for="categorie1" class="form-label">select  categorie</label>
            <select name="categorieId">
              <c:forEach items="${catNotInProduct1}" var="categorie1">
                <option value="${categorie1.id}">
                    ${categorie1.name}
                </option>
              
              </c:forEach>  
      
            </select>
        </p>
        <input type="submit" value="Submit"/>
    </form>
</body>
</html>

