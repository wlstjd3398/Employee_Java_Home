package chapter05;

import java.util.Random;

public class Sol15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int hour = random.nextInt(24); // 24�̸��� ���߿� �������� �̾Ƽ� hour�� ���� 
		int sunny = random.nextInt(2);
		
		
		if(sunny == 0) {
			System.out.println("ȭâ�ϴ�");
		}else if(sunny == 1) {
			System.out.println("ȭâ���� �ʴ�");
		}	
		System.out.println("���� �ð��� " + hour + "�̰�, " + "���� ������ " + sunny + "�Դϴ�.");
		

		if(hour >= 6 && hour <= 9) {
			if(sunny == 0) {
				System.out.println("���޻��� �뷡�մϴ�~");
			}
		}
		
		
		
	}

}
