<% Class.forName("org.postgresql.Driver");%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Тестовое задание</h1>

<form action="Create.jsp">
    Таблица: <input type="text" name="tableName" size="10"><br>
    <p>
    <table>
        <tr>
            <th>
                <small>
                    <input type="submit" name="createTable" value="Создать таблицу">
                </small>
    </table>
</form>
<form action="Select.jsp">
    Таблица: <input type="text" name="selectTableName" size="10"><br>
    <p>
    <table>
        <tr>
            <th>
                <small>
                    <input type="submit" name="selectTable" value="Выбрать таблицу">
                </small>
    </table>
</form>
<form action="Update.jsp">
    Таблица: <input type="text" name="updateTableName" size="10"><br>
    <p>
    <table>
        <tr>
            <th>
                <small>
                    <input type="submit" name="updateTable" value="Обновить таблицу">
                </small>
    </table>
</form>
</body>
</html>
