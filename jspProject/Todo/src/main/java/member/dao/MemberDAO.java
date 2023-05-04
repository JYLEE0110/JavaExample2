package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.domain.MemberDTO;
import todo.util.ConnectionProvider;

public class MemberDAO {

	// 로그인처리를 위한 select
	// uid, pw 비교해서 처리 => MemberDTO(uuid, pw 는 받지않음 select 값만 DTO 인스턴스 변수로 선언)

	// 로그인 시 JSP 화면에서 ID 와 PW를 받으므로 파라미터에 uid, pw를 받음
	public MemberDTO selectByUidPw(Connection conn, String uid, String pw) {

		// 반환할 결과 데이터 변수 선언
		MemberDTO memberDTO = null;

		// sql 실행을 위한 PreparedStatement 선언 =? try{} finally(close())
		PreparedStatement pstmt = null;

		// select 결과 테이블 저장
		ResultSet rs = null;

		String sql = "select idx, uid, uname, uphoto from member where uid = ? and pw = ?";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, uid);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			//if => MemberDTO
			if(rs.next()) {
				// rs.getType("DB 컬럼 값")
				memberDTO = new MemberDTO(
										rs.getInt("idx"), 
										rs.getString("uid"), 
										rs.getString("uname"), 
										rs.getString("uphoto"));
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

		return memberDTO;

	}
	
	public static void main(String[] args) throws SQLException {
		MemberDAO dao = new MemberDAO();
		
		Connection conn = ConnectionProvider.getConnection();
		
		MemberDTO member = dao.selectByUidPw(conn, "cool", "1111");
		
		System.out.println(member);
	}

}
