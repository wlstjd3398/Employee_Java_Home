package chapter14;

import java.util.Scanner;

public class Ex5 {

	// static : ��ü ���� ���� ��밡���ϰ� Ŭ���� ����
	// �޼��� static �������� static ����� ��밡��
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���ڿ��� �����ϳ��� ã�����ϴ� �����ϳ��� ���ؼ� ������ ����ε�������, ������ ã�� ���߽��ϴ�. ���
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڿ� �Է� >> ");
//		String target = scan.nextLine();
		
		String target = null;
		
		System.out.println("ã���� �ϴ� ���� �Է� >> ");
		char data = scan.next().charAt(0);
		try {
			int index = Util.findChar(target, data);
			if(index == -1) {
				System.out.println(data + "��(��) ã�� ���߽��ϴ�.");
			}else {
				System.out.println(data + "��(��) " + index + "�� �ε����� ����ֽ��ϴ�.");
			}
		}catch(NullPointerException e) {
			System.out.println("target�� Null�Դϴ�. Ȯ�����ּ���.");
		}
		
		
	}

}
