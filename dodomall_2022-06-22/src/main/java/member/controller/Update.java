package member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import exception.BadParameterException;
import member.dto.MemberInfo;
import member.service.MemberService;
import util.MemberInfoValidator;

@WebServlet("/member/update")
public class Update extends HttpServlet {
	
	// 1. 가장 이상적인 상황(연락처가 사용중이지 않고, 이메일도 사용중이지 않은 경우)에서 동작하도록 개발
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");
			
			// 사용자가 비밀번호를 바꾸지 않는다면 oldPw, newPw, newPwChk는 전달되지 않거나
			// 전달되더라도 빈문자열로 전달될 수 있음
			// 전달되지 않으면 getParmeter() 메서드는 null 을 반환
			// 빈문자열로 전달되면 getParameter() 메서드는 빈 문자열을 반환
			String oldPw = request.getParameter("oldPw");
			String newPw = request.getParameter("newPw");
			String newPwChk = request.getParameter("newPwChk");
			String name = request.getParameter("name");
			String tel = request.getParameter("tel");
			String addr = request.getParameter("addr");
			String email = request.getParameter("email");
			
			MemberInfoValidator validator = new MemberInfoValidator();
			if(oldPw != null && oldPw.length() > 0) {
				// 사용자가 비밀번호를 변경하기 위해서 현재 비밀번호, 새 비밀번호, 새 비밀번호 확인을 입력했을 경우
				if(validator.pwValidator(oldPw)) 			throw new BadParameterException();
				else if(validator.pwValidator(newPw)) 		throw new BadParameterException();
				else if(!newPw.equals(newPwChk))			throw new BadParameterException();
			}
			
			if(validator.nameValidator(name)) 			throw new BadParameterException();
			else if(validator.telValidator(tel)) 		throw new BadParameterException();
			else if(validator.emailValidator(email)) 	throw new BadParameterException();
			
			HttpSession session = request.getSession();
			MemberInfo loginMemberInfo = (MemberInfo) session.getAttribute("memberInfo");
			
			if(oldPw != null && oldPw.length() > 0) {
				String nowPw = loginMemberInfo.getPw();
				if(!nowPw.equals(oldPw)) throw new BadParameterException();
			}
			
			MemberInfo updateMemberInfo = new MemberInfo();
			if(oldPw != null && oldPw.length() > 0) {
				updateMemberInfo.setPw(newPw);
			} else {
				updateMemberInfo.setPw(loginMemberInfo.getPw());
			}
			
			updateMemberInfo.setName(name);
			updateMemberInfo.setTel(tel);
			updateMemberInfo.setAddr(addr);
			updateMemberInfo.setEmail(email);
			
			int memberIdx = loginMemberInfo.getMemberIdx();
			updateMemberInfo.setMemberIdx(memberIdx);
			
			MemberService service = new MemberService();
			
			if(service.update(loginMemberInfo, updateMemberInfo)) {
				// 로그인할 때 세션에 memberIdx, id, pw, name, tel, addr, email, joinDate 를 가지고 있는
				// 로그인한 사용자의 정보를 저장하므로 정보 수정 인터페이스에서 세션에 새로운 로그인한 사용자의 정보를 저장할 때도
				// 이와 같은 값들을 가지고 있는 새로운 로그인한 사용자의 정보를 저장해야함
				updateMemberInfo.setId(loginMemberInfo.getId());
				updateMemberInfo.setJoinDate(loginMemberInfo.getJoinDate());
				
				session.setAttribute("memberInfo", updateMemberInfo);
			} else {
				// 1. 409
				response.setStatus(HttpServletResponse.SC_CONFLICT);
			}
		} catch(BadParameterException e) {
			// 2. 400
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	}
}










