package chapter14;

import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ���ܰ� �ΰ�
//		ArrayIndexOutOfBoundsException �迭 3��°�� ����
//		ArithmeticException 0���� ������ ����
		
		Random random = new Random();
		
		int[] numberList = {2, 1, 0};
		
		int index = random.nextInt(4);
		
		// try catch 2��
//		int number = 1;
//		try {
//			number = numberList[index];
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭�� �ε��� ������ ������ϴ�.");
//		}
//		try {
//			int result = 7 / number;
//			System.out.println("7 / " + number + " = " + result);
//		}catch(ArithmeticException e) {
//			System.out.println("�и�� 0�� �� �����ϴ�.");
//		}
		
		
		// try catch �ѹ��� 2�� ��ħ
//		try {
//			int number = numberList[index];
//			int result = 7 / number;
//			System.out.println("7 / " + number + " = " + result);
//		}catch(ArithmeticException e) {
//			System.out.println("�и�� 0�� �� �����ϴ�.");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭�� �ε��� ������ ������ϴ�.");
//		}
		
		
		// try catch���� catch ��ġ��
		try {
			int number = numberList[index];
			int result = 7 / number;
			System.out.println("7 / " + number + " = " + result);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// ���� ���ܰ� �߻��߰ų� ���� ���ܰ� �߻��ߴٸ� println ���
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		
//		String message = e.getMessage();
//		System.out.println("message = " + message);
//		 �޼��带 ������ö�
//		 ���������� ��ȯŸ�� �޼����̸�(�Ű�����){
//		 �ҽ��ڵ�
//	     }
		 
		 // ��ȯŸ���� String���� ������Ÿ���� ����
		 // ���ܻ����� ���ϵ�
//		 e.printStackTrace();
		 // ������ �������� �˷���
		
	}

}
