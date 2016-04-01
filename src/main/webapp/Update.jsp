<%@ page import="com.exam.test7.Update" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% String s = request.getParameter("updateTableName");%>
    <h1><%out.println(new Update().getUpdate("exam", s));%></h1>
</body>
</html>
