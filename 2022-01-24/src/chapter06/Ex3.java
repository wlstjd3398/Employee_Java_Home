package chapter06;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int sum = 1 + 2 + 3 + 4 + 5;
		
//		int sum = 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
		
		// �� �Ʒ� �ڵ��� ���� ����� ������������
		// (while�� ������ �� �������� sum������ 15(1+2+3+4+5)�� ����־����)
		// while�� ���õ� �ڵ带 �����ϼ���
		
		int sum = 1;
		int n = 2;
		
		while(n <= 5) {
			sum = sum + n;
			n++;
		}
		System.out.println("sum = " + sum);
		
		
	}

}
