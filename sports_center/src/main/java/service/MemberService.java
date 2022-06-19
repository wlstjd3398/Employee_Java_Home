package service;

import dao.MemberInfoDao;
import vo.MemberInfo;

public class MemberService {

	private boolean isAlreadyID(String id) {
		
		MemberInfoDao dao = new MemberInfoDao();
		
		MemberInfo memberInfo = dao.selectById(id);
		
		if(memberInfo == null) {
			return false;
		} else {
			return true;
		}
		
	}
	
	private boolean isAlreadyTel(String tel) {
		
		MemberInfoDao dao = new MemberInfoDao();
		
		MemberInfo memberInfo = dao.selectByTel(tel);
		
		if(memberInfo == null) {
			return false;
		} else {
			return true;
		}
		
	}
	
	private boolean isAlreadyEmail(String email) {
		
		MemberInfoDao dao = new MemberInfoDao();
		
		MemberInfo memberInfo = dao.selectByEmail(email);
		
		if(memberInfo == null) {
			return false;
		} else {
			return true;
		}
		
	}
	
	
	public boolean isAlreadyIDorTelorEmail(MemberInfo memberInfo) {
		String id = memberInfo.getId();
		String tel = memberInfo.getTel();
		String email = memberInfo.getEmail();
		
		// 유니크 아이디
		if(isAlreadyID(id)) {
			return true;
		}
		// 유니크 연락처
		if(isAlreadyTel(tel)) {
			return true;
		}
		// 유니크 이메일
		if(isAlreadyEmail(email)) {
			return true;
		}
		
		return false;
	}
	
	
	public int join(MemberInfo memberInfo) {
		
		MemberInfoDao dao = new MemberInfoDao();
		
		boolean result = dao.insert(memberInfo);
		
		if(result) {
			return 200;
		}else {
			return 400;
		}
	}
	
	
	public MemberInfo selectById(String id) {
		MemberInfoDao dao = new MemberInfoDao();
		
		return dao.selectById(id);
	}
}
