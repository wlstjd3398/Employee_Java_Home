package chapter02;

import java.util.Collection;

public class MemberListPrinter {

	private MemberDao memberDao;
	private MemberPrinter memberPrinter;
	
	public MemberListPrinter(MemberDao memberDao, MemberPrinter memberPrinter) {
		this.memberDao = memberDao;
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
