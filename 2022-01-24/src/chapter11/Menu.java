package chapter11;

public class Menu {

	String name; // ��ü������ �𸣴� �����ڵ� ��ü������ ����ϵ��� ��������� private�� ����� ��ü���� ��밡���ϵ��� ����
	int price; // ��ü������ �𸣴� �����ڵ� ��ü������ ����ϵ��� ��������� private�� ����� ��ü���� ��밡���ϵ��� ���� 
	
//	��ȯŸ�� �޼����̸�(�Ű�����) {
//		�ҽ��ڵ�
//	}
	
	// ���� �ۼ� ����
	// �޼����̸� �����ְ� �Ű������� ���Ͱ��� ����������
	// name�� ��Ű���ܺ� ���� Ȯ���ϰ� �ҽ��ڵ� �Է���
	// ���������� public default private���� �´� ���� ����ؾ���
	public void setName(String name) {
		this.name = name;
		
	}
	// setter(����) �޼���
	// 1. set���� �����ϴ� ���� �̸��� set��������� �̸����� �޼����̸��� ����
	// 2. �� �޼���� �ش� ��������� ���� �����ϴ� �޼���
	
//		�޴��ٿ��� source - getter setter���� �����Ҽ��� ����
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void PrintObjectInfo() {
		System.out.println("�޴��� �̸� = " + name);
		System.out.println("�޴��� ���� = " + price);
	}
	
	
	// getter(����) �޼���
	// 1. get��������� �̸����� �޼��� �̸��� ����
	// 2. �� �޼���� �ش� ��������� ���� ��ȯ�ϴ� �޼���
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	
}
