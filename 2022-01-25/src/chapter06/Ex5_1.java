package chapter06;

import java.util.Random;

public class Ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� 1� ��÷�ɶ����� ������ �ݺ������� ���(for)
		
		// 1 ~ 6�� ���� �ִ� ���� / ��÷�� ����
		Random random = new Random();
		
		// ������ �缭 ��÷�� ���(1 ~ 7�� ���� �ִٰ� ������)
		int rank = random.nextInt(7) + 1;
		
		// 1���� �ƴ϶�� "������ ���"�� ���
		// 1���� ���ڸ��� ��÷�Ǹ� �ٷ� for���� ���������� �ƹ��͵� ��µ�������
		
		for(; rank!=1; ) {
			rank = random.nextInt(7) + 1;
			System.out.println("������ ���");
		}
		System.out.println("���� ��÷! ���ϵ帳�ϴ�");
		
		
	}

}
