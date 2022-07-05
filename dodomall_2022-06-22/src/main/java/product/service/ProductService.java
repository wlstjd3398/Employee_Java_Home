package product.service;

import java.util.List;

import product.dao.ProductInfoDao;
import product.dto.ProductInfo;

public class ProductService {
	public ProductInfo getProductInfo(int productIdx) {
		ProductInfoDao dao = new ProductInfoDao();
		
		// DAO를 통해서 상품 상세 정보를 불러옴
		ProductInfo productInfo = dao.selectByProductIdx(productIdx);
		
		return productInfo;
	}
	
	public int getAmount() {
		ProductInfoDao dao = new ProductInfoDao();
		
		// DAO를 통해서 등록된 전체 상품의 수를 가져옴
		int amount = dao.getAmount();
		
		return amount;
	}

	public List<ProductInfo> getProductInfoList(int pageNumber) {
		pageNumber = (pageNumber-1) * 8;
		
		ProductInfoDao dao = new ProductInfoDao();
		
		// DAO를 통해서 페이지 번호에 맞는 상품 목록을 가져옴
		List<ProductInfo> productInfoList = dao.getProductInfoList(pageNumber);
		
		return productInfoList;
	}
	
}






