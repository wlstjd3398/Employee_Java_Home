package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import util.Database;
import vo.GalleryInfo;

public class GalleryInfoDao {

public boolean insertGalleryInfo(GalleryInfo galleryInfo) {
		
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			
			String sql = "INSERT INTO Gallery_info(title, content, img, writer, insertDate, hits) VALUES(?, ?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, galleryInfo.getTitle());
			pstmt.setString(2, galleryInfo.getContent());
			pstmt.setString(3, galleryInfo.getImg());
			pstmt.setString(4, galleryInfo.getWriter());
			
			pstmt.setString(5, galleryInfo.getInsertDate().toString());
			pstmt.setInt(6, galleryInfo.getHits());
			
			
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
	
	
	public void updateGalleryInfo(GalleryInfo galleryInfo) {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			String sql = "UPDATE gallery_info SET title = ?, content = ?, img = ? WHERE idx = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, galleryInfo.getTitle());
			pstmt.setString(2, galleryInfo.getContent());
			pstmt.setString(3, galleryInfo.getImg());
			pstmt.setInt(4, galleryInfo.getIdx());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
		
	}
	
	public void deleteByIdx(int idx) {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			String sql = "DELETE FROM gallery_info WHERE idx = ?";
			
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
	
	
	public GalleryInfo selectByIdx(int idx) {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;

		GalleryInfo galleryInfo = null;
		
		try {
			
			String sql = "SELECT * FROM gallery_info WHERE idx = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String title = rs.getString("title");
				String content = rs.getString("content");
				String img = rs.getString("img");
				img = img == null ? "" : img;
				
				String writer = rs.getString("writer");
				
				String t_insertDate = rs.getString("insertDate");
				t_insertDate = t_insertDate.substring(0, t_insertDate.indexOf('.'));
				t_insertDate = t_insertDate.replace(' ', 'T');
				LocalDateTime insertDate = LocalDateTime.parse(t_insertDate);
				
				int hits = rs.getInt("hits");
				
				galleryInfo = new GalleryInfo();
				galleryInfo.setIdx(idx);
				galleryInfo.setTitle(title);
				galleryInfo.setContent(content);
				galleryInfo.setImg(img);
				galleryInfo.setWriter(writer);
				galleryInfo.setInsertDate(insertDate);
				galleryInfo.setHits(hits);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.closeResultSet(rs);
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
		return galleryInfo;
		
	}
	
	
	public int getCount() {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int amount = 0;
		
		try {
			
			String sql = "SELECT COUNT(*) AS amount FROM gallery_info";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			amount = rs.getInt("amount");
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			db.closeResultSet(rs);
			db.closePstmt(pstmt);
			db.closeConnection(conn);
		}
		
		return amount;
		
	}
	
	public List<GalleryInfo> selectAll(int pageNumber){
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<GalleryInfo> galleryInfoList = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM gallery_info ORDER BY insertDate DESC LIMIT ?, 8";
			
			// * 6 한 페이지에 보여줘야할 상품의 수
			int startIndex = (pageNumber - 1) * 6;
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startIndex);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int nthIdx = rs.getInt("idx");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String img = rs.getString("img");
				String writer = rs.getString("writer");
				String t_insertDate = rs.getString("insertDate");
				t_insertDate = t_insertDate.substring(0, t_insertDate.indexOf('.'));
				t_insertDate = t_insertDate.replace(' ', 'T');
				LocalDateTime insertDate = LocalDateTime.parse(t_insertDate);

				int hits = rs.getInt("hits");
				
				GalleryInfo nthGalleryInfo = new GalleryInfo(nthIdx, title, content, img, writer, insertDate, hits);
				
				galleryInfoList.add(nthGalleryInfo);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			db.closeResultSet(rs);
			db.closePstmt(pstmt);
			db.closeConnection(conn);
			
		}

		return galleryInfoList;
		
	}
	
	
	public void decreaseStockById(int idx) {
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			
			String sql = "UPDATE gallery_info SET stock = stock - 1 WHERE idx = ?";
			
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

	public void deleteImgById(int idx) {
		
		// idx를 사용해서 img 칼럼의 값을 null로 설정(DB상에서 이미지 삭제)
		Database db = new Database();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			String sql = "UPDATE gallery_info SET img = null WHERE idx = ?";
			
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
	
}