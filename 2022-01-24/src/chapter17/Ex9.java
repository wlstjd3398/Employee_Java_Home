package chapter17;

import java.util.ArrayList;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1 = new Customer("ȫ�浿", "010-1234-5678", 1);
		Customer c2 = new Customer("ȫ�浿", "010-1234-5678", 3);
		Customer c3 = new Customer("����", "010-1111-2222", 2);
		
		System.out.println("c1�� c2�� ������? " + c1.equals(c2));
		
		
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(c1);
		list.add(c3);
		
		
		System.out.println(list.contains(c2)); // ȫ�浿�� ������ �� ����Ʈ�� ����ֳ���?
		// contains�� for�ݺ����� �������(pptȮ��)
		
		
		
//		list.clear(); // Ŭ��� ���� �����
//		System.out.println(list.isEmpty()); // �׷��� ����� -> true
		
		
		System.out.println("----- ----- -----");
		Customer removeCustomer = new Customer("����", "010-1111-2222", 2);
		System.out.println("���� �� -> " + list);
		
		list.remove(removeCustomer);
		System.out.println("���� �� -> " + list);
		
		
		if(list.remove(removeCustomer)) { 
			// �������� �ٽ� ����� ���� �����Ͱ� list���ٰ� ��
			System.out.println("�����͸� list���� �������ϴ�.");
		}else {
			System.out.println("���� �����Ͱ� list�� �����ϴ�.");
		}
		
		
		
		
	}

}
