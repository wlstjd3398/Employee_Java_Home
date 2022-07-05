package buy.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import buy.dto.BuyInfo;
import buy.service.BuyService;
import exception.BadParameterException;
import member.dto.MemberInfo;
import util.BuyInfoVlidator;

@WebServlet("/product/buy")
public class Buy extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");
			
			String pamentMethod = request.getParameter("paymentMethod");
			int productIdx = Integer.parseInt(request.getParameter("productIdx"));
			
			BuyInfoVlidator validator = new BuyInfoVlidator();
			if(validator.paymentMethodValitor(pamentMethod)) throw new BadParameterException();
			else if(validator.productIdxValidator(productIdx)) throw new BadParameterException();
			
			HttpSession session = request.getSession();
			MemberInfo loginMemberInfo = (MemberInfo) session.getAttribute("memberInfo");
			
			int memberIdx = loginMemberInfo.getMemberIdx();
			
			BuyInfo buyInfo = new BuyInfo();
			buyInfo.setMemberIdx(memberIdx);
			buyInfo.setProductIdx(productIdx);
			buyInfo.setPaymentMethod(pamentMethod);
			buyInfo.setBuyDate(LocalDateTime.now());
			
			BuyService service = new BuyService();
			// 구매 내역 생성
			int status = service.buy(buyInfo);
			if(status == 204) {
				// 재고가 없어 구매하지 못했을 때
				response.setStatus(HttpServletResponse.SC_NO_CONTENT);
			} else if(status == 500) {
				// 재고는 있지만 DB의 문제로 구매 내역을 생성하지 못했을 때
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} else {
				// 구매 내역을 생성했을 때
				response.setStatus(HttpServletResponse.SC_OK);
			}
		} catch(BadParameterException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
	}

}









