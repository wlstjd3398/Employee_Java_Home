package chapter07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.MemberNotFoundException;

public class MemberInfoPrinter {

	private MemberDao memberDao;
	private MemberPrinter memberPrinter;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void setMemberPrinter(MemberPrinter memberPrinter) {
		this.memberPrinter = memberPrinter;
	}
	
	public void printMemberInfo(String email) throws MemberNotFoundException{
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			throw new MemberNotFoundException();
		}
		
		memberPrinter.print(member);
		System.out.println();
	}
	
}
