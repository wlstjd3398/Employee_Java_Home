package chapter08;

public class Ex6 {

	// �޼���� ������ ����������
	// �⺻������ �ߺ��ؼ� ������ �� ����
	// �ߺ��̶�� �ǹ̰� �޼���� ������ �ٸ�
	// ������ ������ Ÿ���� �޶� �̸��� ���� ������ �ߺ� �������� �Ǵ�
	
	// �޼���� �޼��� �̸��� ���Ƶ� �Ű������� ������ Ÿ���� �ٸ��� �ߺ����� �Ǵ����� ����
	
	// �޼����ߺ��ƴ�
	void func() {
		System.out.println("func");
	}
	
	void func(int num) {
		System.out.println("func");
	}
	
	void func(double num) {
		System.out.println("func");
	}

	
	// ���� �ߺ���, �޼����ߺ��ƴѰ� Ȯ��
	public static void main(String[] args) {
		int num = 1;
		
//		double num = 1;
		
		Ex6 ex = new Ex6();
		
		ex.func();
		ex.func(3);
		ex.func(3.14);	
	}
}
