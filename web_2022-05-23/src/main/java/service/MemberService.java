package service;

import dao.MemberTblDao;
import dto.MemberInfo;

public class MemberService {
	
	public int join(MemberInfo newMemberInfo) {
		MemberTblDao dao = new MemberTblDao();
		
		boolean success = dao.join(newMemberInfo);
		if(success) {
			return 200;
		} else {
			return 409;
		}
	}
	
	public MemberInfo selectedMemberInfoByIdAndPw(MemberInfo loginMemberInfo) {
		MemberTblDao dao = new MemberTblDao();
		
		MemberInfo memberInfo = dao.selectMemberInfoByIdAndPw(loginMemberInfo);
		if(memberInfo != null) {
			return memberInfo;
		} else {
			// 아이디 또는 비밀번호를 잘못 입력해서 로그인에 실패했다면
			return null;
		}
	}
}







