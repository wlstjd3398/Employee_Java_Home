package chapter04;

import java.util.Arrays;

public class Sol19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2���� �迭 charArr �ϳ����� ����ؼ� �ε�����ȣ���� ����Ͽ� 
		// charArr �迭 �� �����͵��� 90�� ȸ������ ����ض�
		
		char[][] charArr = {
				{'A', 'B', 'C'},
				{'D', 'E', 'F'},
				{'G', 'H', 'I'}
		};
		
		char nthArr = charArr[0][0];
		charArr[0][0] = charArr[2][0];
		charArr[2][0] = charArr[2][2];
		charArr[2][2] = charArr[0][2];
		charArr[0][2] = nthArr;
		
		char nthArr1 = charArr[0][1];
		charArr[0][1] = charArr[1][0];
		charArr[1][0] = charArr[2][1];
		charArr[2][1] = charArr[1][2];
		charArr[1][2] = nthArr1;
		
		
		
		System.out.println(Arrays.deepToString(charArr));
	}

}
