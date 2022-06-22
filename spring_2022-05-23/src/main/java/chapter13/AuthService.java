package chapter13;

import exception.WrongIdPasswordException;

public class AuthService {
	private MemberDao memberDao;

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public AuthInfo authenticate(String email, String password) throws WrongIdPasswordException{
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			throw new WrongIdPasswordException();
		}
		
		if(!member.matchPassword(password)) {
			throw new WrongIdPasswordException();
		}
		
		return new AuthInfo(member.getId(), member.getEmail(), member.getName());
	}
	
}
