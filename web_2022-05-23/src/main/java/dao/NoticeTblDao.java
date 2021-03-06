package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.NoticeInfo;
import util.DatabaseManager;

public class NoticeTblDao {

	public int getNoticeAmount() {
		int noticeAmount = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseManager.getConnection();
			
			String sql = "SELECT COUNT(*) AS amount FROM noticetbl";
			
			pstmt = DatabaseManager.getPstmt(conn, sql);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			noticeAmount = rs.getInt("amount");
		} catch(SQLException e) {
			e.printStackTrace();
		}  finally {
			DatabaseManager.closeResultSet(rs);
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}
		
		return noticeAmount;
	}
	
	public boolean deleteByIdx(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		boolean result = false;
		
		try {
			conn = DatabaseManager.getConnection();
			
			String sql = "DELETE FROM noticetbl WHERE noticeID = ?";
			
			pstmt = DatabaseManager.getPstmt(conn, sql);
			pstmt.setInt(1, idx);
			
			pstmt.executeUpdate();
			
			result = true;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}
		
		return result;
	}
	
	public NoticeInfo selectNoticeInfoByIdx(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		NoticeInfo noticeInfo = null;
		
		try {
			conn = DatabaseManager.getConnection();
			
			String sql = "SELECT * FROM noticetbl WHERE noticeID = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			String title = rs.getString("title");
			String contents = rs.getString("contents");
			
			noticeInfo = new NoticeInfo(title, contents);
		} catch(SQLException e) {
			e.printStackTrace();
		}  finally {
			DatabaseManager.closeResultSet(rs);
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}
		
		return noticeInfo;
	}
	
	public boolean writeNoticeInfo(NoticeInfo noticeInfo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		boolean result = false;
		
		try {
			conn = DatabaseManager.getConnection();
			
			String sql = "INSERT INTO noticetbl(title, contents) VALUES(?, ?)";
			
			pstmt = DatabaseManager.getPstmt(conn, sql);
			pstmt.setString(1, noticeInfo.getTitle());
			pstmt.setString(2, noticeInfo.getContents());
			
			pstmt.executeUpdate();
			
			result = true;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}
		
		return result;
	}
	
	public List<NoticeInfo> getNoticeInfoList(int start) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<NoticeInfo> noticeInfoList = new ArrayList<>();
		
		// ????????? ??????????????? ????????? ???????????? ?????? ??????????????? ????????? ??????
		try {
			conn = DatabaseManager.getConnection();
			
			// ????????? ????????? ?????? ????????? 5?????? ???????????? ?????? ??????????????? ????????? ??????
			// DB??? ????????? ?????? ???????????? ??????(noticetbl)???
			// ?????????????????? ?????? ??????????????? ???????????? ?????????????????? ?????? ????????? ??????????????? ????????????.
			// 1 - 1 ~ 5
			// 2 - 6 ~ 10
			// 3 - 11 ~ 15
			// ...
			String sql = "SELECT * FROM noticetbl ORDER BY noticeID DESC LIMIT ?, 5";
			
			pstmt = DatabaseManager.getPstmt(conn, sql);
			pstmt.setInt(1, start);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int noticeId = rs.getInt("noticeID");
				String title = rs.getString("title");
				String contents = rs.getString("contents");
				
				NoticeInfo nth = new NoticeInfo(noticeId, title, contents);
				
				noticeInfoList.add(nth);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeResultSet(rs);
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}
		
		return noticeInfoList;
	}
	
	public boolean updateNoticeInfo(NoticeInfo noticeInfo) {
		// ???????????? ?????? ???????????? idx??? ?????? ???????????? ?????????
	    // ?????????????????? ????????? ????????? ???????????? ????????? ?????????.
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		boolean result = false;
		
		try {
			conn = DatabaseManager.getConnection();
			
			String sql = "UPDATE noticetbl SET title = ?, contents = ? WHERE noticeID = ?";
			
			pstmt = DatabaseManager.getPstmt(conn, sql);
			pstmt.setString(1, noticeInfo.getTitle());
			pstmt.setString(2, noticeInfo.getContents());
			pstmt.setInt(3, noticeInfo.getNoticeId());
			
			pstmt.executeUpdate();
			
			result = true;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}
		
		return result;
	}
}












