<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-16
  Time: 오후 4:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RegistForm</title>
</head>
<body>

  <h1>Regist Dept</h1>
  <hr>
  <form method="post">
    <table>

      <tr>
        <td>부서 이름 : </td>
        <td><input type="text" name="dname"></td>
      </tr>

      <tr>
        <td>부서 위치 : </td>
        <td><input type="text" name="loc" required></td>
      </tr>

      <tr>
        <td><input type="submit" value="Submit"></td>
      </tr>

    </table>
  </form>

</body>
</html>
