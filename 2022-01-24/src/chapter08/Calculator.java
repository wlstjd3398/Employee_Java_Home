package chapter08;

public class Calculator {

	
	// �޼��� ȣ���ϴ� �ڵ带 ������ ��ǻ�Ͱ� �޼��� ������ ������ �Ǹ�
	// RAM �ȿ� �޼����� ������ ����
	double calcuAvg(int a, int b, int c) {
		int total = a + b + c;
		double avg = (double) total / 3;
		
		return avg;
	}
	// �� calcuAvg�� main �Ʒ��� ���� å�� �ڷῡ�� �Ѳ����� �س�����
	
	
	void swap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
	
	
	public static void main(String[] arg) {
		Calculator cal = new Calculator();
		
		cal.calcuAvg(10, 20, 30);
		
		int num1 = 10;
		int num2 = 20;
		
		cal.swap(num1, num2);
		
	}
	
}
