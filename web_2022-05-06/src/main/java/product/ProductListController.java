package product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductInfoDao;

@WebServlet("/product/list")
public class ProductListController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		
		ProductInfoDao productInfoDao = new ProductInfoDao();
		String data = "{\"amount\": " + productInfoDao.loadProductList(pageNumber) + ","
				"\"list\":["
				;
		
		
	}

}
