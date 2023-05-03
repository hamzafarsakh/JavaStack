


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
   <h1>Edit Burger</h1>
   
<form:form method="POST" action="/updateBurger/${burger.id}" modelAttribute="burger">
 <input type="hidden" name="_method" value="put">


   <div>
    <div>
        <p><form:label path="burgerName">burgerName</form:label></p>
        <p><form:errors path="burgerName"/><p>
        <p><form:input value="${burger.burgerName}" path="burgerName" /></p>
    </div>
    <div>
        <p><form:label path="restName">restName</form:label></p>
        <p><form:errors path="restName"/><p>
        <p><form:input value="${burger.restName}" path="restName" /></p>
    </div>
    <div>
        <p><form:label path="rating">rating</form:label></p>
        <p><form:errors path="rating"/><p>
        <p><form:input value="${burger.rating}" path="rating" /></p>
    </div>
    <div>
        <p colspan="2">
            <input type="submit" value="Submit"/>
        </p>
    </div>
</div>  
</form:form>
</body>
</html>

