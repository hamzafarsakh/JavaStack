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
<style>
    table {
      font-family: arial, sans-serif;
      border-collapse: collapse;
      width: 100%;
    }
    
    td, th {
      border: 1px solid #dddddd;
      text-align: left;
      padding: 8px;
    }
    
    tr:nth-child(even) {
      background-color: #dddddd;
    }
    </style>
    </head>
    <body>
     
	<h1>Welcome ${thisUser.userName}</h1>

    <a href="/logout">logout</a>

    
    <table>
      <tr>
        <th>id</th>
        <th>title</th>
        <th>authar name</th>
        <th>posted by</th>
      </tr>
        <c:forEach var="book1" items="${books1}">
        <tr>
            <td>${book1.id}</td>
            <td> <a href="/books/${book1.id}">${book1.title}</a></td>
            <td>${book1.authar}</td>
            <td>${book1.getUser().userName}</td>
        </tr>
</c:forEach>
      
    </table>
   
</body>
</html>