package chapter17;

import java.util.ArrayList;

public class Ex3 {
//	�����丵�� �߿� -> ���� ������ �ڵ带 �ٽ� �ѹ� �����ؼ� �����ϴ� �۾�
	
	// ��ȯŸ���� ���� �ϴ� void, �Ű������� �������� ��ĭ
	// return ������ void�� ���, customerList�� �Ʒ� �޼��忡 ���� �׷��� �Ű������� ������������ �����������
	public void printAllCustomer(ArrayList<Customer> customerList) {
		for(int i=0; i<customerList.size(); i++) {
			Customer nthCustomer = customerList.get(i);
			String nthCustomerName = nthCustomer.getName();
			String nthCustomerTel = nthCustomer.getTel();
			int nthCustomerSeat = nthCustomer.getSeat();
			
			System.out.println("<< " + (i+1) + "��° �������� ���� >>");
			System.out.println("�̸� : " + nthCustomerName);
			System.out.println("����ó : " + nthCustomerTel);
			System.out.println("�¼���ȣ : " + nthCustomerSeat);
		}
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ex3 ex3 = new Ex3();
		
		
		
		// KTX ������ ���� ���α׷��� �����ض�
		Customer c1 = new Customer("ȫ�浿", "010-1473-3698", 32);
		Customer c2 = new Customer("����", "010-1598-7894", 55);
		
		
//		�������� ������ Customer Ŭ������ ���
		ArrayList<Customer> customerList = new ArrayList<>();
		
		// �ν��Ͻ��� �ּҰ� add�� �� ��
		customerList.add(c1);
		customerList.add(c2);
		// ��ü�� sysout�ϸ� �Ʒ�ó�� ���ڿ��� ��� -> �������̵� ���ָ� �ذ�
		System.out.println(c2.toString());
		
		
		
		// �޼��� ȣ��
		ex3.printAllCustomer(customerList);
		
		
		
		// ù��° �������� ������ ���� -> �ʹ� ���ŷο�
//		String firstCustomerName = customerList.get(0).getName();
//		String firstCustomerTel = customerList.get(0).getTel();
//		int firstCustomerSeat = customerList.get(0).getSeat();
		
		// for���� �̿��� ����������
//		for(int i=0; i<customerList.size(); i++) {
//			Customer nthCustomer =customerList.get(i);
//			String nthCustomerName = nthCustomer.getName();
//			String nthCustomerTel = nthCustomer.getTel();
//			int nthCustomerSeat = nthCustomer.getSeat();
//			
//			System.out.println("<< " + (i+1) + "��° �������� ���� >>");
//			System.out.println("�̸� : " + nthCustomerName);
//			System.out.println("����ó : " + nthCustomerTel);
//			System.out.println("�¼���ȣ : " + nthCustomerSeat);
//		}
		
		// �ݺ����� ����ؼ� ��ó�� ���氡��
//		Customer nthCustomer =customerList.get(0);
//		String firstCustomerName = nthCustomer.getName();
//		String firstCustomerTel = nthCustomer.getTel();
//		int firstCustomerSeat = nthCustomer.getSeat();
//		
//		nthCustomer = customerList.get(1);
//		String SecondCustomerName = nthCustomer.getName();
//		String SecondCustomerTel = nthCustomer.getTel();
//		int SecondCustomerSeat = nthCustomer.getSeat();
		
//		System.out.println("firstCustomerName = " + firstCustomerName);
		
		
		// ù��° �������� ������ ����
		Customer c3 = new Customer("�迵��", "010-7536-9514", 17);
		customerList.add(0, c3);
		
		// �޼��� ȣ��
		ex3.printAllCustomer(customerList);
		
		
//		
//		for(int i=0; i<customerList.size(); i++) {
//			Customer nthCustomer =customerList.get(i);
//			String nthCustomerName = nthCustomer.getName();
//			String nthCustomerTel = nthCustomer.getTel();
//			int nthCustomerSeat = nthCustomer.getSeat();
//			
//			System.out.println("<< " + (i+1) + "��° �������� ���� >>");
//			System.out.println("�̸� : " + nthCustomerName);
//			System.out.println("����ó : " + nthCustomerTel);
//			System.out.println("�¼���ȣ : " + nthCustomerSeat);
//		}
		

		//ȫ�浿 ������ ȯ�ҷ� ���������� ��Ͽ��� ����
		customerList.remove(1);
		ex3.printAllCustomer(customerList);
		
		
		
		
		
		
		
		
	}

}
