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

		//배열에 추첨번호를 넣는데 추첨번호길이가 맞지 않는 경우에 다시 입력하게 하고싶어요
		//배열에 휴대폰번호도 넣으려면 이차원배열을 여기서 쓰는게 맞나요?
		
		// 저장된 추첨목록
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

				}
				
			}

		
		for(int i=0; i<arr1Size; i++) {
			System.out.println("추첨목록에 저장된 추첨번호 = " + arr1[i]);
		}
		
		
//			if(limit<=10 && limit>=8) {
//				System.out.println("올바른 추첨번호입니다. 다음 추첨번호를 입력해주세요");
//								
//					
//				break;
//			}else {
//				System.out.println("해당 추첨번호가 일치하지 않습니다. 다시 입력해주세요.");
//			}
		
		
		
		
		
		
	}

}
