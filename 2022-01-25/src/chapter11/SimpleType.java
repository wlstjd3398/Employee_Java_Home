package chapter11;

public class SimpleType {

	// ���������� �Ⱦ��� default��
	// ���������� ���� public privateó�� ����
	
	public int num1;
	int num2;
	private int num3;
	
	public void func1() {
		System.out.println("func1");
		System.out.println("num3 = " + num3);
	}
	
	void func2() {
		System.out.println("func2");
	}
	
	private void func3() {
		System.out.println("func3");
	}
	
}
