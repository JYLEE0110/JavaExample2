package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			// 2. Connetion 객체를 생성 : 연결 정보

			// Oracle
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dbUrl, "YONG", "tiger");
			// 트렌젝션 설정
			conn.setAutoCommit(false);
			// 3. Statement / PreparedStatement => sql 실행 요청 메소드
			String sql = "select deptno, dname, loc from dept order by deptno";
			pstmt = conn.prepareStatement(sql);

			// 4. select의 결과 데이터는 ResultSet 객체로 받는다.
			// select 실행메소드 : excuteQuery(String sql)
			rs = pstmt.executeQuery();

			// 5. ResultSet 객체에서 데이터 추출
			while (rs.next()) {
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("LOC");

				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);

				System.out.println(deptno + "\t" + dname + "\t" + loc);
				conn.commit();
			}

		} catch (SQLException e) {
			// conn 오류일때
			if (conn == null) {
				System.out.println("Fail Connect DataBase");
				e.printStackTrace();
				//conn는 되었지만(conn!=null) sql구문에서 오류일때  롤백
			}else {
				try {
					conn.rollback();
					System.out.println("DML Erro! Complete RollBack");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
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
