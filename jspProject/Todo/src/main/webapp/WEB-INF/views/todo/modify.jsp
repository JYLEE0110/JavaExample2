
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>TodoModify (${loginInfo.uid} [${loginInfo.uname}])</h1>
	<form method = "post">
		Number : <input type ="text" name = "no" value = "${todo.tno}" readonly> <br>
		Todo : <input type ="text" name = "todo" value = "${todo.todo}" > <br>
		Date : <input type ="date" name = "duedate" value = "${todo.duedate}" > <br>
		Completed : <input type ="checkbox" name = "complete" ${todo.finished ?'checked' : ''}><br>
		<input type ="reset" value="reset"> <input type ="submit" value="modify">
	</form>
</body>
</html>