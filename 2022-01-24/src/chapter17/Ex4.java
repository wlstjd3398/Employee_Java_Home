package chapter17;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(8);
		
		System.out.println("�ʱ� : " + list);
		
		list.set(0, 7);
		System.out.println("0�� �ε����� 7 ���� : "+ list);
		
		int originValue = list.set(0,  10);
		System.out.println("0�� �ε����� 10 ���� : " + list);
		System.out.println("0�� �ε����� ����ִ� �� : " + originValue);
		
		
		
	}

}
