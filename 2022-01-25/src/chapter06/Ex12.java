package chapter06;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ 2��, 3��, 4��, ... �� ����ϴ� ���α׷� for������ �����ض�(��øfor������)
//		for(int num=1; num<=9; num++) {
//			System.out.println("2 * " + num + " = " + (2 * num));
//		}
//		for(int num=1; num<=9; num++) {
//			System.out.println("3 * " + num + " = " + (3 * num));
//		}
//		for(int num=1; num<=9; num++) {
//			System.out.println("4 * " + num + " = " + (4 * num));
//		}
//		for(int num=1; num<=9; num++) {
//			System.out.println("5 * " + num + " = " + (5 * num));
//		}
		
		
		// ��ø for��
		for(int front=2; front<=9; front++) {
			for(int back=1; back<=9; back++) {
				System.out.println(front + " * " + back +" = " + (front * back));
			}
		}
		
		
		
	}

}
