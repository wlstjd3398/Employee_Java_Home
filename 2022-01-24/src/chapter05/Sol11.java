package chapter05;

import java.util.Scanner;

public class Sol11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanf = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� -->");
		int year = scanf.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("������ ����");
		}else {
			System.out.println("������ �ƴ� ����");
		}
		
	}

}
