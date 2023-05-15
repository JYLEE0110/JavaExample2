<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-15
  Time: 오전 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fileUpload</title>
</head>
<body>

    <h1>CompleteFileUpload 3(Command)</h1>
    <hr>
    <h3>
        이름 : ${report.sname}  <br>
        학번 : ${report.snum}  <br>
        파일이름 : ${report.report.originalFilename}  <br>
        <hr>
        First report : Command Object / <br>
        Second : report getReport() / <br>
        Third : getOriginalFilename()
    </h3>

    <img src="/uploadFile/report/${report.report.originalFilename}">
    <%--http://localhost:8080/uploadFile/report/파일이름.jsp--%>
</body>
</html>
