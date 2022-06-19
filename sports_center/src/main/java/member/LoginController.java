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
			
			MemberService service = new MemberService();
			
			loginInfo = service.selectById(id);
			
			if(loginInfo == null || !loginInfo.getPw().equals(pw)) {
				
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				
			}else {
				HttpSession session = request.getSession();
				session.setAttribute("loginUserInfo", loginInfo);
				
				response.setStatus(HttpServletResponse.SC_OK);
				
			}
	}
		
}

