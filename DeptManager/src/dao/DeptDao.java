package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Dept;

//어디서든 사용 가능
public class DeptDao {

	//DAO : sql 실행하는 메소드만 가지는 클래스
	// => 여러개의 인스턴스가 생성될 필요가 없다.
	// => 싱글톤처리를 통해서 하나의 인스턴스만 사용!
	
	// 1. 인스턴스 생성금지 : private 생성자
	private DeptDao(){
		
	}
	
	// 2. 클래스 내부에서 인스턴스 생성 : private static
	private static DeptDao dao = new DeptDao();
	// 3. 다른 클래스에서 인스턴스를 얻을 수 있는 메소드 : public static
	public static DeptDao getInstance() {
		return dao;
	}

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
		String sql = "select *from dept order by deptno";

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

			// cursor개념
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

	// 3. 부서 정보 입력 : deptno, dname, loc
	// 매개변수 객체(Dept dept)로 받는 이유 => 인스턴스변수(속성이 늘어날 수 있으므로)
	public int inserToDept(Connection conn, Dept dept) {

		PreparedStatement pstmt = null;
		int result = 0;

		try {
			String sql = "insert into dept values(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			result = pstmt.executeUpdate();

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

	// 4. 부서 정보 수정 : deptno(where절에 들어갈), dname, loc
	public int updateDeptByDeptno(Connection conn, Dept dept) {

		PreparedStatement pstmt = null;
		int result = 0;

		try {
			String sql = "update dept set dname = ?, loc = ? where deptno = ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	// 5. 부서 정보 삭제 : deptno => 삭제할 부서 번호
	public int deleteDeptByDeptno(Connection conn, int deptno) {
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			String sql = "delete from dept where deptno = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;
	}

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

//		int insertResult = dao.inserToDept(conn, new Dept(50, "DEVELOPE", "SEOUL"));
//		System.out.println("저장 결과 : " + insertResult);

		Dept d = new Dept(50, "TTT", "QQQ");
		int updateResult = dao.updateDeptByDeptno(conn, d);
		System.out.println(updateResult);

		conn.close();
	}
}
