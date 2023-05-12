<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오전 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Regist Todo</title>
    <h1>Regist Todo</h1>
    <hr>

    <form method="post">
        todo <input type="text" name="todo"><br>
        duedate <input type="date" name="duedate"><br>
        <input type="reset"> <input type="submit" value="Regist">
    </form>

    <%----%>
    <a href = "/todo/list">todo List</a>

</head>
<body>

</body>
</html>
