package chapter05;

import java.util.Scanner;

public class Sol13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sol12���� if������ ���Ķ�
		// �������� �� ��� �и� 0�̸� ���α׷��� ������������ �����
		// �������� �� �� �и� 0�̶�� "�и�� 0�� �� �����ϴ�"�� �߰��ؼ� if�� �ٲ��
		
		Scanner scanf = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ض� -->");
		int num1 = scanf.nextInt();
		
		System.out.print("�ι�° ���� �Է��ض� -->");
		int num2 = scanf.nextInt();
		
		System.out.print("�����ڸ� (+, -, *, /) �� �ϳ��� �Է��ض� -->");
		char operator = scanf.next().charAt(0);
		
		int result = 0;
		
		if(operator == '+') {
			System.out.println(num1 + " " + operator + " " + num2 + " == " + (num1 + num2));
		}else if(operator == '-'){
			System.out.println(num1 + " " + operator + " " + num2 + " == " + (num1 - num2));
		}else if(operator =='*') {
			System.out.println(num1 + " " + operator + " " + num2 + " == " + (num1 * num2));
		}else if(operator == '/') {
			if(num1 == 0) {
				System.out.println("�и� 0�� �� �����ϴ�");
				return;
			}
			System.out.println(num1 + " " + operator + " " + num2 + " == " + (num1 / num2));
		}
		
		
		
		
	}

}
