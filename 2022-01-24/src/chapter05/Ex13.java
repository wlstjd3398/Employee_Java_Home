package chapter05;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int week = 7;
		int dayOfMonth = 13;
		int dayOfWeek = dayOfMonth % week;
		System.out.print("2022�� 8�� " + dayOfMonth + "���� ");
		
		if(dayOfWeek == 0) {
			System.out.println("�Ͽ���");
		}else if(dayOfWeek == 1) {
			System.out.println("������");
		}else if(dayOfWeek == 2) {
			System.out.println("ȭ����");
		}else if(dayOfWeek == 3) {
			System.out.println("������");
		}else if(dayOfWeek == 4) {
			System.out.println("�����");
		}else if(dayOfWeek == 5) {
			System.out.println("�ݿ���");
		}else {
			System.out.println("�����");
		}
		
		// ���� ���� ��Ȳ���� else if(dayOfWeek == 6)�� �Ⱦ��� else �Ἥ ��°���
		
	}

}
