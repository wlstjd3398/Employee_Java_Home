package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberInfoDao;
import vo.MemberInfo;

public class MemberService {

	public int join(MemberInfo memberInfo) {
		
		MemberInfoDao dao = new MemberInfoDao();
		
		boolean result = dao.insert(memberInfo);
		
		if(result) {
			return 200;
		}else {
			return 400;
		}
	}
	
	public MemberInfo login(HttpServletRequest request) {
		
		// HttpServletRequest를 가져오다가 상태를 보고 원상복구 시키기도함
		
		// 클라이언트가 보낸 파라미터를 꺼냄
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberInfo memberInfo = new MemberInfo(id, pw);
		
		MemberInfoDao memberInfoDao = new MemberInfoDao();
		
		memberInfo = memberInfoDao.login(memberInfo);
		
		
		// 로그인 처리
		memberInfo = memberInfo.getName() == null ? null : memberInfo;
		// 이름이 들어있는 memberInfo는 그대로 memberInfo를 받음,
		// 이름이 없는 경우는 null을 받음
		
		return memberInfo;
		// boolean을 return하지않고 memberInfo를 return해서 controller로 감
		
	}
	
		
}
