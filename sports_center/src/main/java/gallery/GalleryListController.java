package gallery;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GalleryInfoDao;
import vo.GalleryInfo;

// 갤러리 목록
@WebServlet("/gallery/list")
public class GalleryListController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pageNumber = 1;
		
		if(request.getParameter("pageNumber") != null) {
			pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		}
		
		GalleryInfoDao dao = new GalleryInfoDao();
		
		int amountOfGalleryInfo = dao.getCount();
		
		int startIndex = (pageNumber - 1) * 6;
		if(startIndex >= amountOfGalleryInfo) {
			response.setStatus(HttpServletResponse.SC_NO_CONTENT);
			return;
		}
		
		List<GalleryInfo> galleryInfoList = dao.selectAll(pageNumber);
		
		request.setAttribute("galleryList", galleryInfoList);
		
		RequestDispatcher rd = request.getRequestDispatcher("/gallery/list.jsp");
		rd.forward(request, response);
		
		
	}


}
