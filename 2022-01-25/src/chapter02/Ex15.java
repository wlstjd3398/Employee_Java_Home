package chapter02;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���ڸ��� �����̸��� ���� ������ �ִ�
		System.out.println(3 + 10);
		
		int result = 3 - 10;
		System.out.println("result = " + result);
		
		int val1 = 3;
		result = val1 * 10;
		System.out.println("result = " + result);
		
		int val2 = 10;
		// �츮�� ��ǻ�Ͱ� �Ǿ ���� ������ �ľ��ϴ� �͵� �߿�������
		// �츮�� �ľ��� ������� ����� ���Դ����� ���� ������
		// ���� <������> ������ �ϰԵǸ� ������ ����� ������
		// �׷��� �������� ����� �Ǽ��� ���ϰ� ������
		// �Ǽ� / �Ǽ� �� �ؾ���
		result = val1 / val2;
		System.out.println("result = " + result);
		
		result = val1 % val2;
		System.out.println("result = " + result);
		
	}

}
