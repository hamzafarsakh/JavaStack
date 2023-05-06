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
<h1>Save Travels</h1>
<h2>HTML Table</h2>

<table>
  <tr>
    <th>expenses</th>
    <th>vendor</th>
    <th>amount</th>
    <th>actions</th>
  </tr>
  
  <c:forEach var="one" items="${all}">
  <tr>
    <td>${one.name}</td>
    <td>${one.vendor}</td>
    <td>${one.amount}</td>
    <td><a href="/edit/${one.id}">edit</a>  	<a href="/delete/${one.id}">delete</a></td>
  </tr>
</c:forEach>
  
</table>
   
   <h1>add an expense</h1>
   <form:form method="POST" action="/addExpense" modelAttribute="expense">
   <div>
    <div>
        <p><form:label path="name">name</form:label></p>
        <p><form:errors path="name"/><p>
        <p><form:input path="name" /></p>
    </div>
    <div>
        <p><form:label path="vendor">vendor</form:label></p>
        <p><form:errors path="vendor"/><p>
        <p><form:input path="vendor" /></p>
    </div>
        <div>
        <p><form:label path="amount">amount</form:label></p>
        <p><form:errors path="amount"/><p>
        <p><form:input path="amount" /></p>
    </div>
    <div>
        <p><form:label path="description">description</form:label></p>
        <p><form:errors path="description"/><p>
        <p><textarea rows="3" cols="15" name="description"></textarea></p>
        
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

