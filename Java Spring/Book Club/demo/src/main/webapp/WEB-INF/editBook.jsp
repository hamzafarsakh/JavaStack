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
   <h1>update a book to your shelf!</h1>
   <a href="/books">go back to the shelves</a>
	<form:form action="/books/${book1.id}/edit" method="post" modelAttribute="book">

        <input type="hidden" name="_method" value="put">
        <form:input type="hidden" path="user" value="${user_id}" class="form-control" />
        <div class="form-group">
            <form:label path="title">title :</form:label>
            <form:input path="title" value="${book1.title}" class="form-control" />
            <form:errors path="title" class="text-danger" />
        </div>
        <div class="form-group">
            <form:label path="authar">authar:</form:label>
            <form:input path="authar" value="${book1.authar}" class="form-control" />
            <form:errors path="authar" class="text-danger" />
        </div>
        <div class="form-group">
            <label>description:</label>
            <form:input path="description" value="${book1.description}" class="form-control" />
            <form:errors path="description" class="text-danger" />
        </div>
        <input type="submit" value="update" class="btn btn-primary" />
    </form:form>
    

</body>
</html>

