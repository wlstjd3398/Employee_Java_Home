package chapter06;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����ڿ��� ���ڿ��� �Է� �޾� ������ �����ϰ�
		Scanner scanf = new Scanner(System.in);
		
		String str = scanf.next();
		
		// ����ڰ� �Է��� ���ڿ��� ó������ ������
		// ���� �ϳ��� �����ؼ�
		for(int i=0; i<str.length(); i++) {
			char n = str.charAt(i);
		
		
		// ����ڰ� �Է��� ���ڿ��� n��° ���ڰ�
		// �빮�ڸ� �ҹ��ڷ�
		// �ҹ��ڸ� �빮�ڷ�
		// ��ȯ�ϴ� ���α׷��� �����ض�
		
		if(n >= 'A' && n <= 'Z') {
			n = (char) (n + 32);
		}else if(n >= 'a' && n <= 'z'){
			n = (char) (n - 32);
		}
		
		System.out.println(n);
		}
		
	}

}
