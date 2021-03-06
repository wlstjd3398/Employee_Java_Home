package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import member.dto.MemberInfo;
import util.DatabaseManager;

public class MemberInfoDao {
	
	public boolean delete(int memberIdx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DatabaseManager.getConnection();
			
			String sql = "DELETE FROM member_info WHERE memberIdx = ?";
			
			pstmt = DatabaseManager.getPstmt(conn, sql);
			pstmt.setInt(1, memberIdx);
			
			pstmt.executeUpdate();
			
			return true;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}
		
		return false;
	}
	
	public boolean update(MemberInfo memberInfo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DatabaseManager.getConnection();
			
			String sql = "UPDATE member_info SET pw = ?, name = ?, tel = ?, addr = ?, email = ? WHERE memberIdx = ?";
			
			pstmt = DatabaseManager.getPstmt(conn, sql);
			pstmt.setString(1, memberInfo.getPw());
			pstmt.setString(2, memberInfo.getName());
			pstmt.setString(3, memberInfo.getTel());
			pstmt.setString(4, memberInfo.getAddr());
			pstmt.setString(5, memberInfo.getEmail());
			pstmt.setInt(6, memberInfo.getMemberIdx());
			
			pstmt.executeUpdate();
			
			System.out.println(pstmt);
			
			return true;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}

		return false;
	}
	
	public MemberInfo selectByMemberIdx(int memberIdx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MemberInfo memberInfo = null;
		
		try {
			conn = DatabaseManager.getConnection();
			
			String sql = "SELECT * FROM member_info WHERE memberIdx = ?";
			
			pstmt = DatabaseManager.getPstmt(conn, sql);
			pstmt.setInt(1, memberIdx);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String addr = rs.getString("addr");
				String email = rs.getString("email");
				LocalDateTime joinDate = rs.getTimestamp("joinDate").toLocalDateTime();
				
				memberInfo = new MemberInfo(memberIdx, id, pw, name, tel, addr, email, joinDate);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeResultSet(rs);
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}

		return memberInfo;
	}
	
	public MemberInfo selectById(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MemberInfo memberInfo = null;
		
		try {
			conn = DatabaseManager.getConnection();
			
			String sql = "SELECT * FROM member_info WHERE id = ?";
			
			pstmt = DatabaseManager.getPstmt(conn, sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int memberIdx = rs.getInt("memberIdx");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String addr = rs.getString("addr");
				String email = rs.getString("email");
				LocalDateTime joinDate = rs.getTimestamp("joinDate").toLocalDateTime();
				
				memberInfo = new MemberInfo(memberIdx, id, pw, name, tel, addr, email, joinDate);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeResultSet(rs);
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}

		return memberInfo;
	}
	
	public MemberInfo selectByTel(String tel) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MemberInfo memberInfo = null;
		
		try {
			conn = DatabaseManager.getConnection();
			
			String sql = "SELECT * FROM member_info WHERE tel = ?";
			
			pstmt = DatabaseManager.getPstmt(conn, sql);
			pstmt.setString(1, tel);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int memberIdx = rs.getInt("memberIdx");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String email = rs.getString("email");
				LocalDateTime joinDate = rs.getTimestamp("joinDate").toLocalDateTime();
				
				memberInfo = new MemberInfo(memberIdx, id, pw, name, tel, addr, email, joinDate);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeResultSet(rs);
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}

		return memberInfo;
	}
	
	public MemberInfo selectByEmail(String email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MemberInfo memberInfo = null;
		
		try {
			conn = DatabaseManager.getConnection();
			
			String sql = "SELECT * FROM member_info WHERE email = ?";
			
			pstmt = DatabaseManager.getPstmt(conn, sql);
			pstmt.setString(1, email);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int memberIdx = rs.getInt("memberIdx");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String addr = rs.getString("addr");
				LocalDateTime joinDate = rs.getTimestamp("joinDate").toLocalDateTime();
				
				memberInfo = new MemberInfo(memberIdx, id, pw, name, tel, addr, email, joinDate);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeResultSet(rs);
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}

		return memberInfo;
	}
	
	public boolean insert(MemberInfo memberInfo) {
		// insert ???????????? ?????? ?????? memberInfo ??? ????????????
		// ?????? ????????? ??????????????? ????????? ???????????????.
		// (????????? ??????????????? void????????? return??? ???????????? ??????)
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. DB??? ??????
			conn = DatabaseManager.getConnection();
			
			// 2. ?????? ??????
			String sql = "INSERT INTO member_info(id, pw, name, tel, addr, email, joinDate) VALUES(?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = DatabaseManager.getPstmt(conn, sql);
			pstmt.setString(1, memberInfo.getId());
			pstmt.setString(2, memberInfo.getPw());
			pstmt.setString(3, memberInfo.getName());
			pstmt.setString(4, memberInfo.getTel());
			pstmt.setString(5, memberInfo.getAddr());
			pstmt.setString(6, memberInfo.getEmail());
			pstmt.setString(7, memberInfo.getJoinDate().toString());
			
			// 3. ?????? ??????
			pstmt.executeUpdate();
			
			return true;
		} catch(SQLException e) {
			e.printStackTrace();
			
			return false;
		} finally {
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}
		
		// 4. ?????? ????????? ??????
		
	}
}










