package chapter04;

import java.util.Arrays;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] avgArr = {67, 81.3, 54.67, 64.67};
		
		char[] gradeArr = {'B', 'A', 'C', 'B'};
		
		// avgArr �迭 �� �� �ε����� ����ִ� �����͸� ����ض�
		
		System.out.println(avgArr[0]);
		System.out.println(avgArr[1]);
		System.out.println(avgArr[2]);
		System.out.println(avgArr[3]);
		
		// �迭 �ȿ��� �����Ͱ� �ƴ϶� �����͵��� ��������Ƿ�
		// �迭�� �Ʒ�ó�� �׳� ����ϸ� �ȵ�
		System.out.println(avgArr);
		
		System.out.println(gradeArr[0]);
		System.out.println(gradeArr[1]);
		System.out.println(gradeArr[2]);
		System.out.println(gradeArr[3]);
		
		// Arrays -> ���̺귯��, API ������ �Ҹ� / �迭�� ���õ� �츮���� �ʿ��� ��ɵ��� ���� ����
		// Arrays �ȿ� ����ִ� toString ��� -> ������ ���(�迭)�� ���ڿ�ȭ �����ִ� ���
		// �迭(avgArr[0])�� ���ڿ��� �ٲ��� -> "[67, 81.3, 54.67, 64.67]"
		System.out.println(Arrays.toString(avgArr));
		
	}

}
