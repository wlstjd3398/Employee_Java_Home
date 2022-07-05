package notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NoticeTblDao;
import dto.NoticeInfo;

@WebServlet("/notice/update")
public class NoticeUpdate extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		
		NoticeInfo noticeInfo = new NoticeInfo(idx, title, contents);
		
		NoticeTblDao dao = new NoticeTblDao();
		dao.updateNoticeInfo(noticeInfo);
		
		response.sendRedirect("/web_2022-05-23/notice/detail?idx="+idx);
	}

}




