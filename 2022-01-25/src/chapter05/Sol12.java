package chapter05;

import java.util.Scanner;

public class Sol12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����ڿ��� �Է��� �ޱ� ���� scanf ��ü ����
				Scanner scanf = new Scanner(System.in);
				
				System.out.print("ù ��° �� �Է� >> ");
				int num1 = scanf.nextInt();
				
				System.out.print("�� ��° �� �Է� >> ");
				int num2 = scanf.nextInt();
				
				System.out.print("������ �Է� >> ");
				char operator = scanf.next().charAt(0);
				
				int result = 0;
				switch(operator) {
					case '+':
						result = num1 + num2;
						break;
					case '-':
						result = num1 - num2;
						break;
					case '*':
						result = num1 * num2;
						break;
					case '/':
						result = num1 / num2;
						break;
				}
				
				System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

		
	}

}
