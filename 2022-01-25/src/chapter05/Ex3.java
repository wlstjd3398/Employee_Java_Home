package chapter05;

import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Random ��üȭ���������
		// Random ���̺귯�� -> ���� ������ ���õ� ��ɵ��� ���� �ִ� ���̺귯��
		// ���� -> ������ ���� ���� ���ڸ� �������� ������ �� �Ǵ� ����
		Random random = new Random();
		
		// ���� �߿��� ����
		int su = random.nextInt();
		System.out.println(su);
		
		// �ٸ� nextInt(����)
		// 1 ~ 6 ���� �ִ� ������ü �ֻ����� ������ 3��
		int dice = random.nextInt(6) + 1;
		System.out.println("�ֻ����� ������ ���� �� " + dice);
		
		dice = random.nextInt(6) + 1;
		System.out.println("�ֻ����� ������ ���� �� " + dice);
		
		dice = random.nextInt(6) + 1;		
		System.out.println("�ֻ����� ������ ���� �� " + dice);
		
	}

}
