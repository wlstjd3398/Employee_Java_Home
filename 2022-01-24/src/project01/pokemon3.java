package project01;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class pokemon3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 7.결과보기버튼
		System.out.println("=====결과버튼 누른 후=====");
		// 해당 발표날짜에 일치하면 당첨여부와 핸드폰번호입력창 표시(작성 중)
		// 해당 발표날짜에 일치하지않으면 발표날짜 멘트 출력(작성 중)
//		if(today==date) {
//		
//	}
		
		
		//방법1
//		Scanner scan1 = new Scanner(System.in);
//		LocalDate now = LocalDate.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH");
//		String today = now.format(formatter);
//		System.out.println(today);
		
		
//		SimpleDateFormat Format1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 MM분");
//		Date date = new Date();
//		pt = date.setTime(1647540000);
//		System.out.println(date);
//		System.out.println(pt);
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 MM분");
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(1647540000000);
		System.out.println("밀리초를 날짜로 변환 = "+ format1.format(cal.getTime()));
		
		
//		String today = Format1.format(date).toString();
//		System.out.println(today);
		
		

		
		//방법2
//		SimpleDateFormat Format2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 MM분");
//		Date time = new Date();
//		String timedate = Format2.format(time).toString();
//		System.out.println(timedate);
		
		
		
		
		
		
		
		// 해당 날짜인 경우에는 당첨여부 먼저 표시
		// 당첨인 경우 휴대폰번호 입력해야함
		// 꽝인 경우 멘트만 출력
//		System.out.println("당신의 당첨여부는?");
//		Scanner scan1 = new Scanner(System.in);
//		int yn = scan1.nextInt(2);
//		 if(yn==1) {
//			 System.out.println("당첨입니다. 해당 휴대폰번호로 안내문자가"
//			 		+ " 오늘 중으로 갈예정입니다. 그러니 휴대폰번호를 입력해주세요.");
//			// 휴대폰번호
//			while(true) {
//				System.out.println("-를 포함한 13자리를 입력해주세요.");
//				Scanner scan2 = new Scanner(System.in);
//				String phoneNumber = scan2.next();
//				
//				int num1 = phoneNumber.length();
//				if(num1==13) {
//					System.out.println("올바른 휴대폰번호입니다.");
//					break;
//				}else {
//					System.out.println("휴대폰번호가 일치하지 않습니다. 다시 입력해주세요.");
//				}
//				continue;
//			}
//		 }else if(yn==0) {
//			 System.out.println("아쉽지만 꽝입니다. 다음 기회에..");
//		 }
		
		 
		
		
		
		
		
	}

}
