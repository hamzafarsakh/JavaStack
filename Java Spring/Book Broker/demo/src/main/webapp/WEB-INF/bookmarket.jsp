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
          width: 70%;
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
          <h2>hello ${user.userName}</h2>
          <h1>Book borker</h1>
          <h3>available book to  borrow</h3>


           <table>
          <tr>
            <th>Id</th>
            <th>Title</th>
            <th>author</th>
            <th>userName</th>
            <td>action</td>
          </tr>

          <c:forEach var="book" items="${booksNotToken}">
          <tr>
            <td><c:out value="${book.id}"></c:out></td>
            <td><a href="/books/${book.id}/edit"><c:out value="${book.title}"></c:out></a></td>
            <td><c:out value="${book.author}"></c:out></td>
            <td><c:out value="${book.user.userName}"></c:out></td>
            
            <c:if test = "${book.user.id==user_id}">
              <td><a href="/books/${book.id}/edit">edit</a>  <a href="/delete/${book.id}">delete</a></td>
            </c:if>
            <c:if test = "${book.user.id!=user_id}">
              <td><a href="/borrow/${book.id}">borrow</a></td>
            </c:if>
            
          </tr>
            </c:forEach>
        
        
          
        </table>

        <h2>books im borrowing</h2>
                  
        <table>
          <tr>
            <th>Id</th>
            <th>Title</th>
            <th>author</th>
            <th>userName</th>
            <td>action</td>
          </tr>

          <c:forEach var="book" items="${myFavBooks}">
          <tr>
            <td><c:out value="${book.id}"></c:out></td>
            <td><a href="/books/${book.id}/edit"><c:out value="${book.title}"></c:out></a></td>
            <td><c:out value="${book.author}"></c:out></td>
            <td><c:out value="${book.user.userName}"></c:out></td>
            <td><a href="/return/${book.id}">return</a></td>
          </tr>
            </c:forEach>
        
        
          
        </table>
</body>
</html>

