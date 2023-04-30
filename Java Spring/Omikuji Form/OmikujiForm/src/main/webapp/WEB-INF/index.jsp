<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style1.css" type="text/css">
</head>
<body>
    <h1>Send a Omikuji</h1>
    <form action="/form" method="post">
        <select name="num" >
            Pick any number from 5 to 25
            <% for(int i = 5; i<26;i++){ %>
            <option value="<%=i %>"><%=i %></option>
            <% } %>
        </select>
        <p>Enter the name of any city <input type="text" name="city"></p>
        <p>Enter the name of any real person <input type="text" name="name"></p>
        <p>Enter professional endeavor or hobby <input type="text" name="hobby"></p>
        <p>Enter any type of any living thing <input type="text" name="animal"></p>
        <p>Say something nice to someone <textarea name="textarea" cols="30" rows="4"></textarea></p>
        <input type="submit" value="send">
    </form>
</body>
</html>