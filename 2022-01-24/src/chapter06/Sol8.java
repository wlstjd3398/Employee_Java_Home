package chapter06;

import java.util.Scanner;

public class Sol8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanf = new Scanner(System.in);
		
		System.out.println("id�� �Է����ּ���. �ּ� 4�� ~ �ִ� 16�� �Դϴ�.");
		String id = scanf.next();
		System.out.println("pw�� �Է����ּ���. �ּ� 6�� ~ �ִ� 16�� �Դϴ�.");
		String pw = scanf.next();
		
		int idLen = id.length();
		int pwLen = pw.length();
		
		// �ƽ�Ű�ڵ�� string���¸� ���� ���ڸ��� �˻�?
		
		if(idLen >= 4 && idLen <= 16) {
			if(int id >= 0x30 && id <= 0x39) {
				System.out.println("�ڸ��� ���Ѱ� ���̵� ���� ��ҹ��ڿ� ���� ���ǿ� �����մϴ�.");
			}else {
				System.out.println("���̵� ���� ��ҹ��ڿ� ���� ���ǿ� �����ؾ��մϴ�.");
			}
		}
		
		// ���Խ�?
		if(pwLen >= 6 && pwLen <= 16) {
			if(pw=="^[A-Za-z[0-9]]{10,20}$") {
				System.out.println("�ڸ��� ���Ѱ� ��й�ȣ ���� ��ҹ��ڿ� ���� ���ǿ� �����մϴ�.");
			}else {
				System.out.println("��й�ȣ ���� ��ҹ��ڿ� ���� ���ǿ� �����ؾ��մϴ�.");
			}
		}
		
		
		
	}

}
