package chapter02;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// mod  ������ �����  0 ~ �и�-1 ������ �� �� �ϳ�
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);

		
		// � ���� ¦������ Ȧ������ �Ǻ��ϴ� ���α׷�
		System.out.println(5 % 2);
	
		
		// ö���� ���ϰ��� ���3, �ٳ���3, ������2
		int shopApple = 3;
		int shopBanana = 3;
		int shopOrange = 2;
		
		// ö���� ���ϰ��� �����ѷ�(total) ����ϰ� ��� ���� ������(avg)�� ����� �������� ���
		int total = shopApple + shopBanana + shopOrange;
		double avg = (double) total / 3;
		
		System.out.println("total = " + total);
		System.out.println("avg = " + avg);
	}

}
