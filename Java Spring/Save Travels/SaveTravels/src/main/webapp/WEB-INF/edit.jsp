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
   <h1>Edit Expense</h1>
   <form:form method="POST" action="/editExpense/${expense.id}" modelAttribute="expense">
    <input type="hidden" name="_method" value="put">
   <div>
    <div>
        <p><form:label path="name">name</form:label></p>
        <p><form:errors path="name"/><p>
        <p><form:input value="${expense.name}" path="name" /></p>
    </div>
    <div>
        <p><form:label path="vendor">vendor</form:label></p>
        <p><form:errors path="vendor"/><p>
        <p><form:input value="${expense.vendor}" path="vendor" /></p>
    </div>
        <div>
        <p><form:label path="amount">amount</form:label></p>
        <p><form:errors path="amount"/><p>
        <p><form:input value="${expense.amount}" path="amount" /></p>
    </div>
    <div>
        <p><form:label path="description">description</form:label></p>
        <p><form:errors path="description"/><p>
        <p><textarea rows="3" cols="15" name="description">${expense.description}</textarea></p>
        
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

