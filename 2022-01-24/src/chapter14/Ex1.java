package chapter14;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� >>");
		int val1 = scan.nextInt();
		
		System.out.print("�и� >>");
		int val2 = scan.nextInt();
		
		if(val2==0) {
			System.out.println("�и�� 0�� �� �����ϴ�.");
		}else {
//			int result = val1 / val2;
//			System.out.println("result = " + result);
		}
		// if����ó����
		
		// ����ó�� try catch
		try {
			int result = val1 / val2;
			System.out.println("result = " + result);
			System.out.println("try ��");
		}catch(ArithmeticException e) {
			System.out.println("�и�� 0�� �� �����ϴ�.");
			System.out.println("catch ��");
		}
		System.out.println("try ��");
		
		
	}

}
