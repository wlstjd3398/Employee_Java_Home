package chapter16;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product com1 = new Product("computer", 1900000);
		
		Product com2 = new Product("computer", 1050000);
		
		Product tv1 = new Product("television", 63000);
		
		
		
		// Product Ŭ������ Box Ŭ������ ����Ͽ�����ǻ�͸� ���ڿ� �ִ´١�
		// / ��TV�� ���ڿ� �ִ´١� �� ǥ���ϼ���.
		// ( ��ǻ�� �� ��, TV �� ���̹Ƿ� ���ڴ� �� 3���� �ʿ��մϴ�. )

		
		// ��ǻ�͸� ���� �� �ִ� ���ڸ� ����
		Box<Product> box1 = new Box<Product>();
		// ���ڿ� ��ǻ�͸� �ִ´�
		box1.setItem(com1);
		// ��ǻ�͸� ���� �� �ִ� ���ڸ� ����
		Box<Product> box2 = new Box<Product>();
		// ���ڿ� ��ǻ�͸� �ִ´�
		box2.setItem(com2);
		// tv�� ���� �� �ִ� ���ڸ� ����
		Box<Product> box3 = new Box<Product>();
		// ���ڿ� tv�� �ִ´�
		box3.setItem(tv1);
		
		
		
	}

}
