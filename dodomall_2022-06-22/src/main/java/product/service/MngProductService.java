package product.service;

import java.io.File;

import product.dao.MngProductInfoDao;
import product.dto.ProductInfo;

public class MngProductService {
	public boolean deleteProduct(int productIdx, String realPath) {
		MngProductInfoDao dao = new MngProductInfoDao();
		
		ProductInfo productInfo = dao.selectByProductIdx(productIdx);
		if(productInfo.getImg() != null) {
			File file = new File(realPath + productInfo.getImg());
			
			file.delete();
		}
		
		dao.delete(productIdx);
		
		return true;
	}
	
	public boolean addImg(int productIdx, String img) {
		MngProductInfoDao dao = new MngProductInfoDao();
		
		return dao.updateImg(productIdx, img);
	}

	public boolean deleteImg(int productIdx, String path) {
		MngProductInfoDao dao = new MngProductInfoDao();
		
		ProductInfo productInfo = dao.selectByProductIdx(productIdx);
		
		String img = productInfo.getImg();
		
		File file = new File(path + "\\" + img);
		
		if(file.delete()) {
			dao.setImgNull(productIdx);
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean add(ProductInfo newProductInfo) {
		MngProductInfoDao dao = new MngProductInfoDao();
		
		return dao.insert(newProductInfo);
	}
	
	public boolean update(ProductInfo updateProductInfo) {
		MngProductInfoDao dao = new MngProductInfoDao();
		
		return dao.update(updateProductInfo);
	}
	
}
