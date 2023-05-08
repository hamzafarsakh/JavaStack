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
   <h1>add a book to your shelf!</h1>
   <a href="/books">go back to the shelves</a>
	<form:form action="/books/new" method="post" modelAttribute="book">
        <form:input type="hidden" path="user" value="${user_id}" class="form-control" />
        <div class="form-group">
            <label:input path="title">title :</label>
            <form:input path="title" class="form-control" />
            <form:errors path="title" class="text-danger" />
        </div>
        <div class="form-group">
            <label:input path="authar">authar:</label>
            <form:input path="authar" class="form-control" />
            <form:errors path="authar" class="text-danger" />
        </div>
        <div class="form-group">
            <label>description:</label>
            <form:input path="description" class="form-control" />
            <form:errors path="description" class="text-danger" />
        </div>
        <input type="submit" value="create" class="btn btn-primary" />
    </form:form>
    

</body>
</html>

