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
public class JoinController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 전달 받은 값을 꺼낸다
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pwChk = request.getParameter("pwChk");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		String email = request.getParameter("email");
		// 회원 가입일을 생성
		LocalDateTime joinDate = LocalDateTime.now();
		
		// 2. 전달 받은 값을 검증한다
		// 다음주에 Validator를 완성하고 주석을 풀 예정
		Validator validator = new Validator();
		boolean correctId = validator.idValidator(id);
		boolean correctPw = validator.pwValidator(pw);
		boolean correctName = validator.nameValidator(name);
		boolean correctTel = validator.telValidator(tel);
		boolean correctAddr = validator.addrValidator(addr);
		boolean correctEmail = validator.emailValidator(email);
		
		
//		if(!corretID) {
//			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//			return ;
//		}else if(비밀번호가 규칙에 맞지 않으면 ){
//			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//			return ;
//		}else if(비밀번호확인이 규칙에 맞지 않으면 ){
//			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//			return ;
//		}
		
		
		System.out.println("id = " + id);
		System.out.println("pw = " + pw);
		System.out.println("pwChk = " + pwChk);
		System.out.println("name = " + name);
		System.out.println("tel = " + tel);
		System.out.println("addr = " + addr);
		System.out.println("email" + email);
		
		// 3. 전달 받은 값을 하나의 정보로 뭉친다
		MemberInfo newMemberInfo = new MemberInfo(id, pw, name, tel, addr, email, joinDate);
		
		// 4. 새로운 회원의 정보를 DB에 저장한다
		MemberService service = new MemberService();
		int status = service.join(newMemberInfo);
		
		// 5-1. 회원 가입에 성공했을경우 성공 시그널 보냄
		
		// 5-2. 회원 가입에 실패했을 경우 실패 시그널 보냄
		// - 아이디나 이메일, 연락처가 이미 사용중 일때 : 409
		// - 파라미터가 규칙에 맞지 않을 때 : 400
		
		response.setStatus(status);
		
		
	}

}
