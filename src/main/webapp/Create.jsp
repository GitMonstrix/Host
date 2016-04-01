<%@ page import="com.exam.test7.Create" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<% String s = request.getParameter("tableName");%>
    <h1><%out.println(new Create().getCreate("exam", s));%></h1>
</body>
</html>
