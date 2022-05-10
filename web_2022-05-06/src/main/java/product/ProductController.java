package product;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exception.BadParameterException;
import service.MemberService;
import util.Validator;
import vo.MemberInfo;

@WebServlet("/product/controller")
public class ProductController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			request.setCharacterEncoding("utf-8");
			
			String name = request.getParameter("name");
			String category = request.getParameter("category");
			int stock = Integer.parseInt(request.getParameter("stock"));
			int price = Integer.parseInt(request.getParameter("price"));
			String img = request.getParameter("img");
			
			// 2. 전달 받은 값을 검증한다
			Validator validator = new Validator();
			
			if(!validator.nameValidator(name))				throw new BadParameterException();
			else if(!validator.categoryValidator(category))	throw new BadParameterException();
			else if(!validator.stockValidator(stock))		throw new BadParameterException();
			else if(!validator.priceValidator(price))		throw new BadParameterException();
			else if(!validator.imgValidator(img))			throw new BadParameterException();
			
			// 3. 전달 받은 값을 하나의 정보로 뭉친다
			MemberInfo newMemberInfo = new MemberInfo(name, category, stock, price, img);
			
			MemberService service = new MemberService();
			
			// Service를 활용해서 아이디 또는 연락처 또는 이메일 중에 중복된 값이 있다면 409 상태코드 보내도록 하기
			if(service.isAlreadyIDorTelorEmail(newMemberInfo)) {
				response.setStatus(HttpServletResponse.SC_CONFLICT);
			
				return;
			}
			
			// 4. 새로운 회원의 정보를 DB에 저장한다
			int status = service.join(newMemberInfo);
			
			// 5-1. 회원 가입에 성공했을경우 성공 시그널 보냄
			response.setStatus(status);
			
			// 5-2. 회원 가입에 실패했을 경우 실패 시그널 보냄
			// - 아이디나 이메일, 연락처가 이미 사용중 일때 : 409
			// - 파라미터가 규칙에 맞지 않을 때 : 400
			
		} catch(BadParameterException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	}
	}

}
