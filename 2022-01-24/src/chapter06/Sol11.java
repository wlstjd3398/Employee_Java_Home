package chapter06;

import java.util.Scanner;

public class Sol11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("2�̻��� ������ �Է��ϼ���. ������ ������?");
		int last = scan.nextInt();
		
		for(int n=2;n<=last;n++) {
			int count = 0; // ������ �� �� ���������� ���� ����
			for(int i=1;i<=n;i++) {
				if(n%i==0) { // 1�� �ڱ��ڽŸ��� ���������� ���� �Ҽ�����
					// i���� n�� ������ �������� 0�� ���� �ι�°�϶� �� for�����ͼ� ��µ�
					count++;
				}
			}
			if(count == 2) {
				System.out.print(n + " ");
			}
		}
	}
}
