package chapter07;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

public class MemberPrinter {

	public void print(Member member) {
		String text1 = "아이디="+ member.getId();
		String text2 = "이메일="+ member.getEmail();
		String text3 = "이름="+ member.getName();
		String text4 = "등록일="+ member.getRegisterDateTime();
		
		String text = "회원 정보 : "+ text1 + ", "+ text2 + ", " + text3 + ", "+ text4;
		
		System.out.println(text);
		
		
	}
	
	
}
