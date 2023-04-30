<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<header>
        <h1>you need to collect ${goal}</h1>
        <h1>Your Gold: <span>${sum}</span></h1>
    </header>
    <main>
        <form action="/process_money" method="post">
            <h1>Farm</h1>
            <h3>(earns 10-20 Gold)</h3>
            <input type="hidden" name="which_form" value="1">
            <div><input type="submit" value="Find Gold!"></div>
        </form>

        <form action="/process_money" method="post">
            <h1>Cave</h1>
            <h3>(earns 5-10 Gold)</h3>
            <input type="hidden" name="which_form" value="2">
            <div><input type="submit" value="Find Gold!"></div>
        </form>

        <form action="/process_money" method="post">
            <h1>House</h1>
            <h3>(earns 2-5 Gold)</h3>
            <input type="hidden" name="which_form" value="3">
            <div><input type="submit" value="Find Gold!"></div>
        </form>

        <form action="/process_money" method="post">
            <h1>Quest</h1>
            <h3>(earns/take 0-50 Gold)</h3>
            <input type="hidden" name="which_form" value="4">
            <div><input type="submit" value="Find Gold!"></div>
        </form>

    </main>
    <footer>
        <h1>Activities:</h1>
        <div class="div" >
        
        <c:forEach var="i" items="${arr}">
    		
                <span class="<c:out value="${i.getColor()}"/>"><c:out value="${i.getPar()}"/><br></span>
           </c:forEach>
        </div>
    </footer>
</body>
</html>