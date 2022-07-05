package notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NoticeTblDao;

@WebServlet("/notice/delete")
public class NoticeDelete extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));

		NoticeTblDao dao = new NoticeTblDao();
		dao.deleteByIdx(idx);
		
		response.sendRedirect("/web_2022-05-23/notice/list?pageNumber=1");
	}
}



