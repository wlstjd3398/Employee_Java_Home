package chapter04;

import java.util.Arrays;

public class Sol20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// charŸ���� ���� �ϳ��� �迭 �ε����� ����ؼ� ���ĺ� ���� �������������ض�
		// 0 5 1 2 4 3
		// 0 1 2 3 4 5
		// a j q s t z
		char[] chArr = {'A', 'Z', 'J', 'Q', 'T', 'S'};
		
		System.out.println("<< ���� �� >>");
		System.out.println(Arrays.toString(chArr));
		
		// ���� �ڵ�
		char nthArr = chArr[5];
		chArr[5] = chArr[1];
		chArr[1] = chArr[2];
		chArr[2] = chArr[3];
		chArr[3] = nthArr;
		
		System.out.println("<< ���� �� >>");
		System.out.println(Arrays.toString(chArr));

	}

}
