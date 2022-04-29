package notice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NoticeInfoDao;
import etc.Database;
import etc.URLConfig;
import service.NoticeService;
import vo.NoticeInfo;

@WebServlet("/notice/controller")
public class NoticeController extends HttpServlet {
	// 공지사항 목록 전달
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 공지사항의 목록을 불러와 전달해주는 서블릿
		
		// 지금 우리 컨트롤러의 구조는
		// 1. 공지사항의 목록을 불러온다.
		// 2. 불러온 목록을 JSON으로 구성해 전달한다.
		
		// 컨트롤러의 구조를 다르게 생각해서
		// 1. 공지사항의 목록을 불러와 JSON으로 구성한다.
		// 2. JSON을 전달한다.
		
		
		// 클라이언트가 페이지넘버 담겨있는 것을 정수로 담아서 전달해줌
		// 문자열을 숫자로 래퍼클래스 사용
		int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		
		
		NoticeService service = new NoticeService();
		String data = service.loadNoticeInfoListToJson(pageNumber);
		
		// JSON을 전달한다.
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print(data);
		
		out.close();
	}

	// 공지사항 쓰기
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		
		// 클라이언트가 보낸 파라미터 값 검증
		
		// 공지사항 데이터들을 공지사항 정보로 뭉쳐줌
		NoticeInfo noticeInfo = new NoticeInfo(title, contents);
		
		NoticeService service = new NoticeService();
		
		boolean result = service.addNotice(noticeInfo);
		
		if(result) {
			// 공지사항 목록 페이지로 이동
			response.sendRedirect(URLConfig.PAGE_NOTICE_LIST_URL);
		} else {
			// 공지사항 추가 실패와 관련된 처리를 함
		}
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		// 클라이언트가 전달한 id를 사용해서
		// DB에서 해당 id를 가지고 있는 공지사항을 삭제
			// 서비스가 없어도되는  단순한 것
		NoticeInfoDao dao = new NoticeInfoDao();
		
		boolean result = dao.deleteNoticeInfoById(id);
		
		// 클라이언트에게 삭제 결과인 200 상태코드를 전달
		if(result) {
			// 200 상태코드 전달
			
		}else {
			// 삭제 하지 못했다는 의미의 상태 코드를 전달
			
		}
		
	}
	
	
	
}









