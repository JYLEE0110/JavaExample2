package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	//getConnection() 오버로딩??
	public static Connection getConnection() throws SQLException {
		// Connection 객체 구하기
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		return DriverManager.getConnection(dbUrl, "YONG", "tiger");
	}
	
}
