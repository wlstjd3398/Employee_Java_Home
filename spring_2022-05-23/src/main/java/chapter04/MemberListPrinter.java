package chapter04;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberListPrinter {

	private MemberDao memberDao;
	private MemberPrinter memberPrinter;
	
//	public MemberListPrinter(MemberDao memberDao, MemberPrinter memberPrinter) {
//		this.memberDao = memberDao;
//		this.memberPrinter = memberPrinter;
//	}
	
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Autowired
	public void setMemberPrinter(MemberPrinter memberPrinter) {
		this.memberPrinter = memberPrinter;
	}
	
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		
		for(Member member : members) {
			memberPrinter.print(member);
		}
		
		System.out.println();
		
		
	}

	
	
}
