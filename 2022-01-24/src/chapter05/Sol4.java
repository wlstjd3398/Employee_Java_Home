package chapter05;

public class Sol4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double weight = 93.1;
		double height = 180.7;
		
		double BMI = (weight / (height * height)) * 10000;
		
		System.out.println("����� BMI ������ " + BMI + "�Դϴ�.");
		
		if(BMI >= 30) {
			System.out.println("�� ���Դϴ�.");
		} else if(BMI >= 25) {
			System.out.println("���Դϴ�.");
		} else if(BMI >= 23) {
			System.out.println("������ �ǽ��Դϴ�.");
		} else if(BMI >= 18.5) {
			System.out.println("�����Դϴ�.");
		} else if(BMI < 18.5) {
			System.out.println("��ü���Դϴ�.");
		}

	}

}
