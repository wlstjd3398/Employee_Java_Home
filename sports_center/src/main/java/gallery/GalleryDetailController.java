package gallery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GalleryInfoDao;
import exception.BadParameterException;
import vo.GalleryInfo;

// 갤러리 상세
@WebServlet("/gallery/detail")
public class GalleryDetailController {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			if(request.getParameter("idx") == null) {
				throw new BadParameterException();
			}
			
			int idx = Integer.parseInt(request.getParameter("idx"));
			
			GalleryInfoDao dao = new GalleryInfoDao();
			
			GalleryInfo galleryInfo = dao.selectByIdx(idx);
			
			galleryInfo = dao.increasehitsByIdx(idx);
			
			if(galleryInfo == null) {
				response.setStatus(HttpServletResponse.SC_NO_CONTENT);
				return;
			}
			
			
			
			String data = "{\"title\":\"(1)\", \"content\":\"(2)\",\"img\":(3)\"}";
			data = data.replace("(1)", galleryInfo.getTitle());
			data = data.replace("(2)", galleryInfo.getContent());
			data = data.replace("(3)", galleryInfo.getImg());
			
			response.setContentType("application/json;charset=utf=8");
			
			PrintWriter out = response.getWriter();
			
			out.print(data);
			
			out.close();
			
		}catch(BadParameterException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
	}
	
}