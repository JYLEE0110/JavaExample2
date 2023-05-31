<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<%
	String uid = request.getParameter("uid");

	if(uid !=null && uid.equals("test")){
		// 아이디가 중복 => 사용 불가
		out.print("N");
	}else if(uid != null && !uid.equals("test")){
		out.print("Y");
	}else{
		out.print("N");
	}
%>