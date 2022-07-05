package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.MemberInfo;
import util.DatabaseManager;

public class MemberTblDao {
	
	public boolean join(MemberInfo memberInfo) {
		Connection conn = null;
		PreparedStatement selectPstmt = null;
		PreparedStatement insertPstmt = null;
		ResultSet rs = null;
		
		// 회원 정보를 저장한다. ( 회원 정보 테이블에 회원 정보를 INSERT 한다. )
		try {
			conn = DatabaseManager.getConnection();
			
			// 가입하려는 아이디가 이미 사용중인지 아닌지 판별하는 부분
			// 가입 하려는 아이디로 회원 정보를 조회
			String sql = "SELECT * FROM membertbl WHERE memberID = ?";
			
			selectPstmt = DatabaseManager.getPstmt(conn, sql);
			selectPstmt.setString(1, memberInfo.getId());
			
			rs = selectPstmt.executeQuery();
			
			// 조회 결과가 있다면 이미 사용중인 아이디이므로 409 상태 코드를 설정하고 회원 가입이 이뤄지면 안됨 ( 흐름이 여기서 끝나야함 )
			if(rs.next()) {
				// 이미 사용 중인 아이디로 가입을 시도했다면
				return false;
			}
			
			// 조회 결과가 없다면 사용중인 아이디가 아니므로 회원 가입이 진행 되도록 해야함
			
			// 가입하려는 아이디가 이미 사용중인지 아닌지 판별하는 부분
			
			// 회원 가입을 하는 부분
			// 실행할 쿼리 준비
			sql = "INSERT INTO membertbl VALUES(?, ?, ?)";
			
			// 쿼리를 실행하고 결과를 가져올 객체(PreparedStatement) 생성
			insertPstmt = DatabaseManager.getPstmt(conn, sql);
			insertPstmt.setString(1, memberInfo.getId());
			insertPstmt.setString(2, memberInfo.getPw());
			insertPstmt.setString(3, memberInfo.getName());
			
			// 쿼리를 실행하고 결과를 가져옴
			int count = insertPstmt.executeUpdate();
			// 회원 가입을 하는 부분
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			
			return false;
		} finally {
			// DB에 접속하고 SQL을 실행하기 위해 생성한 자원 해제
			DatabaseManager.closeResultSet(rs);
			DatabaseManager.closePstmt(selectPstmt);
			DatabaseManager.closePstmt(insertPstmt);
			DatabaseManager.closeConn(conn);
		}
	}
	
	public MemberInfo selectMemberInfoByIdAndPw(MemberInfo memberInfo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MemberInfo selectedMemberInfo = null;
		
		try {
			conn = DatabaseManager.getConnection();
			
			// 실행할 쿼리를 작성 ( 사용자가 입력한 아이디와 비밀번호를 사용해서 일치하는 회원 정보를 조회 )
			String sql = "SELECT * FROM membertbl WHERE memberID = ? AND memberPW = ?";
			
			// 쿼리를 실행하고 결과를 가져올 PreParedStatement객체 생성
			pstmt = DatabaseManager.getPstmt(conn, sql);
			pstmt.setString(1, memberInfo.getId());
			pstmt.setString(2, memberInfo.getPw());
			
			// 쿼리를 실행하고 결과를 가져옴
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String memberID = rs.getString("memberID");
				String memberPW = rs.getString("memberPW");
				String memberName = rs.getString("memberName");
				
				selectedMemberInfo = new MemberInfo(memberID, memberPW, memberName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// DB와 관련된 자원 해제
			DatabaseManager.closeResultSet(rs);
			DatabaseManager.closePstmt(pstmt);
			DatabaseManager.closeConn(conn);
		}
		
		return selectedMemberInfo;
	}
}














