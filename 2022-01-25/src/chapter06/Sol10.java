package chapter06;

import java.util.Scanner;

public class Sol10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���° ���� ��� ����Ͻðھ��?");
		int last = scan.nextInt();
		
		
		for(int i=0; i<last; i++) { // ù��°�� i=0, �ι�°�� i=1...
			for(int j=0; j<=i; j++) { // ù��°�� j=0, �ι�°�� j=1...
				System.out.print("*");
			}
			System.out.println(); // �ٹٲ�
		}
		
		// ���� for���� j=0�϶� �ѹ������Ͽ� *���, j=1�Ǿ� ���� for������ ��
		// ���� for������ i=1�� �Ǿ� ���� for���� �ٽ� ���� j=0, j=1 �ٽ� �����ϸ� **��µ�
		
	}

}
