package chapter10;

public class Object1 {

	// Ŭ������ ������Ҵ� ��������� �޼����̴�
	
	int num1;
	
	double num2;
	
	void func1() {
		System.out.println("func1");
		System.out.println("this.num1 = " + this.num1); // this.num1 ���� �ȿ� �ִ� num1 ������� ȣ��
		System.out.println("this.num2 = " + this.num2); // �ν��Ͻ��� �ö󰡼� ã��
	}
	
	void func2() {
		System.out.println("func2");
		System.out.println("this.num1 = " + this.num1);
		System.out.println("num2 = " + num2); // �޼��� ���� �ȿ� ���� ������ -> ����å���� num2�� ������
		// �޼���ȿ� �ִ� ������ ������ �Ű������� ã�� ������, ����å���� �ν��Ͻ��� �ö󰡼� ã��
	}
	
}
