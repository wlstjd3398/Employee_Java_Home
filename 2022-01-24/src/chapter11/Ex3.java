package chapter11;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleType type = new SimpleType();
		
		type.num1 = 10;
		type.num2 = 20;
//		type.num3 = 30; private�� ���� �ڱ� �ڽ� ���ο����� ��� �����ؼ� ���� ����
		
		// ���������ڿ� �°� ȣ���Ҽ� �ִ� �޼����
		// ��� ȣ���ϰ� �޸��� ���¸� ��Ȯ�ϰ� ǥ���ض�
		type.func1();
		type.func2();
//		type.func3(); private�� ���� �ڱ� �ڽ� ���ο����� ��� �����ؼ� ���� ����
	}

}
