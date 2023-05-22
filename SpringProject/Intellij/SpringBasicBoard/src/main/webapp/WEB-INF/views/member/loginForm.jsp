<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-22
  Time: 오후 4:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginPage</title>
</head>
<body>

    <h1>LoginPage</h1>
    <hr>

    <form method="post">
        <table>
        <tr>
            <td>아이디</td>
            <td><input type="text" name="uid"></td>
        </tr>

        <tr>
            <td>패스워드</td>
            <td><input type="password" name="pw"></td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Login"></td>
        </tr>
        </table>
    </form>



</body>
</html>
