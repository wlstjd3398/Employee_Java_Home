package chapter06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ch06_Join", urlPatterns = { "/web_2022-03-21/servlet/member/join" })
public class Join extends HttpServlet {
   public static List<MemberInfo> memberInfoList = new ArrayList<>();
   
   public boolean checkParameter(String id, String pw, HttpServletResponse response) throws IOException {
      // 파라미터가 올바른지 여부
      boolean pass = true;
      
      if(id.length() == 0 || pw.length() == 0) {
         response.sendRedirect("/joinFail.html");
         pass = false;
      } else if(id.indexOf(' ') != -1 || pw.indexOf(' ') != -1) {
         response.sendRedirect("/joinFail.html");
         pass = false;
      } else if(id.length() < 4 || id.length() > 10) {
         response.sendRedirect("/joinFail.html");
         pass = false;
      } else if(pw.length() < 6 || pw.length() > 16) {
         response.sendRedirect("/joinFail.html");
         pass = false;
      }
      
      return pass;
   }
   
   public boolean usedId(String id) {
      // memberInfoList의 처음부터 끝까지 접근
      //   n번째 회원 정보를 꺼냄
      //   n번째 회원 정보에서 ID를 꺼냄
      //   꺼낸 ID와 사용자가 입력한 아이디가 같다면 아이디 중복 이라고 표시
      //   꺼낸 ID와 사용자가 입력한 아이디가 같지않다면 아이디 중복 아님이라고 표시
      
      boolean exist = false;
      for(MemberInfo nthMemberInfo : memberInfoList) {
         String nthID = nthMemberInfo.getId();
         
         if(nthID.equals(id)) {
            // 아이디 중복 표시
            exist = true;
            break;
         }
      }
      
      return exist;
   }
   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // 클라이언트가 전달한 id, pw 값을 꺼냄
      
      String id = request.getParameter("id");
      String pw = request.getParameter("pw");
      String name = request.getParameter("name");
      
      // 회원가입 : 새로운 회원의 정보를 이 사이트의 데이터베이스에 저장하는 것
      MemberInfo memberInfo = new MemberInfo(id, pw, name);
      
      // 아이디 중복 여부 체크
      boolean exist = usedId(id);
      
      // 아이디가 사용 중이라면
      // 회원 가입 실패 페이지로 이동
      if(exist) {
         response.sendRedirect("/member/join/joinFail.html");
      } else {
         // 아이디가 사용중이지 않으면
         // 회원가입
         memberInfoList.add(memberInfo);
         
         Cookie cookie = new Cookie("isLogin", "true");
         response.addCookie(cookie);
         
         Cookie cookie2 = new Cookie("isJoin", "true");
         response.addCookie(cookie2);
         
         // 회원가입 완료 서블릿으로 이동
         response.sendRedirect("/servlet/member/joinSuccess");
      }
   }
}

