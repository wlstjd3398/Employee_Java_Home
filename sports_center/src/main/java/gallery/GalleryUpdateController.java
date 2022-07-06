package gallery;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GalleryInfoDao;
import vo.GalleryInfo;


// 갤러리 img빼고 수정
@WebServlet("/gallery/update")
public class GalleryUpdateController extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("idx") == null) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			
			return;
		}
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		GalleryInfo galleryInfo = new GalleryInfo();
		
		galleryInfo.setIdx(idx);
		galleryInfo.setTitle(title);
		galleryInfo.setContent(content);

		GalleryInfoDao dao = new GalleryInfoDao();
		
		dao.updateGalleryInfo(galleryInfo);
		
	
	}
	
}