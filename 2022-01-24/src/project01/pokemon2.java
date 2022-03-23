package project01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class pokemon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// java에서는 배열 잘안쓰고 컬렉션프레임워크 많이쓰니 list적용시켜봐라
// 학원에서 수정한것 참고하고 java는 배열은 잘쓰지않고 list 잘씀
// chapter17_2,3 컬렉션프레임워크list(1),(2)참고
// list로 해서 다 추첨하고나서 휴대폰번호는 따로 받기
		
		String[] arr1 = new String[2];
		int arr1Size = arr1.length;
		

		System.out.println("빵의 스티커 뒷면의 추첨번호를 입력해주세요");
		
		Scanner drawScan = new Scanner(System.in);
		
			for(int i=0; i<arr1Size; i++) {
				
				
				arr1[i] = drawScan.next();
				
				int limit = arr1[i].length();
				
				System.out.println("추첨번호를 확인하겠습니다.");
				
				if(limit<=10 && limit>=8) {
					System.out.println("확인된 추첨목록의 추첨번호 = " + arr1[i]);
					
				}else {
					System.out.println("추첨번호를 다시 입력해주세요");
					i--;
				}
				
			}

		
		for(int i=0; i<arr1Size; i++) {
			System.out.println("추첨목록에 저장된 추첨번호 = " + arr1[i]);
		}
		
		
		
		
		
//		System.out.println("= = = = = 결과보기 = = = = =");
//		
//		
//        if(true) {
//        	System.out.println("과연");
//    		System.out.println("당첨여부는? ");
//    		Random random1 = new Random();
//    		int yn = random1.nextInt(2);
//    		 if(yn==1) {
//    			 System.out.println("당첨입니다. 해당 휴대폰번호로 안내문자가"
//    			 		+ " 오늘 중으로 갈예정입니다. 그러니 휴대폰번호를 입력해주세요.");
//    			 
//    			// 휴대폰번호
//    			while(true) {
//    				System.out.println("-를 포함한 13자리를 입력해주세요.");
//    				Scanner PhoneScan = new Scanner(System.in);
//    				String phoneNumber = PhoneScan.next();
//    				
//    				int num3 = phoneNumber.length();
//    				if(num3==13) {
//    					System.out.println("올바른 휴대폰번호입니다. 완료되었습니다.");
//    					break;
//    				}else {
//    					System.out.println("휴대폰번호가 일치하지 않습니다. 다시 입력해주세요.");
//    				}
//    			}
//    		 }else if(yn==0) {
//    			 System.out.println("아쉽지만 꽝입니다. 다음 기회에..");
//    		 }
//        }
//        
//        System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
	}

}