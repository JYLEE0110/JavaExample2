<%@page import="product.Product"%>
<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
   request.setAttribute("name", "이주용");
   session.setAttribute("name2", "신보경");
   
   Member member = new Member();
   member.setId("Cool");
   member.setPw("1234");
   member.setName("JY LEE");
   
   session.setAttribute("member", member);
   session.setAttribute("product", new Product());
   
   
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h4>
		가격 : ${product.price}<br>
		첫번쨰 제품 : ${product.list[0]} / ${product.info}
	</h4>
	
	<h4>
		${sessionScope.member}<br>
		${member}
	</h4>

	<h4>
		${member.id} / ${member.pw} / ${member.name} / ${member.info}
	</h4>

	<h4>
		${100+10} / ${10 mod 3} / ${10 eq 10} / ${'aaa' eq 'aaa' and '1' eq '1'}
	</h4>

	<h4>
		${true} / ${false} / ${100} / ${3.14} / ${'이주용'} / ${null}
	</h4>

	<h4>
		표현식 : <%= request.getAttribute("name") %>
	</h4>
	
	<h4>
		표현언어 : ${requestScope.name} / ${name2}
	</h4>
	
	<h4>
	<a = href ="${pageContext.request.requestURL}?param=100">link</a> <br>
	${pageContext.request.requestURL} <br>
	${pageContext.request.requestURI} <br>
	${pageContext.request.contextPath} <br>
	<%= request.getContextPath() %>
	</h4>


</body>
</html>