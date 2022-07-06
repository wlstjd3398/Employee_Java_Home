package gallery;

import java.io.File;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GalleryInfoDao;
import vo.GalleryInfo;

// 갤러리 img빼고 삭제
@WebServlet("/gallery/delete")
public class GalleryDeleteController extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		if(request.getParameter("GalleryId") == null) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		GalleryInfoDao dao = new GalleryInfoDao();
		
		GalleryInfo galleryInfo = dao.selectByIdx(idx);
		if(galleryInfo.getImg() == null) {
			String img = galleryInfo.getImg();
			String path = request.getRealPath("images/picture");
			
			File file = new File(path + "/"+img);
			file.delete();
		}
		
		dao.deleteByIdx(idx);
	}
}