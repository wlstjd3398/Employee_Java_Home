package gallery;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.GalleryInfoDao;
import exception.BadParameterException;
import vo.GalleryInfo;


// 갤러리 추가(img 추가)
@WebServlet("/gallery/add")
public class GalleryAddController {
	private static final int MAXINUM_FILE_SIZE = 10 * 1024 * 1024; // 10MB
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String path = request.getRealPath("images/picture");
			
			MultipartRequest mr = new MultipartRequest(request, path, MAXINUM_FILE_SIZE, "utf-8", new DefaultFileRenamePolicy());
			
			String title = mr.getParameter("title");
			String content = mr.getParameter("content");

			String img = mr.getFilesystemName("img");
			String writer = mr.getParameter("writer");
			LocalDateTime insertDate = LocalDateTime.now();
			int hits = Integer.parseInt(mr.getParameter("hits"));
			
			
			GalleryInfo galleryInfo = new GalleryInfo(title, content, img, writer, insertDate, hits);
			
			GalleryInfoDao galleryInfoDao = new GalleryInfoDao();
			
			galleryInfoDao.insertGalleryInfo(galleryInfo);
			
			
			response.sendRedirect("http://localhost:8080/sports_center/gallery_list.jsp?active=gallery_list&pageNumber=1");
			
	}
	
}