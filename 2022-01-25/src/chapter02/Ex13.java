package chapter02;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �Ǽ� > ���� > ����
		
//		char ch = 'A';
//		
//		// ��ĳ����(���ڸ� ����ȭ��Ŵ) : �� ��ȯ ������ ��������
//		int num1 = (int) ch;
//		
//		
////		int num1 = ch;
//		
//		System.out.println("ch = " + ch);
//		System.out.println("num1 = " + num1);
//		
//		
//		// ��ĳ����(�������� �Ǽ�ȭ��Ŵ)
//		double num2 = (double) num1;
//		
//		System.out.println("num1 = " + num1);
//		System.out.println("num2 = " + num2);
		
		
		
		// �ٿ�ĳ����(�Ǽ��� ����ȭ��Ŵ)
		double num1 = 3.14;
		
		// �ٿ�ĳ������ �Ҷ����� �� ��ȯ �����ڸ� �ݵ�� �ٿ�����
		// ��? �ٿ�ĳ������ ��쿡�� ���� �����Ͱ� ���� �ɼ� �����Ƿ�
		// �츮�� �װ� �����ϰ� �ִٴ� �ǹ̷� �ݵ�� �ٿ������
				
		int num2 = (int) num1;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		// �ٿ�ĳ����(������ ����ȭ��Ŵ)
		num2 = 65;
		char ch = (char) num2;
		System.out.println("num2 = " + num2);
		System.out.println("ch = " + ch);
		 
		
	}

}
