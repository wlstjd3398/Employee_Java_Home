package chapter17;

import java.util.ArrayList;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1 = new Customer("ȫ�浿", "010-1473-3698", 32);
		Customer c2 = new Customer("����", "010-1598-7894", 55);
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		customerList.add(c1);
		customerList.add(c2);
		
		
		// �������� ��Ͽ��� �̸��� ȫ�浿�̰� ����ó�� 010-1473-3698�̰� 
		// �¼���ȣ�� 32���� �������� ������ ����ִ��� Ȯ���ϴ� ���α׷��� �����ض�
		// ����ִٸ� true�� ����ϰ� ������� �ʴٸ� false�� ����ض�
		// ����� contains �޼��� �Ⱦ��� get�� equals
		
//		for(int i=0; i<customerList.size(); i++) {
//			Customer nthCustomer = customerList.get(i);
//		
//		// n��° �������� ���� �� �̸��� ȫ�浿�̰�
//			if(nthCustomer.getName().equals("ȫ�浿") 
//					&& nthCustomer.getTel().equals("010-1473-3698") 
//					&& nthCustomer.getSeat() == 32) {
//			
//				// n��° �������� ���� �� ����ó�� 010-1473-3698�̰�
//				// n��° �������� ���� �� �¼���ȣ�� 32�̶��
//				// true�� ���
//				System.out.println(true);
//			}
//		}
		
		
		// �������� ��Ͽ��� �̸��� ȫ�浿�̰� ����ó�� 010-1473-3698�̰� 
		// �¼���ȣ�� 32���� �������� ������ ����ִ��� Ȯ���ϴ� ���α׷��� �����ض�
		// ����ִٸ� true�� ����ϰ� ������� �ʴٸ� false�� ����ض�
		// contains ���
		
		// ã�����ϴ� wanted �����ؼ� ��
		Customer wanted = new Customer("ȫ�浿", "010-1473-3698", 32);
		
		System.out.println(customerList.contains(wanted));
		// true�� ��µž��ϴµ� false�� ���� -> ������ Ex8 
		
		// contains�� ���������� ���ڷ� ���� ���� ���� �� ����Ʈ�� ����ִ� ��� �����͸�
		// �� �����ؼ� true�� ������ true�� ��ȯ
		// ���������� true�� ������ �ʾҴٸ� false�� ��ȯ
		// contains�� �츮�� �ǵ��Ѵ�� �����ϵ��� �Ϸ��� equals �޼��带 �������̵��ϸ� ��
		// Customer Ŭ���� �ȿ��ٰ� equals�� �������̵� �ؾ���
		
		
	}

}
