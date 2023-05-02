package todo.util;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

public class Loader extends HttpServlet {
// JDBC LOADER
	@Override
	public void init() throws ServletException {

		System.out.println("Loader....init()....");

		// 데이터베이스 Driver load
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Complete MySql Driver Load");
		} catch (ClassNotFoundException e) {
			System.out.println("Fail Driver Load...");
			e.printStackTrace();
		}
	}

}
