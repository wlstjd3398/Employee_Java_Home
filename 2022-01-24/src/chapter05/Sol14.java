package chapter05;

import java.util.Random;

public class Sol14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		System.out.println("��ǻ�Ͱ� ������ �����ϴ�!");
		// ������ ������ ���� ���� Boolean Ÿ���� �����ͷ� ǥ��
		boolean coin = random.nextBoolean();
		
		System.out.println(coin);
		
		if(coin == true) {
			System.out.println("����!");
		}else if(coin == false) {
			System.out.println("��~!");
		}
		
		
	}

}
