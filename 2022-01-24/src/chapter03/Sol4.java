package chapter03;

public class Sol4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int birth = 900318;
		
		int day = birth % 100; // ������� �� ���ڸ��� �¾ ��
		birth = birth / 100; // ������� �� ���ڸ��� ��������Ƿ� ���� ����
		System.out.println(day);
		System.out.println(birth);
		
		int month = birth % 100; // ���� ���ܵ� ��������� �� ���ڸ��� �׾ ��
		birth = birth / 100; // ������� �� ���ڸ��� ��������Ƿ� ���� ����
		System.out.println(month);
		System.out.println(birth);
		
		int year = birth; // ������ �������Ƿ� �״�� year ������ ����
		
		System.out.println("ö���� "+ year + "�� " + month + "�� "
				+ day + "�Ͽ� �¾���ϴ�.");
	}

}
