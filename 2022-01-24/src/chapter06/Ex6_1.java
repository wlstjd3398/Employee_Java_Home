package chapter06;

import java.util.Random;

public class Ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ǥ ü�߿� ������ ������ ��� �Ѵ�
		// while(����ü��weight�� ��ǥü��goal�� �����߳���?)
		Random random = new Random();
		
		int weight = 100;
		int goal = 70;
		int lose = random.nextInt();
		
		// ��� �ؼ� ���� ������
		// ��� �ϰ� ���� ���� ���� ü���� ���
		
		for(weight=weight; goal<=weight; weight=weight-lose) {
			System.out.println("��� �Ѵ�");
			
		}
		System.out.println("���̾�Ʈ ����! ���� �����Ը� �����ϼ���");

		
		
		
		
		
		
		
		
	}

}
