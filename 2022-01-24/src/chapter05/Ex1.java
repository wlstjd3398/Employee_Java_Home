package chapter05;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner ���̺귯�� -> ����ڿ��� ���� �Է� �ޱ� ���� ��ɵ��� �������, �ν��Ͻ� = Scanner�� scanf�� ��üȭ���״�
		// scanf. = .�ȿ���� ������, nextInt �ȿ� ������ �޾ƺ���
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("ö���� ���������� �Է��ϼ��� -> ");
		
		int kor = scanf.nextInt();
		
		System.out.println("�Ǽ� �Է� -> ");
		double num = scanf.nextDouble();
		
		System.out.println("���ڿ� �Է� -> ");
		String str = scanf.next();
		
		System.out.println("���� �Է� -> ");
		char ch = scanf.next().charAt(0);
		
		System.out.println("ö���� �������� = " + kor);
		
		
				
				
				
	}

}
