package classes;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ClassesInfoDao;
import dao.EnrollListDao;
import exception.BadParameterException;
import vo.ClassesInfo;
import vo.EnrollInfo;
import vo.MemberInfo;


// 수강등록 -> 수강목록 -> 결제(api) -> 홈
// 순서 연결 잘생각하기

@WebServlet("/classes")
public class ClassesController extends HttpServlet{
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	try {
		request.setCharacterEncoding("utf-8");
		
		// member의 id classes의 id
		if(request.getParameter("member_Id") == null || request.getParameter("classes_Id") == null) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		
		HttpSession session = request.getSession();
		MemberInfo loginUserInfo = (MemberInfo) session.getAttribute("loginUserInfo");
		
		String paymentMethod = request.getParameter("paymentMethod");
		int memberIdx = loginUserInfo.getIdx();
		int classesIdx = Integer.parseInt(request.getParameter("idx"));
	
		ClassesInfoDao classesInfoDao = new ClassesInfoDao();
		
		// 수강 번호가 있다면 아래 쭉 진행 ->  +1 증가 
		// 수강 번호가 없다면 상태코드 403 반환
		ClassesInfo classesInfo = classesInfoDao.selectByIdx(classesIdx);
		if(classesInfo.getClassCount() <= 0) {
			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
			return;
		}
		
		classesInfoDao.increaseEnrollByIdx(classesIdx);
		
		// dao 사용해서 
		EnrollInfo enrollInfo = new EnrollInfo(paymentMethod, memberIdx, classesIdx, LocalDateTime.now());
		
		EnrollListDao enrollListDao = new EnrollListDao();
		boolean result = enrollListDao.insertEnrollInfo(enrollInfo);
		
		// 접수 등록 생성시
		response.setStatus(HttpServletResponse.SC_OK);
		
	} catch(BadParameterException e) {
		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	}
	
	}
}
