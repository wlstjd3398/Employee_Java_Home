package chapter03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "/chapter03_ex01", urlPatterns = {"/chapter03/ex01"})
public class ch03_Ex01 extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		//응답한다 / content형식을 / 어떤형태의 데이터(MIME TYPE)를 / UTF-8로 나타내겠다
		
		PrintWriter outputstream = response.getWriter();
		
		outputstream.append("<html>");
		outputstream.append("	<head>");
		outputstream.append("		<title>Servlet Response Web Page</title>");
		outputstream.append("	<head>");
		
		outputstream.append("	<body>");
		outputstream.append("		<h1>Nice to meet you!</h1>");
		outputstream.append("		<h1>만나서 반갑습니다!</h1>");
		outputstream.append("	</body>");
		
		outputstream.append("</html>");
		outputstream.close(); // 사용 다했으면 닫아주는 거 잊지말자!
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
