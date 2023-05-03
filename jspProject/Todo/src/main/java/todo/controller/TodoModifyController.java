package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.domain.Todo;
import todo.domain.TodoDTO;
import todo.service.TodoUpdateService;
import todo.service.TodoViewService;

@WebServlet({ "/todo/modify" })
public class TodoModifyController extends HttpServlet {

	TodoViewService viewService;
	TodoUpdateService updateService;

	public TodoModifyController() {
		this.viewService = TodoViewService.getInstance(); // 수정페이지 보기(do Get)
		this.updateService = TodoUpdateService.getInstance(); // 수정하기(do Post)
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("TodoModifyController....doGet()....");

		// 수정 폼 : 이전에 입력햇던 데이터가 화면에 출력
		// no 값을 받고
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);

		// no 값에 해당하는 Todo 데이터를 Service를 통해서 받고
//		Todo todo = new Todo(no, "청소", "2023-05-04", "done"); // service에서 받아온 값들
		TodoDTO todo = viewService.getTodo(no);

		// request 속성에 결과 데이터를 저장
		request.setAttribute("todo", todo);

		// view 지정
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/modify.jsp");
		dispatcher.forward(request, response);
		// forward

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("TodoModifyController....doPost()....");

		// 수정 Form에서 전달받고
		String noStr = request.getParameter("no");
		String todo = request.getParameter("todo");
		String duedate = request.getParameter("duedate");
		String complete = request.getParameter("complete");

		TodoDTO todoDTO = new TodoDTO(Integer.parseInt(noStr), todo, duedate,
				complete != null ? (complete.equals("on") ? true : false) : false);

		// 서비스에 요청 : update

//		Todo newTodo = new Todo(Integer.parseInt(noStr), todo, duedate, complete != null ? complete.equals("on") ? "done" : "not" : "not");
//		System.out.println(newTodo);

		// 결과 받고
		int result = updateService.modify(todoDTO);

		if (result > 0) {
			System.out.println("Complete Update!!" + result);
		} else {
			System.out.println("Fail Update!!" + result);
		}
		// redirect 처리
		response.sendRedirect("list");
	}

}
