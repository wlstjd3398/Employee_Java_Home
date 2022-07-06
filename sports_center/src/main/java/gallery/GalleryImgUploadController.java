package gallery;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.GalleryInfoDao;
import vo.GalleryInfo;

//@WebServlet("/Gallery/update")
public class GalleryImgUploadController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if(request.getParameter("idx") == null) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			
			return;
		}
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		String img = request.getParameter("img");
		
		GalleryInfoDao dao = new GalleryInfoDao();
		
		GalleryInfo galleryInfo = dao.selectByIdx(idx);
		
		// img가 실제 있는 경로
		String path = request.getRealPath("/images/gallery/"+galleryInfo.getImg());
		
		int maximumSize = 10 * 1024 * 1024;
		String encoding = "utf-8";
		
		MultipartRequest multi = new MultipartRequest(request, path, maximumSize, encoding, new DefaultFileRenamePolicy());
		
		request.setCharacterEncoding("UTF-8");
		
		
		File file = new File("/images/picture");
		
		dao.deleteImgById(idx);
		
		
		galleryInfo = new GalleryInfo();
		
		galleryInfo.setImg(img);

		dao = new GalleryInfoDao();
		
		dao.updateGalleryInfo(galleryInfo);
		
	
	}
	
	
	

}
