package chapter04;

public class Sol18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �Ǻ���ġ ���� = ���� ������ ���� ���� ���� ���� ���Ҽ��ִ� ����
		// n = n-2  +  n-1
		// ù��° �� : 1
		// �ι��� �� : 1
		// �Ǻ���ġ ������ ����° ���� ����ϸ�
		// x3 = x1 + x2 �̷��� ��
		// �迭�� ����ؼ� �Ǻ���ġ ������ 10��° ���� ���ض�
		int num1 = 1;
		int num2 = 1;
		
		int num3 = num1 + num2;
		int num4 = num2 + num3;
		int num5 = num3 + num4;
		int num6 = num4 + num5;
		int num7 = num5 + num6;
		int num8 = num6 + num7;
		int num9 = num7 + num8;
		int num10 = num8 + num9;
		System.out.println("�Ǻ���ġ ������ 10��° �� = "+ num10);
		
		
		
		
	}

}
