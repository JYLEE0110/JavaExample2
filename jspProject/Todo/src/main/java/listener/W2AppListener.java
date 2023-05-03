package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;

@WebListener
public class W2AppListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed()...");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInitialized()...");

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
