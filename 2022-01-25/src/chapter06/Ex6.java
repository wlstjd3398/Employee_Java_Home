package chapter06;

import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ǥ ü�߿� ������ ������ ��� �Ѵ�
		// while(����ü��weight�� ��ǥü��goal�� �����߳���?)
		
		Random random = new Random();
		
		int weight = 100;
		int goal = 70;
		int loseWeight;
		
		while(goal <= weight) {
			System.out.println("��� �Ѵ�");
			// ��� �ؼ� ���� ������
			loseWeight = random.nextInt(6);
			
			// ��� �ϰ� ���� ���� ���� ü���� ���
			weight = weight - loseWeight;
		
		}
		System.out.println("���̾�Ʈ ����! ���� �����Ը� �����ϼ���");
		// �����ϸ鼭 ������ ���� �ٲ㺸��
		
	}

}
