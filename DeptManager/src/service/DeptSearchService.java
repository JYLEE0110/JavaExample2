package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptSearchService {

	DeptDao dao;

	private DeptSearchService() {
		this.dao = DeptDao.getInstance();
	}
	
	private static DeptSearchService service = new DeptSearchService();
	public static DeptSearchService getInstance() {
		return service;
	}
//	public DeptSearchService(DeptDao dao) {
//		this.dao = dao;
//	}

	// 검색 번호를 받고 Dept 정보를 저장하고 있는 객체를 반환
	public Dept searchDept(int deptno) {

		Connection conn = null;
		Dept dept = null;
		try {
			conn = ConnectionProvider.getConnection();

			conn.setAutoCommit(false);

			dept = dao.selectByDeptno(conn, deptno);

			conn.commit();
		} catch (SQLException e) {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			// 데이터베이스 연결 실패
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return dept;
//		Dept dept = dao.selectByDeptno(deptno);

	}

}
