package member;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberService;
import util.Validator;
import vo.MemberInfo;

@WebServlet("/member/join")
public class JoinController extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				request.setCharacterEncoding("utf-8");

				String id = request.getParameter("id");
				String pw = request.getParameter("pw");
				String pwChk = request.getParameter("pwChk");
				String name = request.getParameter("name");
				String tel = request.getParameter("tel");
				String addr = request.getParameter("addr");
				String email = request.getParameter("email");

				LocalDateTime joinDate = LocalDateTime.now();
				
				Validator validator = new Validator();
	
				MemberInfo newMemberInfo = new MemberInfo(id, pw, name, tel, addr, email, joinDate);
				
				MemberService service = new MemberService();
				
				if(service.isAlreadyIDorTelorEmail(newMemberInfo)) {
					response.setStatus(HttpServletResponse.SC_CONFLICT);
				
					return;
				}
				
				
				int status = service.join(newMemberInfo);
				
				response.setStatus(status);
				
				
				response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	}
}
