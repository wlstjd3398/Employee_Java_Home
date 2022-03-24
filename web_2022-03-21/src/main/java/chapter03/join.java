package chapter03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ch03_Join", urlPatterns= {"/ch03_join"})
public class join extends HttpServlet {
	public static List<MemberInfo> memberInfoList = new ArrayList<>();
	//클래스 멤버변수가 되게 해야함 static
	public boolean checkParameter(String id, String pw, HttpServletResponse response) throws IOException{
		// void -> boolean으로 바꿔서
		
		// 파라미터가 올바른지 여부밑에서 갖고있도록
		boolean pass = true;
		
		//아이디랑 비밀번호 파라미터를 확인 -> 매개변수
		
		// 2. 아이디 입력 여부
		// 아이디를 입력하지 않았다면 회원가입 실패 처리
		// 아이디를 입력했다면 그 다음 동작을 진행
				
		//id가 어떻게 나오는지 확인
//		System.out.println(id);
//		System.out.println(id.length());
		
		// id의 길이가 0이라면 = id를 입력하지 않았다면
//		회원가입시 상황
//		아이디와 비밀번호를 입력
//		아이디는 입력하지않고 비밀번호만 입력
//		아이디는 입력하고 비밀번호를 입력하지 않음
//		아이디와 비밀번호 모두 입력하지 않음
		if(id.length() == 0 || pw.length() == 0 ) {
			response.sendRedirect("/joinFail.html");
			pass = false;
//		공백문자의 인덱스번호를 알려줌
//		사용자가 입력한 아이디 또는 비밀번호에서 공백이 있다면 실패처리를 해라
			
		}else if(id.indexOf(' ') != -1 || pw.indexOf(' ') != -1) {
			response.sendRedirect("/joinFail.html");
			pass = false;
		}else if(id.length() < 4 || id.length() > 10) {
			response.sendRedirect("/joinFail.html");
			pass = false;
		}else if(pw.length() < 6 || pw.length() > 16) {
			response.sendRedirect("/joinFail.html");
			pass = false;
		}
//		else if(id.indexOf('! @ #')만가능하게  아이디에 우리가 정하지 않은 특수문자가 들어있을 경우) {
//					
//		}else if(pw.indexOf('~ !')만가능하게  비밀번호에 우리가 정하지 않은 특수문자가 들어있을 경우) {
//					
//		}

		//response 컴파일오류나는건 throws IOException을 붙여 예외처리함
		
		return pass;
	}
	
	
	//아이디 중복여부는 boolean으로 불러옴
	public boolean usedId(String id) {
		// 1.아이디 중복 여부 체크
		// memberInfoList의 처음부터 끝까지 접근
		// n번째 회원 정보를 꺼냄
		// n번째 회원 정보에서 ID를 꺼냄
		// 꺼낸 ID와 사용자가 입력한 아이디가 같다면 아이디 중복 이라고 표시
		// 꺼낸 ID와 사용자가 입력한 아이디가 같지않다면 아이디 중복 아님이라고 표시
				
		boolean exist = false; // 사용자가 입력한 아이디는 무조건 중복된 상황을 가정해야함
		
		for(MemberInfo nthMemberInfo : memberInfoList) {
			String nthID = nthMemberInfo.getId();
			if(nthID.equals(id)) {
				// 아이디 중복 표시
				exist = true;
				break; // 다음사용자와 중복될 일이 없다하고 빠져나감
			}
			
		}
		
		return exist;
		//exist에 중복여부에 리턴
	}
	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트가 전달한 id, pw 값을 꺼냄
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//메서드로 response객체를 checkParameter로 전달
		//파라미터가 올바른지 여부를 확인(checkParameter) 할때
		//올바르지 않다면 클라이언트가 리다이렉트 해야할 경로를 지정해줬으므로
		//올바르지 않을 때는 리다이렉트 해야할 경로로 이동하도록 이 서블릿이 그대로 끝날수 있게  if문을 구성
		boolean pass = checkParameter(id, pw, response);
		if(!pass) {
			return;
		}
		
		
		// 회원가입 : 새로운 회원의 정보를 이 사이트의 데이터베이스에 저장하는 것
		// 아직 db 연결을 안배웠으니 db 역할을 할 list를 사용할 예정
		MemberInfo memberInfo = new MemberInfo(id, pw);
		
		// 아이디 중복 여부 체크
		boolean exist = usedId(id);
		
		// 아이디가 사용 중이라면 
		// 회원 가입 실패 페이지로 이동
		if(exist) {
			response.sendRedirect("/joinFail.html");
		}else {
			// 아이디가 사용중이지 않으면
			//회원가입
			memberInfoList.add(memberInfo);
			
			//회원가입 완료 페이지로 이동
			response.sendRedirect("/joinSuccess.html");
		}
		
		
		
	}

}
