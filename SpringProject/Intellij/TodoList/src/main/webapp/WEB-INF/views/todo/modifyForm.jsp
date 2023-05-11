<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오후 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Modify Todo</h1>
  <h3>${todo}</h3>
  <hr>
  <form method="post">
      tno <input type="text" name="tno" readonly><br>
      todo <input type="text" name="todo"><br>
      duedate <input type="date" name="duedate"><br>
      <input type="checkbox" name="complete"><br>
      <input type="reset"> <input type="submit" value="upDate">
  </form>

</body>
</html>
