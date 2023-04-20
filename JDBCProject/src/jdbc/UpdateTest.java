package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateTest {

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
			String sql = "update dept set dname = ?, loc = ? where deptno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, "DESIGN");
			pstmt.setString(2, "SEOUL");
			pstmt.setInt(3, 50);

			int result = pstmt.executeUpdate();
			
			System.out.println(result);
			pstmt.close();
			conn.close();

			if (result > 0) {
				System.out.println("Complete Update Data");
			} else {
				System.out.println("Fail Update Data");
			}

		} catch (SQLException e) {
			System.out.println("Fail Connect DataBase");
			e.printStackTrace();
		}

	}

}
