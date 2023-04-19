package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteTest {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1. 드라이버 로드 : Class.forName("클래스의 풀네임");
//			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connetion 객체를 생성 : 연결 정보

			// Oracle
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dbUrl, "YONG", "tiger");

			// 트렌젝션 설정
			conn.setAutoCommit(false);

			// 3. Statement / PreparedStatement => sql 실행 요청 메소드

			// insert Sql
			String sql = "delete from dept where deptno = ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, 50);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("Complete Delete Data");
			} else {
				System.out.println("Fail Delete Data");
			}
			conn.commit();

		} catch (SQLException e) {
			System.out.println("Fail Connect DataBase");
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
