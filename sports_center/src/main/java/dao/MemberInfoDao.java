package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import util.Database;
import vo.MemberInfo;

public class MemberInfoDao {

	// 회원가입
	public boolean insert(MemberInfo memberInfo) {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		
		try {
			
			String sql = "INSERT INTO member_info(id, pw, name, tel, addr, email, joinDate) VALUES(?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberInfo.getId());
			pstmt.setString(2, memberInfo.getPw());
			pstmt.setString(3, memberInfo.getName());
			pstmt.setString(4, memberInfo.getTel());
			pstmt.setString(5, memberInfo.getAddr());
			pstmt.setString(6, memberInfo.getEmail());
			// 회원가입일을 문자열화 시켜서 하면 편하다
			pstmt.setString(7, memberInfo.getJoinDate().toString());
			
			
			int count = pstmt.executeUpdate();
			
			return count == 1;
		} catch (SQLException e) {
			e.printStackTrace();
			
			return false;
		} finally {
			db.closePstmt(pstmt);
			db.closeConnection(conn);
			
		}
	}
	
	
	public MemberInfo selectById(String id) {
		
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;

		MemberInfo memberInfo = null;
		
		try {
			
			String sql = "SELECT * FROM member_info WHERE id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				// select 결과를 memberInfo에 담음
				int idx = rs.getInt("idx");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String addr = rs.getString("addr");
				String email = rs.getString("email");
				
				// String으로 꺼내와서 LocalDateTime으로 변환해줌
				String t_joinDate = rs.getString("joinDate");
				// parse() 메서드를 사용해서 날짜 정보처럼 생긴 문자열을 날짜 정보(LocalDateTime)으로 변환 할 수 있는데
				// 날짜 정보처럼 생긴 문자열은 yyyy-mm-ddTHH:mm:ss 와 같은 형식이어야함
				// console에 지금은 2022-05-09 15:16:16.0 yyyy-mm-dd HH:mm:ss.SSS 형식임
				// Tue, 10 May 2022 04:37:44 GMT 형식임
				
				// t_joinDate에 들어있는 밀리초를 떼기
				// 18번인덱스까지 사용하겠다
				t_joinDate = t_joinDate.substring(0, 19);
//					System.out.println("t_joinDate = " + t_joinDate); console에서 확인
				// t_joinDate의 중간에 들어있는 공백문자를 T로 바꾸기
				t_joinDate = t_joinDate.replace(' ', 'T');
//					System.out.println("t_joinDate = " + t_joinDate); console에서 확인
				
				// yyyy-mm-dd HH:mm:ss -> yyyy-mm-ddTHH:mm:ss
				
				LocalDateTime joinDate = LocalDateTime.parse(t_joinDate);
				
				memberInfo = new MemberInfo(idx, id, pw, name, tel, addr, email, joinDate);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.closeResultSet(rs);
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
		return memberInfo;
	}
	
	
	public MemberInfo selectByTel(String tel) {
		
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;

		MemberInfo memberInfo = null;
		
		try {
			
			String sql = "SELECT * FROM member_info WHERE tel = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tel);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				// select 결과를 memberInfo에 담음
				int idx = rs.getInt("idx");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String email = rs.getString("email");
				
				// String으로 꺼내와서 LocalDateTime으로 변환해줌
				String t_joinDate = rs.getString("joinDate");
				LocalDateTime joinDate = LocalDateTime.parse(t_joinDate);
				
				memberInfo = new MemberInfo(idx, id, pw, name, tel, addr, email, joinDate);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.closeResultSet(rs);
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
		return memberInfo;
	}
	
	
	public MemberInfo selectByEmail(String email) {
		
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;

		MemberInfo memberInfo = null;
		
		try {
			
			String sql = "SELECT * FROM member_info WHERE email = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				// select 결과를 memberInfo에 담음
				int idx = rs.getInt("idx");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String addr = rs.getString("addr");
				
				// String으로 꺼내와서 LocalDateTime으로 변환해줌
				String t_joinDate = rs.getString("joinDate");
				LocalDateTime joinDate = LocalDateTime.parse(t_joinDate);
				
				memberInfo = new MemberInfo(idx, id, pw, name, tel, addr, email, joinDate);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.closeResultSet(rs);
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
		return memberInfo;
	}
	
	// 회원정보 수정
	public void updateByID(MemberInfo memberInfo) {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			
//			String sql = "UPDATE member_info SET pw = ?, name = ?, tel = ?, addr = ?, email = ?, WHERE id = ?";
			String sql = "UPDATE member_info SET name = ?, tel = ?, addr = ?, email = ? WHERE id = ?";
			
			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, memberInfo.getPw());
			pstmt.setString(1, memberInfo.getName());
			pstmt.setString(2, memberInfo.getTel());
			pstmt.setString(3, memberInfo.getAddr());
			pstmt.setString(4, memberInfo.getEmail());
			pstmt.setString(5, memberInfo.getId());
			
			pstmt.executeUpdate();
			// 따로 업데이트 결과를 리턴하지는 않고
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
		
	}
	
	// 회원정보 비밀번호 수정
	public void updatePassWordById(String id, String pw) {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			
			String sql = "UPDATE member_info SET pw = ? WHERE id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pw);
			pstmt.setString(2, id);
			
			pstmt.executeUpdate();
			// 따로 업데이트 결과를 리턴하지는 않고
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
	
	}
	
	
	// 회원 탈퇴
	public void deleteMemberInfoByID(String id) {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		
		try {
			String sql = "DELETE FROM member_info WHERE id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
		
	}
	
	
}
