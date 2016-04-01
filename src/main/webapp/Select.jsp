<%@ page import="com.exam.test7.Select" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% String s = request.getParameter("selectTableName");%>
    <h1><%out.println(new Select().getSelect("exam", s));%></h1>
</body>
</html>
