package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import util.Database;
import vo.ClassesInfo;

public class ClassesInfoDao {

	// 수강 등록한 수강과목수 + 1
	public void increaseEnrollByIdx(int idx) {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			String sql = "UPDATE classes_info SET classCount = classCount + 1 WHERE idx = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
	}
	
	
	// idx 수강번호로 수강 목록 불러오기
	public ClassesInfo selectByIdx(int idx) {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;

		ClassesInfo classesInfo = null;
		
		try {
			
			String sql = "SELECT * FROM classes_info WHERE idx = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString("id");
				int classCount = rs.getInt("classCount");
				String classSort = rs.getString("classSort");
				String className = rs.getString("className");
				String t_classTime = rs.getString("classTime");
				t_classTime = t_classTime.substring(t_classTime.indexOf('.'));
				t_classTime = t_classTime.replace(' ', 'T');
				LocalDateTime classTime = LocalDateTime.parse(t_classTime);
				
				String grade = rs.getString("grade");
				int cost = rs.getInt("cost");
				String status = rs.getString("status");
				
				String t_insertDate = rs.getString("insertDate");
				t_insertDate = t_insertDate.substring(0, t_insertDate.indexOf('.'));
				t_insertDate = t_insertDate.replace(' ', 'T');
				LocalDateTime insertDate = LocalDateTime.parse(t_insertDate);
				
				classesInfo = new ClassesInfo();
				classesInfo.setIdx(idx);
				classesInfo.setId(id);
				classesInfo.setClassCount(classCount);
				classesInfo.setClassSort(classSort);
				classesInfo.setClassName(className);
				classesInfo.setClassTime(classTime);
				classesInfo.setGrade(grade);
				classesInfo.setCost(cost);
				classesInfo.setStatus(status);
				classesInfo.setInsertDate(insertDate);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.closeResultSet(rs);
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
		return classesInfo;
	}
	
	// 해당 수강 목록삭제
	public void deleteByIdx(int idx) {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		
		try {
			String sql = "DELETE FROM classes_info WHERE idx = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
	}
	
	
//	public boolean insertClassesInfo(ClassesInfo classesInfo) {
//		Database db = new Database();
//		
//		Connection conn = db.getConnection();
//		PreparedStatement pstmt = null;
//		
//		try {
//			
//			String sql = "INSERT INTO product_info(name, category, stock, price, img, insertDate) VALUES(?, ?, ?, ?, ?, ?)";
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, classesInfo.getName());
//			pstmt.setString(2, classesInfo.getCategory());
//			pstmt.setInt(3, classesInfo.getStock());
//			pstmt.setInt(4, classesInfo.getPrice());
//			pstmt.setString(5, classesInfo.getImg());
//			// 회원가입일을 문자열화 시켜서 하면 편하다
//			pstmt.setString(6, classesInfo.getInsertDate().toString());
//			
//			
//			int count = pstmt.executeUpdate();
//			
//			return count == 1;
//		} catch (SQLException e) {
//			e.printStackTrace();
//			
//			return false;
//		} finally {
//			db.closePstmt(pstmt);
//			db.closeConnection(conn);
//		}
//	}
//	
//	
//	public int getCount() {
//		Database db = new Database();
//		
//		Connection conn = db.getConnection();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		int amount = 0;
//		
//		try {
//			
//			String sql = "SELECT COUNT(*) AS amount FROM product_info";
//			
//			pstmt = conn.prepareStatement(sql);
//			
//			rs = pstmt.executeQuery();
//			
//			rs.next();
//			
//			amount = rs.getInt("amount");
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			// 예외 발생할 일이 없어서 생략해도 됨
//			
//		} finally {
//			db.closeResultSet(rs);
//			db.closePstmt(pstmt);
//			db.closeConnection(conn);
//		}
//		return amount;
//	}
//	
//	public List<ClassesInfo> selectAll(int pageNumber){
//		Database db = new Database();
//		
//		Connection conn = db.getConnection();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		List<ClassesInfo> productInfoList = new ArrayList<>();
//		
//		try {
//			String sql = "SELECT * FROM product_info ORDER BY insertDate DESC LIMIT ?, 8";
//			
//			// * 10 에서 10이 의미하는 바는 한 페이지에 보여줘야할 상품의 수
//			int startIndex = (pageNumber - 1) * 8;
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, startIndex);
//			
//			rs = pstmt.executeQuery();
//			while(rs.next()) {
//				int nthIdx = rs.getInt("idx");
//				String name = rs.getString("name");
//				String category = rs.getString("category");
//				int stock = rs.getInt("stock");
//				int price = rs.getInt("price");
//				String img = rs.getString("img");
//				String t_insertDate = rs.getString("insertDate");
//				
//				t_insertDate = t_insertDate.substring(0, t_insertDate.indexOf('.'));
//				t_insertDate = t_insertDate.replace(' ', 'T');
//				
//				LocalDateTime insertDate = LocalDateTime.parse(t_insertDate);
//				
//				ClassesInfo nthProductInfo = new ClassesInfo(nthIdx, name, category, stock, price, img, insertDate);
//				
//				productInfoList.add(nthProductInfo);
//				
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally{
//			db.closeResultSet(rs);
//			db.closePstmt(pstmt);
//			db.closeConnection(conn);
//		}
//		return productInfoList;
//	}
	
	
	
	
	
}
