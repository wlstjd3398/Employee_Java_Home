package chapter05;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ö���� ������ �Է� �޴� ���α׷��� �����ض�
		// �̸� ��ö��, ���� 23��, ����ó 010-1234-5678, Ű 156.7cm, ������ A��
		
		Scanner scanf = new Scanner(System.in);
		System.out.println("ö���� ������ �Է��ض�.");
		
		String str1 = scanf.next();
		System.out.println("�̸�  = " + str1);
		
		int age = scanf.nextInt();
		System.out.println("���� = " + age + "��"); 
		
		String num1 = scanf.next();
		System.out.println("����ó = " + num1);
		
		double height = scanf.nextDouble();
		System.out.println("Ű = " + height);
		
		char blood = scanf.next().charAt(0);
		System.out.println("������ = " + blood + "��");
		
		System.out.println("ö���� ��� ������ = ");
		System.out.println("�̸�  = " + str1);
		System.out.println("���� = " + age + "��"); 
		System.out.println("����ó = " + num1);
		System.out.println("Ű = " + height);
		System.out.println("������ = " + blood + "��");
		
		
	}

}
