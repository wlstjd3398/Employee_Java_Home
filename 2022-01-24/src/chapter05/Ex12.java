package chapter05;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanf = new Scanner(System.in);
		
		System.out.println("����� �����Ը� �Է����ּ��� ->");
		double weight = scanf.nextInt();
		System.out.println("����� Ű�� �Է����ּ��� ->");
		double height = scanf.nextInt();
		
		double Bmi = (weight / (height * height)) * 10000;
		
		// ȿ������ ���α׷��̶�� �� ������ ����Ƚ���� ���� ���α׷��� �ƴ϶�
		// ����Ƚ���� ���� ���α׷��� ������ ������(���ݸ� �����ص� ��ü�� �ƿ츦�� �ִ�) ���α׷�!
		
		System.out.println("����� Bmi�� " + Bmi + " �Դϴ�." );
		
		if(Bmi < 18.5) {
			System.out.println("����� ��ü���Դϴ�.");
		}else if(Bmi >= 18.5 && Bmi < 23) {
			System.out.println("����� �����Դϴ�.");
		}else if(Bmi >= 23 && Bmi < 25) {
			System.out.println("����� ��ü���Դϴ�.");
		}else if(Bmi >= 25 && Bmi < 30) {
			System.out.println("����� ���Դϴ�. ��� ���������� �ʿ��մϴ�.");
		}else if(Bmi >= 30) {
			System.out.println("����� �����Դϴ�. ��� ���� ������ �ʿ��մϴ�.");
		}
		
		// ���񽺸� ����°��̴ϱ�(��Ʃ��, ī�� ..) ���� �� �����ؼ� �� ���ϰ�, �� �������� ���� ������ ���ο��� ����
		
	}

}
