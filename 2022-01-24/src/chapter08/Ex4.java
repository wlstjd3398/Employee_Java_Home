package chapter08;

public class Ex4 {

	public static void main(String[] args) {
		Object5 obj = new Object5();
		
		System.out.println(obj.big(1, 2)); // ���ڸ��� sysout�� �־���, big�� �켱������ �������� �� �Ŀ� sysout �����
		
		int result = obj.big(-3, -5);
		System.out.println(result);
		
		// obj ��ü�� ���� �ִ� compare �޼��带 ȣ���ϰ�
		// compare �޼��尡 ��ȯ�ϴ� ���� ������ Ÿ���� ������ �����ض�
		// Ex4 -> Object5 -> Ex4
		String val = obj.compare(3);
		System.out.println(val);
		
		
		// Calculator Ŭ���� �ȿ�
		// ����, ����, ���� ������ ���� �޾�
		// ����� ����� ��
		// ����� ��ȯ�ϴ� �޼��带 �����ض�
		Calculator calc = new Calculator();
		double grade = calc.calcuAvg(60, 70, 80);
		System.out.println(grade);
		
		
	}
}
