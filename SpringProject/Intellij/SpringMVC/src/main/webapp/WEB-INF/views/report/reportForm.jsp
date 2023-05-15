<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-15
  Time: 오전 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FileUpload</title>
</head>
<body>
    <h1>SubmitExample 1(RequestParam)</h1>
    <hr>
    <%--  --%>
    <form action="/report/submit1" method="post" enctype="multipart/form-data">
        학번 : <input type="text" name="snum"><br> 
        이름 : <input type="text" name="sname"><br>
        파일 : <input type="file" name="report"><br>
        <input type="submit" value="Submit">
    </form>

    <hr>

    <h1>SubmitExample 2(MultipartHttpServletRequest)</h1>
    <hr>
    <form action="/report/submit2" method="post" enctype="multipart/form-data">
        학번 : <input type="text" name="snum"><br>
        이름 : <input type="text" name="sname"><br>
        파일 : <input type="file" name="report"><br>
        <input type="submit" value="Submit">
    </form>

    <hr>

    <h1>SubmitExample 3(Command)</h1>
    <hr>
    <form action="/report/submit3" method="post" enctype="multipart/form-data">
        학번 : <input type="text" name="snum"><br>
        이름 : <input type="text" name="sname"><br>
        파일 : <input type="file" name="report"><br>
        <input type="submit" value="Submit">
    </form>



</body>
</html>
