package chapter04;

import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] heightList = {163.9, 177.2, 170.3};
		
		// heightList�� �л����� Ű�� ����
		// heightList�� �л����� Ű ������� �������� �����ؼ� �����ϰ� �;���
		// �׷��� �Ǽ��� Ű�� ū �л��� �����Ͱ� �߰��� ����
		
		double nthHeight = heightList[1];
		heightList[1] = heightList[2];
		heightList[2] = nthHeight;
		// �ε��� 1���� nthHeight��, �ε���2���� �ε���1���ڸ���, nthHeight�� 2���ڸ���
		
		// �޸𸮸� �׷��� �� �ڵ��� ���� ������ �ľ��ϰ�
		// Array.toString�� ����ؼ� heightList �迭 �� �����͵��� ����ض�
		
		System.out.println(Arrays.toString(heightList));
		
		System.out.println("�迭�� ���� = " + heightList.length);
		
		// �迭�� �ε�����ȣ�� ����� �����ϸ� ����(Exception)�� �߻��� -> ����!
//		System.out.println(heightList[3]);
		
	}

}
