package member.controller;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello World";
		String str2 = "  Hello World";
		String str3 = "Hello World  ";
		String str4 = "  Hello World  ";
		
		System.out.println("str1의 길이 => " + str1.length());
		System.out.println("str2의 길이 => " + str2.length());
		System.out.println("str3의 길이 => " + str3.length());
		System.out.println("str4의 길이 => " + str4.length());
		
		// trim() 메서드 : 문자열의 앞, 뒤 공백을 지워주는 메서드
		str2 = str2.trim();
		str3 = str3.trim();
		str4 = str4.trim();
		
		System.out.println("str2의 길이 => " + str2.length());
		System.out.println("str3의 길이 => " + str3.length());
		System.out.println("str4의 길이 => " + str4.length());
		
		String id = "       ";
		id = id.trim();
		
		if(id.length() == 0) {
			System.out.println("아이디가 공백으로만 이루어져있습니다.");
		}
		
	}

}






