package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest2 {

	public static void main(String[] args) {

		try {

			// 2. Connetion 객체를 생성 : 연결 정보

			// Oracle
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "YONG", "tiger");

			// 3. Statement / PreparedStatement => sql 실행 요청 메소드

			// sql
			String sql = "select * from dept where deptno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// ? 파라미터 설정
			pstmt.setInt(1, 10);

			ResultSet rs = pstmt.executeQuery();

			// 4. select의 결과 데이터는 ResultSet 객체로 받는다.
			// select 실행메소드 : excuteQuery()
//			while(rs.next()) {
//				System.out.println(rs.getInt(1) + "\t" + rs.getNString(2) + "\t" + rs.getString(3));
//			}
			if (rs.next()) {
				//조건이 PK이므로 결과값은 1개 이므로 if로 처리
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			}
			rs.close();
			pstmt.close();
			conn.close();

			// 5. ResultSet 객체에서 데이터 추출

		} catch (SQLException e) {
			System.out.println("Fail Connect DataBase");
			e.printStackTrace();
		}

	}

}
