package firstweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
       

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		////////////////////
		//사용자 요청 처리
		String userid = request.getParameter("userid");
		System.out.println("사용자의 입력 id : " + userid);
		
		String password = request.getParameter("password");
		System.out.println("사용자의 입력 pw " + password);
		////////////////////
		//응답
		
		//body안의 데이터
		PrintWriter out = response.getWriter();
		out.println(" id : " + userid);
		out.println(" pw : " + password);
		out.close();
		
	}
	
	@Override
	protected void doPost(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		////////////////////
		//사용자 요청 처리
		String userid = request.getParameter("userid");
		System.out.println("사용자의 입력 id : " + userid);
		
		String password = request.getParameter("password");
		System.out.println("사용자의 입력 pw " + password);
		////////////////////
		//응답
		
		//body안의 데이터
		PrintWriter out = response.getWriter();
		out.println(" id : " + userid);
		out.println(" pw : " + password);
		out.close();
	}

}
