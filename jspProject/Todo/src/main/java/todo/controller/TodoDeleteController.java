package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.service.TodoDeleteService;

@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {

	TodoDeleteService deleteService;

	public TodoDeleteController() {
		this.deleteService = TodoDeleteService.getInstance();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("TodoDeleteController...doPost()...");

		// 사용자로부터 no 받기
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);

		// 서비스로 no전달 -> 삭제 처리
		int result = deleteService.delete(no);

		// 결과
		if (result > 0) {
			System.out.println(no + "번 할일이 삭제 되었습니다.");
		} else {
			System.out.println("Fail Delete");
		}

		response.sendRedirect("list");

	}

}
