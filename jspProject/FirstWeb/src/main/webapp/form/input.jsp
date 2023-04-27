<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>request : 사용자의 요청 내용을 저장하고 있는 객체</h1>
	<%=request.getRemoteAddr()%>
	<br> URL :
	<%=request.getRequestURL()%>
	<br> URI :
	<%=request.getRequestURI()%>
	<br> ContextPath :
	<%=request.getContextPath()%>
	<br>

	<h3> Cookie
		<%
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			out.print(c.getName() + "=" + c.getValue() + "<br>");
		}
		%>
	</h3>

	<h3>파라미터 데이터</h3>
	<%
	Enumeration<String> paramNames = request.getParameterNames();

	while (paramNames.hasMoreElements()) {
		String paramName = paramNames.nextElement();
		String value = request.getParameter(paramName);

		out.print("<h5>");
		out.print(paramName + "=" + value);
		out.print("</h5>");
	}
	%>
	
	<h3>헤더 정보</h3>
	<%
	Enumeration<String> headerNames = request.getHeaderNames();
	
	while(headerNames.hasMoreElements()){
		String name = headerNames.nextElement();
		String value = request.getHeader(name);
		out.print("<h5>");
		out.print(name + "=" + value);
		out.print("</h5>");
	}
	%>
</body>
</html>