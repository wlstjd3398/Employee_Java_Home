package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.MemberService;
import util.Validator;
import vo.MemberInfo;

@WebServlet("/member/login")
public class LoginController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			Validator validator = new Validator();
			
			MemberInfo loginInfo = new MemberInfo();
			loginInfo.setId(id);
			loginInfo.setPw(pw);
			
			// 4. 로그인 성공 / 실패 여부를 판단한다(service에서 아이디와 비밀번호에 맞는 값을 가져온다)
			// 4-1. 로그인 성공 : 상태 정보를 세션에 저장하고 상태 코드 200으로 응답한다
			// 4-2. 로그인 실패
			// 4-2-1. 전달 받은 값이 규칙에 맞지 않을때 : 상태코드 400으로 응답한다
			// 4-2-2. 아이디 또는 비밀번호가 틀렸을때 : 상태코드 401로 응답한다
			MemberService service = new MemberService();
			
			loginInfo = service.selectId(id);
			
			if(loginInfo == null || !loginInfo.getPw().equals(pw)) {
				
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				
			}else {
				HttpSession session = request.getSession();
				session.setAttribute("loginUserInfo", loginInfo);
				
				response.setStatus(HttpServletResponse.SC_OK);
				
			}
	}
		
}

