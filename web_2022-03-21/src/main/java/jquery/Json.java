package jquery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "jquery/Json", urlPatterns = { "/jquery/json" })
public class Json extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
		//우리가 전달하는게 json이고 한글로 포장해봐 
		
		PrintWriter out = response.getWriter();
		
//		out.print({"name", "김철수"});
		//자바에서는 이 방식이 없음
		
//		out.print("{"
//				+" \"name\": \"김철수\","
//				+" \"age\": \"27\","
//				+" \"height\": \"175.3\","
//				+" \"addr\": \"부산광역시\","
//				+" \"university\": \""
//				+ 	"{" 
//				+ 	" \"name\": \"인천대학교\","
//				+ 	" \"major\": \"컴퓨터공학과\","
//				+ 	" \"number\": \"200901454\","
//				+ 	" \"admission\": \"2009\","
//				+ 	" \"graduation\": \"2016\","
//				+ 	"},"
//				+" \"school_name\": \"["\건지초\", "가좌중", "정산고", "인천대"]
//				
//				);
				
		
		
		out.print("{"
				+ "\"name\":\"김철수\","
				+ "\"age\":27,"
				+ "\"height\":175.3,"
				+ "\"addr\":\"부산광역시\","
				+ "\"university\": {"
				+ "\"name\":\"인천대학교\","
				+ "\"major\":\"컴퓨터공학과\", "
				+ "\"number\": 200901454, "
				+ "\"admission\": 2009,"
				+ "\"graduation\": 2016"
				+ "},"
				+ "\"school_name\": [\"건지초\", \"가좌중\", \"정산고\", \"인천대\"]"
				+ "}");
		
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
