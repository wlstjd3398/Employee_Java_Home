package chapter03;

public class Sol7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// �Ž������� ���� �ּ�ȭ ���
//		int money = 10000;
//		int store = 1900;
//		int change = money - store;
//		
//		
//		// 5000 1000 500 100
//		System.out.println(change);
//		
//		int change1 = change / 5000;
//		System.out.println(change1);
//		int change11 = change % 5000;
//		
//		
//		int change2 = change11 / 1000;
//		System.out.println(change2);
//		int change22 = change2 % 1000;
//		
//		
//		int change3 = change22 / 500;
//		System.out.println(change3);
//		int change33 = change3 % 500;
//
//		
//		int change4 = change33 / 100;
//		System.out.println(change4);
//		int change44 = change4 % 100;
//		
//		
//		int change5 = change44 / 50;
//		System.out.println(change5);
//		int change55 = change5 % 50;
//		
//
//		int change6 = change55 / 10;
//		System.out.println(change6);
//		int change66 = change6 % 10;
		
		int money = 10000;
		int store = 1900;
		int charge = money - store;
		
		int ocheon = charge / 5000;
		int cheon = charge % 5000 / 1000;
		int obeak = charge % 5000 % 1000 / 500;
		int beak = charge % 5000 % 1000 % 500 / 100;
		int osip = charge % 5000 % 1000 % 500 % 100 / 50;
		int sip = charge % 5000 % 1000 % 500 % 100 % 50 / 10;

		System.out.println("��õ�� = " + ocheon);
		System.out.println("õ�� = " + cheon);
		System.out.println("����� = " + obeak);
		System.out.println("��� = " + beak);
		System.out.println("���ʿ� = " + osip);
		System.out.println("�ʿ� = " + sip);
		
	}

}
