package chapter05;

import java.util.Random;

public class Sol18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		int pollution = random.nextInt();
		int cash = random.nextInt();
		
		if(pollution >= 5 && cash >= 15000) {
			System.out.println("�ýø� �θ����?");
		}else {
			System.out.println("��Ҵ�� ����");
		}
		
	}

}
