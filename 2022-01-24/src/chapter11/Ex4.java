package chapter11;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu menu1 = new Menu();
//		menu1.name = "¥���"; // ���ν�������=��������
		menu1.setName("¥���"); // ��ü����
		
//		menu1.price = 4900; // ���ν�������=��������
		menu1.setPrice(4900); // ��ü����
		
		Menu menu2 = new Menu();
//		menu2.name = "«��"; // ���ν�������=��������
		menu2.setName("«��"); // ��ü����
		
//		menu2.price = 6000; // ���ν�������=��������
		menu2.setPrice(6000); // ��ü����
		
//		System.out.println(menu1);
//		System.out.println(menu2);
		// chapter11 ��Ű���� ���� �޸��ּҰ� �����Ե�
		
		// ��ü�� ����(��ü�� �����ִ� �����͵�)�� ����ϱ� ���ؼ���?
		// �ڹٴ� ��ü ���� ���α׷��� ���
		// ��ü���� ���α׷�����?
		// ��ü�� ��� �� ���� �޼���(���)�� ���� �����ض�
		
//		��ü�� ������ ����� �޼��带 ���� ����,
//		���������� ��ȯŸ�� �޼����̸�(�Ű�����) {
//			�ҽ��ڵ�
//		}
		menu1.PrintObjectInfo();
		menu2.PrintObjectInfo();
		
		
		// getter �޼��带 �����ض�
		
		// ù��° �޴��� �̸��� �����ͼ� �� �ȿ��� ����ϰ� ����
		String firstMenuName = menu1.getName();
		
		// ù��° �޴��� ������ �����ͼ� �̾ȿ��� ����ϰ� ����
		int firstMenuPrice = menu1.getPrice();
		
	}

}
