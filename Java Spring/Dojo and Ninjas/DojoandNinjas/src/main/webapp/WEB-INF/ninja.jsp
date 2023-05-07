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
   <h1>New Ninja</h1>
   <form:form method="POST" action="/ninjas/new" modelAttribute="ninja">
    <div>
        <p><form:label path="dojo">dojo</form:label></p>
     <form:select path="dojo" >
        <c:forEach var="dojo1" items="${dojos1}">
            <option value="${dojo1.id}">${dojo1.name}</option>
        </c:forEach>
     </form:select>
     <div>
         <p><form:label path="fname">first name</form:label></p>
         <p><form:errors path="fname"/><p>
         <p><form:input path="fname" /></p>
     </div>
     <div>
        <p><form:label path="lname">last name</form:label></p>
        <p><form:errors path="lname"/><p>
        <p><form:input path="lname" /></p>
    </div>
    <div>
        <p><form:label path="age">age </form:label></p>
        <p><form:errors path="age"/><p>
        <p><form:input path="age" /></p>
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

