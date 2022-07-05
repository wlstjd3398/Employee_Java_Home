package notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NoticeTblDao;
import dto.NoticeInfo;

@WebServlet("/notice/write")
public class NoticeWrite extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 1. 공지사항 작성 서비스에서는 클라이언트가 전달한 제목과 내용을 꺼낸다.
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		
		// 2. 꺼낸 제목과 내용을 하나의 공지사항 정보로 합친다.
		NoticeInfo newNoticeInfo = new NoticeInfo(title, contents);
		
		// 3. 공지사항 정보 목록에 공지사항 정보를 저장한다.
		NoticeTblDao dao = new NoticeTblDao();
		dao.writeNoticeInfo(newNoticeInfo);
		
		// 4. 공지사항 목록 페이지로 이동을 지시한다.
		response.sendRedirect("/web_2022-05-23/notice/list?pageNumber=1");
	}

}







