package chapter05;

import java.util.Arrays;
import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 ~ 45 ������ ���� 6���� �� ����, �ζ� ��÷ ��ȣ�� �̴� ���α׷��� �����ض�
		Random random = new Random();
		
		int lotto = random.nextInt(45) + 1;
		System.out.println("1 ~ 45 ������ ���� 6�� �� 1���� ���� = " + lotto);
		lotto = random.nextInt(45) + 1;
		System.out.println("1 ~ 45 ������ ���� 6�� �� 2���� ���� = " + lotto);
		lotto = random.nextInt(45) + 1;
		System.out.println("1 ~ 45 ������ ���� 6�� �� 3���� ���� = " + lotto);
		lotto = random.nextInt(45) + 1;
		System.out.println("1 ~ 45 ������ ���� 6�� �� 4���� ���� = " + lotto);
		lotto = random.nextInt(45) + 1;
		System.out.println("1 ~ 45 ������ ���� 6�� �� 5���� ���� = " + lotto);
		lotto = random.nextInt(45) + 1;
		System.out.println("1 ~ 45 ������ ���� 6�� �� 6���� ���� = " + lotto);
		
		// �迭�� ����� �ζǹ�ȣ ��÷
		int[] lottoNumbers = {
				random.nextInt(45) + 1,
				random.nextInt(45) + 1,
				random.nextInt(45) + 1,
				random.nextInt(45) + 1,
				random.nextInt(45) + 1,
				random.nextInt(45) + 1
		};
		System.out.println(Arrays.toString(lottoNumbers));
		
		
		
	}

}
