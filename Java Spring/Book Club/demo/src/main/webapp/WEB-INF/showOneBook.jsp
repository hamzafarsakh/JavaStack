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
<meta charset="ISO-8859-1">
<title>Insert title here</title>

    </head>
    <body>
     
        <a href="/logout">logout</a> ||
        <a href="/books">go back to the shelves</a>
	<h1> ${book1.title}</h1>

    <c:choose>
	<c:when test="${user_id == book1.getUser().id}">
		<p>you read ${book1.title} by ${book1.authar} </p>
        <p>here are your thoughts</p>
        <p>${book1.description}</p>
	</c:when>
	<c:otherwise>
		<p>${book1.getUser().userName} read ${book1.title} by ${book1.authar}</p>
        <p>here are ${book1.getUser().userName}thoughts</p>
        <p>${book1.description}</p>
        
	</c:otherwise>
</c:choose>


<c:choose>
	<c:when test="${user_id == book1.getUser().id}">
		<p><a href="/deleteBook/${book1.id}">delete the book</a> </p>
        <p><a href="/books/${book1.id}/edit">edit the book</a></p>
	</c:when>

</c:choose>

    
    
   
</body>
</html>