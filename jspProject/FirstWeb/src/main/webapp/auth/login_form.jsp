<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login_form</title>
</head>
<body>

	<h1>로그인</h1>
	<hr>
	<!-- 
		절대경로(서버 루트 경로 기준) : /web/auth/login.jsp
		상대경로(현재 파일기준) : login.jsp
	 -->
	<form action = "/web/login" method = "post">
		<table>
			<tr>
				<td>ID</td>
				<td><input name="userid"></td>
			</tr>

			<tr>
				<td>PW</td>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value = "login"></td>
			</tr>
		</table>
	</form>

</body>
</html>