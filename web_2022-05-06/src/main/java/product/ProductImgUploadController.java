package product;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.ProductInfoDao;
import vo.ProductInfo;

//상품 정보 추가, 수정과 같이 클라이언트가 multipart/form-data 로 파라미터를 보내면 
//request로 파라미터를 꺼낼 수 없음
//반드시 request를 MultipartRequest로 변환해야함

//상품 정보를 수정할 때 이미지 파일은 그대로이고
//상품 이름, 카테고리, 재고, 가격을 수정하는 상황에서는
//img 파라미터를 보내지 않기 때문에
//DB의 상품 정보에 이미지 파일이 NULL이 됨
//-> 해결방법 : 이와 같은 상황에서는 img 파라미터에 기존에 이미지 파일명을 담아서 보내도록
//		(postman을 사용해서 이와 같이 해결하는건 쉬움, HMTL/CSS/JS를 사용해서 이와 같이 처리하는 건 약간 어려울 수 있음)


//@WebServlet("/product/update")
public class ProductImgUploadController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if(request.getParameter("productId") == null) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			
			return;
		}
		
		int productId = Integer.parseInt(request.getParameter("productId"));
		// idx을 사용해서 상품정보를 수정해라
		ProductInfoDao dao = new ProductInfoDao();
		
		ProductInfo productInfo = dao.selectByIdx(productId);
		
		// img가 실제 있는 경로
		String path = request.getRealPath("/images/product/"+productInfo.getImg());
		
		int maximumSize = 10 * 1024 * 1024;
		String encoding = "utf-8";
		
		MultipartRequest multi = new MultipartRequest(request, path, maximumSize, encoding, new DefaultFileRenamePolicy());
		
		request.setCharacterEncoding("UTF-8");
		
		
		
		// 해당 경로의 파일 삭제
		File file = new File("삭제할 파일의 경로");
		
		// DB 상에서 이미지 파일 삭제
		dao.deleteImgById(productId);
		
		
		// 전달 받은 값 검증
		
		// 검증 후 카테고리 수정
		
		
		// 전달 받은 값을 하나의 정보로 합침
		ProductInfo productInfo = new ProductInfo();
		
		productInfo.setImg(img);

		ProductInfoDao dao = new ProductInfoDao();
		
		dao.updateProductInfo(productInfo);
		
	
	}
	
	
	

}
