package chapter03;

public class Sol2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pencils = 534;
		int student = 30;
		
		double pencilsPerStudent =(double) pencils / student;
		System.out.println("�л� �� ��� ���� �� �ִ� ������ ���� " + pencilsPerStudent + "���Դϴ�.");
		
		int pencilsLeft = pencils % student;
		System.out.println("������ �������� ���� ������ ���� " + pencilsLeft + "�� �Դϴ�.");
	}

}
