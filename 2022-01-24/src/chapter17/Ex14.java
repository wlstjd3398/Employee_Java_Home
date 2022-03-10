package chapter17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ ���׸���Ÿ�� Customer�� �̸����� ������ ������ ����
		Map<String, Customer> customerList = new HashMap<>();
		
		// �����ڿ� �°� ���ڸ� �־��� �����Ͽ����� -> CustomerŬ�������� �´� �����ڻ���
		Customer c1 = new Customer("010-1111-1111", "����"); 
		Customer c2 = new Customer("010-2222-2222", "ī��");
		Customer c3 = new Customer("010-3333-3333", "��ǰ��");
		
		customerList.put("ȫ�浿", c1);
		customerList.put("��ö��", c2);
		customerList.put("����", c3);
		
		// map�� ����ִ�Ű�� set���·� ��������
		// ���׸���Ÿ���� Ű�� ������Ÿ���� String
		Set<String> keySet = customerList.keySet(); 
		// for��
		for(String key : keySet) {
			Customer nthCustomer = customerList.get(key);
			System.out.println("���� �̸� : " + key);
			System.out.println("���� ����ó : " + nthCustomer.getTel());
			System.out.println("���� ������� : " + nthCustomer.getPaymentMethod());
		}
		
		// iterator
		
//		System.out.println("ù ��° ���� �̸� : ȫ�浿");
//		System.out.println("ù ��° ���� ����ó : " + c1.getTel());
//		System.out.println("ù ��° ���� ������� : " + c1.getPaymentMethod());
		
		
		
		
		
//		// map�̿��Ͽ� ������ ���
//		Customer nthCustomer = customerList.get("ȫ�浿");
//		System.out.println("1 ��° ���� �̸� : ȫ�浿");
//		System.out.println("1 ��° ���� ����ó : " + nthCustomer.getTel());
//		System.out.println("1 ��° ���� ������� : " + nthCustomer.getPaymentMethod());
//		
//		nthCustomer = customerList.get("��ö��");
//		System.out.println("2 ��° ���� �̸� : ��ö��");
//		System.out.println("2 ��° ���� ����ó : " + nthCustomer.getTel());
//		System.out.println("2 ��° ���� ������� : " + nthCustomer.getPaymentMethod());
//		
//		nthCustomer = customerList.get("����");
//		System.out.println("3 ��° ���� �̸� : ����");
//		System.out.println("3 ��° ���� ����ó : " + nthCustomer.getTel());
//		System.out.println("3 ��° ���� ������� : " + nthCustomer.getPaymentMethod());
//		

	}

}
