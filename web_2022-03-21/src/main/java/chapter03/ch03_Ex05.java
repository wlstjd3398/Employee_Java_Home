package chapter03;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//url은 이런식으로 구성됨 http://192.168.0.10:8080/ch03_ex05?id=abcd&pw=1234
@WebServlet(name="/ch03_Ex05", urlPatterns= {"/ch03_ex05"})
public class ch03_Ex05 extends HttpServlet {
       

// 요청정보안에 이름으로 받는법
	// doGet방식으로 name과 value과 한쌍으로 전달이 됨
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		//문자열로 꺼내줌
		
		MemberInfo memberInfo = new MemberInfo(id, pw);
		
		//로그인 : 회원 정보 중 사용자가 입력한 아이디와 비밀번호가 일치하는 회원 정보를 select (찾다)
		// 회원정보 DB의 처음부터 끝까지 접근해서
		// n번째 회원의 아이디와 비밀번호가 사용자가 입력한 아이디, 비밀번호와 일치한다면
		// 	로그인 성공
		// 일치하지 않는다면
		// 	로그인 실패
		
		boolean success = false; // 로그인이 실패했다고 가정하고 시작
		for(MemberInfo nthMemberInfo : join.memberInfoList) {
			if(memberInfo.equals(nthMemberInfo)) {		
				// 로그인 성공
				success = true;
				break;
			}
		}
			
		if(success) {
			response.sendRedirect("loginSuccess.html");
		}else {
			response.sendRedirect("loginFail.html");
		}
		
		
		
//		System.out.println("클라이언트가 전달한 id값 = " + id);
//		System.out.println("클라이언트가 전달한 pw값 = " + pw);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
