package notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice/controller")
public class NoticeController3 extends HttpServlet{

//	공지사항 목록, 공지사항 전체갯수, 
//	공지사항 쓰기, 공지사항 삭제,
//	공지사항 수정, 상세보기페이지 데이터불러오기
	

	// 공지사항 목록
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	// 공지사항 쓰기
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	
	// 공지사항 삭제
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	
	
}
