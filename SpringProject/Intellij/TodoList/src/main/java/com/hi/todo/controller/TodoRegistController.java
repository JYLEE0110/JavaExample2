package com.hi.todo.controller;

import com.hi.todo.domain.TodoRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo/regist")
@Log4j2
public class TodoRegistController {

    // get : form 페이지로 응답
    @RequestMapping(method = RequestMethod.GET)
    public String getRegistForm(){

        log.info("GET | /todo/regist");

        return "todo/registForm";
        // /WEB-INF/views/todo/regist.jsp

    }
    // post : redirect -> /todo/list ==> view 필요가 없다.
    @RequestMapping(method = RequestMethod.POST)
    public String regist(
            //Parameter로 들어오는 매개변수 선언

            // 1.
            Model model,
            String todo,
            String duedate,

            // 2. RequestParam Annotation (Get방식으로 들어올때 많이 쓰임)
            // Parameter 이름을 동일시 하지 않아도 된다.
            // 기본 : 필수항목(required로 지정할 수 있다.), default값 지정 가능
            @RequestParam(value = "todo", required = false) String requestTodo,
            @RequestParam(value = "duedate", defaultValue = "2023-12-25") String requestDuedate,

            // 3.Command 방식(Post방식일때 많이 쓰임)
            TodoRequest todoRequest
    ){

        log.info("POST | /todo/regist");

        log.info("todo : " + todo);
        log.info("duedate : " + duedate);

        log.info("todo : " + requestTodo);
        log.info("duedate : " + requestDuedate);

        // Command 클래스 정의 : Parameter 받는 변수 선언 
        // Controller 메소드의 매개변수로 정의
        log.info("TodoRequest : " + todoRequest);

        model.addAttribute("todo",todo);
        model.addAttribute("duedate",duedate);

        //return "todo/regist"; // /WEB-INF/views/todo/regist.jsp

         return "redirect:/todo/list";
        // 일반 view와 구분은 redirect : 문자열로 구분
        // http://localhost8080/todo/list
    }
}
