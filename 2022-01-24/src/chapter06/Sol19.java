package chapter06;

import java.util.Random;
import java.util.Scanner;

public class Sol19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("�� ������ ���ٿ� �ϳ��� �Է����ּ���");
		int i = scan.nextInt();
		int j = scan.nextInt();
		System.out.println("�� ������ "+ i+" ��"+j+" �Դϴ�.");
		System.out.println("�� ������ ���� �󸶶�� �����ϼ���?");
		int think=scan.nextInt();
		
		������ �� ������ 1 ~ 100 ���̿� ����
		������ ���߸� �ݺ������� ������ ����
		
		if(think==(i+j)) {
			System.out.println("����!!");
		}else {
			System.out.println("����!! ���α׷��� �����մϴ�.");
		}
		
	}

}
