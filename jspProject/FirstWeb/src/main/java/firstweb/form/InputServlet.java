package firstweb.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form/input")
public class InputServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 사용자 요청의 한글 처리
		request.setCharacterEncoding("utf-8");

		// 내용 입력데이터 받기
		String content = request.getParameter("content");
		System.out.println("content : " + content);

		// radio
		String gender = request.getParameter("gender");
		System.out.println("gender : " + gender);

		// checkbox
		// 값이 여러개 들어올 수 있으므로 getParameterValues로 받는다.
		String[] langs = request.getParameterValues("lang");
		for (int i = 0; i < langs.length; i++) {
			System.out.println("lang : " + langs[i]);
		}

		// birth
		String birthYear = request.getParameter("birthYear");
		System.out.println("birthYear : " + birthYear);

		// age
		String paramAge = request.getParameter("age");
		int age = Integer.parseInt(paramAge);

		if (age > 19) {
			// 성인이 접속가능 한 페이지
		} else {
			// 성인이 아닐 시 접속할 수 있는 페이지
		}

		System.out.println("age : " + age);

		// date
		String birth = request.getParameter("birth");
		System.out.println("birth : " + birth);

//////////////////////////////////////////////////////////////

		// 응답처리
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();
		out.println("<h3>content : " + content + "</h3>");

		out.println("<h3>gender : " + gender + "</h3>");

		out.print("<h3>관심사</h3>");
		for (String lang : langs) {
			out.print(" - " + lang + "<br>");
		}

		out.println("<h3>birthYear : " + birthYear + "</h3>");

		out.println("<h3>age : " + age + "</h3>");

		out.println("<h3>birth : " + birth + "</h3>");
		out.close();
	}

}
