package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/todo/*")
public class LoginCheckFilter extends HttpFilter implements Filter {
       

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("LoginCheckFilter...doFilter()...");
		
		
		// 회원의 로그인 여부를 확인 후 비로그인 상태 -> 로그인페이지로 이동
		HttpSession session = ((HttpServletRequest)request).getSession();

		// 1. session이 새로만들어진 세션이 아니고, 세션에 로그인 정보를 가지고 있다면 => 로그인 상태
		// 리디렉션 => 로그인페이지
		// 2. 새로만들어진 세션이거나 세션에 로그인 정보가 없다면

		if (session.isNew() || session.getAttribute("loginInfo") == null) {
			System.out.println("Not State Login!!");

			// 로그인페이지로 Redirection
			// 경로가 /todo/ 가 붙어있으므로 /app으로 설정 해줘야함
			((HttpServletResponse)response).sendRedirect("/app/index.jsp");

			return;
		}
		
		// 다음필터가 있는지 확인
		chain.doFilter(request, response);
	
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
