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
		
		
		// intList�� 2��°, 9��° �����͸� �����ض�
		intList.remove(1);
		intList.remove(8);
		System.out.println("intList = " + intList);
	
		
		// �ݺ����� get�޼��带 ����ؼ� intList�� ù��° �����ͺ��� �����������ͱ��� ���ʴ�� ����ض�
		for(int i=0; i<=7; i++) {
			Integer number = intList.get(i);
			System.out.println(number);
		}
		// -> ������ ���� i<=10; �� �ƴ϶� ������� �� ������ �׵��� ���� �߸�
//		int size = intList.size(); // ����� ���� �˷��ش�
//		for(int i=0; i<size; i++) {
//			Integer number = intList.get(i);
//			System.out.println(number);
//		}
		// ���� for�� = inhanced for��
		for(int number : intList) { // intList���� ���ʴ�� number�� �����͸� ���� 
			System.out.println(number);
		}
		
		
		
	}

}
