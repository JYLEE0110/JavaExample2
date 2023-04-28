<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.red{
	color : red;
}
</style>
</head>
<body>


	<c:forEach var="member" items="${members}" >
	
	<c:out value="${member.name}" escapeXml="false"> 
	<span class = "red">이름없음</span>
	</c:out>
	
	${member.name} 
	<br>
	</c:forEach>

<hr>

	${members[0]} <br>
	${members[1]} / ${members[1].name}<br>
	
	<c:out value="${members[0].name}"></c:out> <br>
	<c:out value="${members[1].name}" escapeXml="FALSE">
		<span class = "red">이름 입력값 없음</span>
	</c:out> <br>
	
	
	<c:out value="${members[2].name}" escapeXml="FALSE">
		<span class = "red">이름 입력값 없음</span>
	</c:out> <br>
	
	
	${members[2]} <br>
	${members[3]} <br>
	${members[4]} <br>
	${members[5]} <br>
	${members[6]} <br>
	${members[7]} <br>
	${members[8]} <br>
	${members[9]} <br>
	
	<hr>
	
	${members}
</body>
</html>