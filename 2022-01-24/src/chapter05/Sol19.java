package chapter05;

import java.util.Scanner;

public class Sol19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanf = new Scanner(System.in);
		System.out.println("id�� pw�� �Է��ؾ��մϴ�");
		System.out.print("id�� �Է����ּ���--> ");
		String id = scanf.next();
		System.out.print("pw�� �Է����ּ���--> ");
		String pw = scanf.next();
		
		
		int idlen = id.length();
		int pwlen = pw.length();
		
		
		if(idlen >= 4 && idlen <= 16) {
			System.out.println("����� ���̵��� ���̰� ��ġ�մϴ�.");
		}else {
			System.out.println("����� ���̵��� ���̰� ��ġ���� �ʽ��ϴ�.");
		}
		
		
		if(pwlen >= 6 && pwlen <= 16) {
			System.out.println("����� �н������� ���̰� ��ġ�մϴ�.");
		}else {
			System.out.println("����� �н������� ���̰� ��ġ���� �ʽ��ϴ�.");
		}
		
		
	}

}
