package chapter07;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object2 obj2 = new Object2();
		Object2 obj3 = new Object2();
		
		obj2.num1 = 1;
		obj3.num1 = 2;
		
		// �� ���α׷��� ���� ������ �м��ϼ���
		System.out.println("obj2.num1 = " + obj2.num1);
		System.out.println("obj3.num1 = " + obj3.num1);
		
		// Object2�� ���� num2�� Ŭ���� ��������� static�� �پ�����
		Object2.num2 = 3;
		System.out.println("Object2.num2 = " + Object2.num2);
		
		// obj2�� int num1=1; �κп� �����Ϸ��� ���µ�
		// Object2 Ŭ������ ������ �̵��ؼ� int num2 = 4;�� ������
		obj2.num2 =4;
		System.out.println("obj2.num2 = " + obj2.num2);
		
		
	}

}
