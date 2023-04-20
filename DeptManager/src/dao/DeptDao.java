package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Dept;

public class DeptDao {

	// 1. dept list : List<Dept>
	public List<Dept> selectByAll(Connection conn) {

		// Connection
		// 1.메소드 내부에서 Connection을 구하는 방법 (X) => 메소드 실행 될때 마다 트랜젝션이 생성되므로 원하는 일처리 묶어 줄 수
		// 없다.
		// 2.Dao클래스 내부의 인스턴스 변수로 Connection 구하는 방법 (X) => Conn을 구하기 위해서 인스턴스를 계속해서 생성해줘야
		// 되므로 불필요한 데이터 생성
		// 3.외부에서 매개변수로 Connection 구하는 방법 => Service class 메소드에서 Connection 생성 전달 Close도
		// Service에서 해줌(Service class에서 트랜젝션 처리)

		// close()

		// Connection
		// PreparedStatement
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 반환하고자 하는 결과 데이터
		// Collection Class 중 List => 입력 순서를 가진다. , index도 가진다.
		List<Dept> result = new ArrayList<Dept>();

		// sql
		String sql = "select *from dept";

		try {
			pstmt = conn.prepareStatement(sql);

			// executeQuery
			// ResultSet
			rs = pstmt.executeQuery();

			// while
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				Dept dept = new Dept(deptno, dname, loc);
				// List<Dept> Dept 객체를 추가
				result.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// 2. 부서번호로 검색(Connection conn, int num)
	public Dept selectByDeptno(Connection conn, int deptno) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept result = null;

		// sql
		String sql = "select *from dept where deptno = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = new Dept(rs.getInt(1), rs.getString(2), rs.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// 3. 부서 정보 입력
	public Dept insertForDept(Connection conn, int deptno, String dname, String loc) {

		PreparedStatement pstmt = null;
		Dept result = null;

		try {
			String sql = "insert into dept values(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);

			int value = pstmt.executeUpdate();
			
			if(value==1) {
				result = new Dept(deptno, dname, loc);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;

	}

	// 4. 부서 정보 수정

	// 5. 부서 정보 삭제

	// Test
	public static void main(String[] args) throws SQLException {

		DeptDao dao = new DeptDao();
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(dbUrl, "YONG", "tiger");

		List<Dept> list = dao.selectByAll(conn);

		for (Dept dept : list) {
			System.out.println(dept);
		}

		Dept dept = dao.selectByDeptno(conn, 10);
		System.out.println("결과 : " + dept);

		conn.close();
	}
}
