package chapter17;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> intList = new ArrayList<Integer>();
		// �ν��Ͻ��� ���׸��� �� �������� -> ��ü�� ���׸����� ����(�Ʒ��� ����)
		// ArrayList<Integer> intList = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			intList.add(i);
		}
		System.out.println("intList = " + intList);
	}

}
