package gallery;

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


// 갤러리 img포함 수정
//@WebServlet("/gallery/update")
public class GalleryUpdateController2 extends HttpServlet{
	private static final int MAXINUM_FILE_SIZE = 10 * 1024 * 1024; // 5MB
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getRealPath("/images/picture");
		MultipartRequest mr = new MultipartRequest(request, path, MAXINUM_FILE_SIZE, "utf-8", new DefaultFileRenamePolicy());
		
		if(request.getParameter("idx") == null) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			
			return;
		}
		
		int idx = Integer.parseInt(mr.getParameter("idx"));
		String title = mr.getParameter("title");
		String content = mr.getParameter("content");
		String img = mr.getFilesystemName("img");
		
		if(img == null) {
			img = mr.getParameter("img");
		}
		
		GalleryInfo galleryInfo = new GalleryInfo();
		
		galleryInfo.setIdx(idx);
		galleryInfo.setTitle(title);
		galleryInfo.setContent(content);
		galleryInfo.setImg(img);

		GalleryInfoDao dao = new GalleryInfoDao();
		
		dao.updateGalleryInfo(galleryInfo);
		
	
	}
	
}