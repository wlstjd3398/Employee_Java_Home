package chapter05;

import java.util.Scanner;

public class Sol10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����ڿ��� �Է��� �ޱ� ���� scanf ��ü ����
				Scanner scanf = new Scanner(System.in);
				
				System.out.println("����. ���󿡼� ���� ��� ����?");
				
				System.out.print("���� -> ");
				// ����ڷκ��� ������ ���� ����
				String userAnswer = scanf.nextLine();// nextLine()�� Enter�� ġ�� ������ �� ���ڿ��� ��� �����Ѵٴ� ��
				
				// ������ ����
				String correctAnswer = "����";
				
				// ����ڰ� �Է��� ����� ������ ������ ��ġ�ϴٸ� �����Դϴ�. ���
				if(correctAnswer.equals(userAnswer)) {
					System.out.println("�����Դϴ�.");
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�");
				}

//		�� Ʋ������?? -> if(correctAnswer.equals(userAndwer)) �� �κп� correctAnswer = userAnswer��
//				������ �޸��ּҰ� ����Ǿ��ֱ⶧���� ���ڿ��� ���� equal��� �޼��带 ����ؼ� treu or false�� ��½�Ŵ
	}

}
