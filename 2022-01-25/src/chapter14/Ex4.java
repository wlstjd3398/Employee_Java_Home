package chapter14;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("MyException �߻� ��");
		
		// ���������� ���� ������ ��ü�� �����ϴ°� = throw ����ؼ� �߻���Ŵ
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("���ڸ� �Է��ϼ��� >> ");
			int number = scan.nextInt();
			
			if(number % 2 ==0) {
				System.out.println("¦��");
			}else {
				throw new MyException();
			}
		}catch(Exception e) {
			System.out.println("MyException �߻�");
		}finally {
			// ���� �߻� ���ο� ������� �׻� �����ؾ��ϴ� �ҽ��ڵ�
			System.out.println("finally ���� �ҽ��ڵ�");
		}
//		System.out.println("MyException �߻� ��");
		
	}

}
