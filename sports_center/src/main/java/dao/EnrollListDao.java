package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import vo.EnrollInfo;
import util.Database;

public class EnrollListDao {

	// 수강 등록한 목록 불러오기
	public boolean insertEnrollInfo(EnrollInfo enrollInfo) {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			String sql = "INSERT INTO Enroll_info(paymentMethod, memberIdx, classesIdx, enrollDate) VALUES(?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, enrollInfo.getPaymentMethod());
			pstmt.setInt(2, enrollInfo.getMemberIdx());
			pstmt.setInt(3, enrollInfo.getClassesIdx());
			pstmt.setString(4, enrollInfo.getEnrollDate().toString());
			
			int count = pstmt.executeUpdate();
			
			return count == 1;
		} catch(SQLException e) {
			e.printStackTrace();
			
			return false;
		} finally {
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
	}
	
}
