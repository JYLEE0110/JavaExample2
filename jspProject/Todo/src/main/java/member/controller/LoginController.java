package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.domain.MemberDTO;
import member.service.MemberLoginService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	
	MemberLoginService loginService;
	
	public LoginController() {
		this.loginService = new MemberLoginService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginController...doGet()...");
		String viewPath = "/WEB-INF/views/member/loginForm.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("LoginController...doPost()...");
		
		//사용자가 입력한 id/pw 받아서 인증처리		
		String mid = request.getParameter("mid");
		String pw = request.getParameter("pw");
		String reid = request.getParameter("reid");
		
		//현재 세션 정보 획득
		HttpSession session = request.getSession();
		
		
		// 인증처리 : id pw 같은 문자열 일때 인증되었다!
		// 인증처리 : id, pw값을 service로 전달 -> dao 전달해서 MemberDTO 객체를 반환

		// 1. loginService.login(mid, pw) => 입력폼에서 입력한 id와 pw를 인자값으로 넘김
		// 2. Service => DAO 에서 select하여 결과값 (idx, uname, 등)을 memberDTO 객체 반환
		// 3. member.getIdx / member.getUid.. 로 데이터 출력 할 수 있다.
		
		MemberDTO member = loginService.login(mid, pw);
		
		//			MemberDTO => null이면 회원이 아니다./ null이 아니면 회원이다. -> 로그인 처리
		if(member != null) {
			
			// 회원이다!!! -> HttpSession 객체에 회원정보를 저장			
			// 저장된 회원 정보는 회원이 로그인 했는지 판단 기준으로 사용
			session.setAttribute("loginInfo", member);
			
			// reid 값이 on이면 쿠키 저장
			if(reid != null && reid.equals("on")) {
				Cookie cookie = new Cookie("reid", mid);
				cookie.setMaxAge(60*60*24*180);
				cookie.setPath("/");
				response.addCookie(cookie);	
			}else {
				Cookie cookie = new Cookie("reid", "aa");
				cookie.setMaxAge(0);
				cookie.setPath("/");
				response.addCookie(cookie);
			}
			
			// reid 값이 on이면 Cookie 저장
			
			System.out.println("Complete Login!!");			
			response.sendRedirect("todo/list");
//			return;
		}else {
			System.out.println("Fail Authentication");
			response.sendRedirect("login");
		}

		
	}

}
