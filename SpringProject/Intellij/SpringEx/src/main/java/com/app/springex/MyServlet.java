package com.app.springex;

import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/my")
@Log4j2
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // log 콘솔 출력
        log.info("MyServlet...doGet()..."); // 메모리를 거의 안잡아 먹음
        response.setContentType("text/html"); // 응답에대한 처리

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>MyServlet</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }
}
