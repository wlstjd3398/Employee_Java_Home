package chapter13;

public interface Calculatorable {

	// �������
//	��𼭵����ٰ����� Ŭ����������� ���ȭ�� ������Ÿ�� �����̸�;
//	���������� ������Ÿ�� �����̸�;
	
	// �������̽����� ���ȭ�� �������(public static final ~)�� �߻�޼���(abstract�� ������ �ҽ��ڵ� ����)�� �ʼ�
	public static final int value = 10;
	
	
	// �߻�޼���
	// ����
	public abstract int plus(int num1, int num2);
	// ����
	public abstract int minus(int num1, int num2);
	// ����
	public abstract int multiply(int num1, int num2);
	// ������
	public abstract int division(int num1, int num2);
	
}
