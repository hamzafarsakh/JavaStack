


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
   <table>
  <tr>
    <th>Burger Name</th>
    <th>Restaurant Name</th>
    <th>rating(out of 5)</th>
    <th>Action</th>
  </tr>

  <c:forEach var="burger1" items="${burgers}">
  <tr>
        
    <td><c:out value="${burger1.burgerName}"></c:out></td>
    <td><c:out value="${burger1.restName}"></c:out></td>
    <td><c:out value="${burger1.rating}"></c:out></td>
    <td><a href="/burgers/edit/<c:out value="${burger1.id}"></c:out>">edit</a></td>
    
  </tr>
    </c:forEach>


  
</table>

<form:form method="POST" action="/addBurger" modelAttribute="burger">
   <div>
    <div>
        <p><form:label path="burgerName">burgerName</form:label></p>
        <p><form:errors path="burgerName"/><p>
        <p><form:input path="burgerName" /></p>
    </div>
    <div>
        <p><form:label path="restName">restName</form:label></p>
        <p><form:errors path="restName"/><p>
        <p><form:input path="restName" /></p>
    </div>
    <div>
        <p><form:label path="rating">rating</form:label></p>
        <p><form:errors path="rating"/><p>
        <p><form:input path="rating" /></p>
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

