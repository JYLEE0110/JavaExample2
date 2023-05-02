
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>TodoRead</h1>

		Number : <input type ="text" name = "no" value = "${todo.tno}" readonly> <br>
		Todo : <input type ="text" name = "todo" value = "${todo.todo}" readonly> <br>
		Date : <input type ="date" name = "duedate" value = "${todo.duedate}" readonly> <br>
		Completed : <input type ="checkbox" name = "complete" ${todo.finished ? 'checked' : ''}><br>
		<!-- checkbox value => "on -->
		<a href = "modify?no=${todo.tno}">Modify</a><br>
		<!-- <a href ="delete?no=${no}">Delete</a> -->

		
		<form action="delete" method="post">
			<input type="hidden" name = "no" value = "${todo.tno}">
			<input type = "submit" value="Delete">
		</form>
</body>
</html>