package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptInsertService {

	DeptDao dao;

	private DeptInsertService() {
		this.dao = DeptDao.getInstance();
	}
	
	private static DeptInsertService service = new DeptInsertService();
	public static DeptInsertService getInstance() {
		return service;
	}

	public int insertDept(Dept dept) {

		// requestDept(domain) PK를 시퀀스처리하면 입력할 필요 없이 자동으로 생성되므로 => dname, loc
		// 데이터 가공
		// Transaction

		Connection conn = null;
		int result = 0;

		try {
			conn = ConnectionProvider.getConnection();
			result = dao.inserToDept(conn, dept);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return result; // controller에게 예외처리를 넘겨줌
	}
}
