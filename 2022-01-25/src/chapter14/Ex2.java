package chapter14;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �� ���α׷��� ���ܰ� �߻��ϴ� ���α׷��Դϴ�.
		// ���ܰ� ���� �߻��ϴ��� ã��
		// ���ܰ� �߻����� �ʵ��� ó���غ���
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {3, 2, 1};
		
		System.out.println("�ε��� ��ȣ >> ");
		int index = scan.nextInt();
		
//		if(index>=arr.length || index<0) {
//			System.out.println("ã�� �� ���� �ε��� ��ȣ�Դϴ�.");
//		}else {
//			System.out.println("arr[" + index + "] = " + arr[index]);
//		}
		
		
		// ������ ���
//		if(index<0) {
//			System.out.println("�ε��� ��ȣ�� ������ �� �����ϴ�.");
//		}else if(index >= arr.length) {
//			System.out.println("�ε��� ��ȣ�� 0 ~ " + (arr.length-1) + " ���̸� ��� �� �� �ֽ��ϴ�.");
//		}else {
//			System.out.println("arr[" + index + "] = " + arr[index]);
//		}
		
		
		try {
			System.out.println("arr[" + index + "] = " + arr[index]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�ε��� ��ȣ�� �߸��Ǿ����ϴ�.");
		}
		
		
		
	}

}
