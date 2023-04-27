<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	// 로그인 여부 확인 후 리디렉션처리
	// getAttribute는 Object타입이므로 String으로 형변환
	String userid = (String)session.getAttribute("loginCheck");
	
	if(userid==null){
		response.sendRedirect("login_form.jsp");
	}
	%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
h1 {
	text-align: center;
}
</style>
<body>

	<h1>MyPage</h1>
	<%= application.getAttribute("cnt") %>
	
	<a href ="logout.jsp">로그아웃</a>

</body>
</html>