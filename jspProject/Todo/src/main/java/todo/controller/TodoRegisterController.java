package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.domain.RequestTodo;
import todo.service.TodoInsertService;

@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {
       
	TodoInsertService insertService;
	
	public TodoRegisterController() {
		this.insertService = TodoInsertService.getInstance();
	}
	

	protected void doGet(
						HttpServletRequest request, 
						HttpServletResponse response) 
								throws ServletException, IOException {

		
		// todo 입력 폼 화면 출력
		System.out.println("TodoRegisterController...doGet()...");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/registerForm.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(
						HttpServletRequest request, 
						HttpServletResponse response) 
								throws ServletException, IOException {

		System.out.println("TodoRegisterController .. doPost()...");
		
		// Post 방식의 데이터 전달 => 파라미터 한글처리
		//filter => /* 설정
		
		// 입력폼에서 전달한 데이터를 받아서 처리
		String todo = request.getParameter("todo");
		String dueDate = request.getParameter("duedate");
		//System.out.println(todo +  " : " + dueDate);
		
		// RequestTodo class 객체에 저장
		RequestTodo requestTodo = new RequestTodo(todo, dueDate);
		
		// Service에 요청
		int result = insertService.register(requestTodo);
		
		if(result > 0 ) {
			System.out.println("Complete Insert!!");
		}else {
			System.out.println("Faile Insert!!");
		}
		
		//redirect : "list"
		response.sendRedirect("list"); // 외부에서 접속하는 URI
	}

}
