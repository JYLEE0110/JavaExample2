package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {

		try {
			// 1. 드라이버 로드 : Class.forName("클래스의 풀네임");
//			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connetion 객체를 생성 : 연결 정보

			// Oracle
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "YONG", "tiger");

			// 3. Statement / PreparedStatement => sql 실행 요청 메소드

			// insert Sql
			String sql = "insert into dept values (?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, 50);
			pstmt.setString(2, "DEVELOPMENT");
			pstmt.setString(3, "SEOUL");

			int result = pstmt.executeUpdate();
			System.out.println(result);
			
			pstmt.close();
			conn.close();
			
			if(result > 0 ) {
				System.out.println("Complete Insert Data");
			}else {
				System.out.println("Fail Insert Data");
			}
			
			

		} catch (SQLException e) {
			System.out.println("Fail Connect DataBase");
			e.printStackTrace();
		}

	}

}
