package chapter05;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanf = new Scanner(System.in);
		
		System.out.println("----���ǰ�----");
		
		System.out.println("1.�ݶ�");
		System.out.println("2.�ݶ�");
		System.out.println("3.ȯŸ");
		System.out.println("4.���̴�");
		System.out.println("5.���̴�");
		System.out.println("6.���̴�");
		System.out.println("7.����ƾ��");
		
		System.out.println("�޴����� ���ּ���(1 ~ 7) ->");

		int menu = scanf.nextInt();
		switch(menu) {
			case 1:
			case 2:
				System.out.println("�ݶ� ���Խ��ϴ�.");
				break;
				
			case 3:
				System.out.println("ȯŸ�� ���Խ��ϴ�.");
				break;
				
			case 4:
			case 5:
			case 6:
				System.out.println("���̴ٰ� ���Խ��ϴ�.");
				break;
			
			case 7:
				System.out.println("����ƾ�డ ���Խ��ϴ�.");
				break;
				
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ùٸ� ���ڸ� �Է����ּ���");
				break;
		}
	}

}
