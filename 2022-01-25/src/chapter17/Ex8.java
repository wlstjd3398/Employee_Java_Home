package chapter17;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1 = new Customer("ȫ�浿", "010-1234-5678", 1);
		Customer c2 = new Customer("ȫ�浿", "010-1234-5678", 1);
		// c1�� ������ ����ִ°� �ƴ϶� ������ ����ִ� �޸��ּҰ� �������
		
		// c1�� ����ִ� ������ c2�� ����ִ� ������ ������?�� ����� ����ϴ� �ڵ带 ���弼��
		// c1Name�� ���� ������ ����
		String c1Name = c1.getName();
		String c1Tel = c1.getTel();
		int c1Seat = c1.getSeat();
		
		String c2Name = c2.getName();
		String c2Tel = c2.getTel();
		int c2Seat = c2.getSeat();
		
		// ���� �ȿ��� ���� ��������ϱ� �ٷ� ������1 == ������2 �� �ؼ�
		// �� ������ ����ִ� ���� ������ �� �� �� ����
		// ��ü �ȿ��� �����Ͱ� �𿩼� ������ �̷�� �ֱ� ������
		// �ٷ� ��ü��1 == ��ü��2 ���� �� ��ü�� ������ ���� �� ����
		// ��ü �ȿ� �ִ� �����͸� �ϳ��� ������ ���� �񱳸� �ؾ���
		// ��� �����Ͱ� ���ٸ� ����(true) �ٸ��ٸ� �ٸ���(false)�� �����ϵ���
		// �ڵ带 ���� ¥����
		if(c1Name.equals(c2Name) && c1Tel.equals(c2Tel) && c1Seat == c2Seat) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
		// ���� ����
//		int num1 = 1;
//		int num2 = 2;
//		
//		// num1�� ����ִ� ���� num2�� ����ִ� ���� ������? �� ����� ����ϴ� �ڵ带 ���弼��
//		System.out.println(num1 == num2);
		
		
	}

}
