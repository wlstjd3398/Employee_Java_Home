package chapter03;

public class Sol7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		�Ž������� ���� �ּ�ȭ ���
		int money = 10000;
		int store = 1900;
		int change = money - store;
		// 5000 1000 500 100
		System.out.println(change);
		
		change = change % 5000;
		System.out.println(change);
		
		change = change % 5000;
		
		change = change % 1000;
		System.out.println(change);
		
		change = change % 500;
		System.out.println(change);
		
		change = change % 100;
		System.out.println(change);
	}

}
