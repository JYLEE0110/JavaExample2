package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args)  {

		try {
			// 1. 드라이버 로드 : Class.forName("클래스의 풀네임");
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connetion 객체를 생성 : 연결 정보
			
			// Oracle
//			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
//			Connection conn = DriverManager.getConnection(dbUrl,"YONG","tiger");
			
			//MySql
			String dbUrl = "jdbc:mysql://localhost:3306/project";
			Connection conn = DriverManager.getConnection(dbUrl,"himedia","tiger");
			
			// 3. Statement / PreparedStatement => sql 실행 요청 메소드
			
			// 4. select의 결과 데이터는 ResultSet 객체로 받는다.
			
			// 5. ResultSet 객체에서 데이터 추출
			
			if(conn!=null) {
				System.out.println("Complete Connect DataBase");
				conn.close(); // 자원의 반납
			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Fail Connect DataBase");
			e.printStackTrace();
		}
		
		
	}

}
