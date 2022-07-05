package notice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NoticeTblDao;
import dto.NoticeInfo;
import util.URL;

@WebServlet("/notice/detail")
public class NoticeDetailController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 클라이언트가 전달한 idx 파라미터 값을 꺼낸다.
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		String requestPage = request.getParameter("requestPage");
		
		// 2. 공지사항 정보 목록에서 idx 파라미터에 맞는 공지사항 정보를 꺼낸다.
		NoticeTblDao dao = new NoticeTblDao();
		
		NoticeInfo noticeInfo = dao.selectNoticeInfoByIdx(idx);
		
		request.setAttribute("noticeInfo", noticeInfo);
		
		String forwardingURI = URL.NOTICE_DETAIL_PAGE;
		if(requestPage != null && requestPage.equals("update")) {
			forwardingURI = "/notice/form.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(forwardingURI);
		rd.forward(request, response);
	}

}






