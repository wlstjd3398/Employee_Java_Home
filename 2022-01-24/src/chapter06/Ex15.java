package chapter06;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// str ���ڿ����� 0��°�� a, 4��°�� e
		String str = "apple";
		
		System.out.println("�� ���ڿ��� ���̴� 5���Դϴ�.");
		
		int strLength = str.length();
		System.out.println("�� ���ڿ��� ���̴� " + str.length() + "���Դϴ�.");
		
		System.out.println("�� ���ڿ��� ���̴� " + strLength +"���Դϴ�.");
		
		
		// ���ڿ����� ���� ����
		char firstChar = str.charAt(0);
		System.out.println("str ���ڿ����� 0��° �ε����� ����(ù��°����)�� " + firstChar);
		
		
		// �� ���ڿ��� ù ��° ���ں��� ������ ���ڱ��� �ϳ��� �̾Ƽ� ����ض�
		char secondChar = str.charAt(1);
		char thirdChar = str.charAt(2);
		char forthChar = str.charAt(3);
		char fifthChar = str.charAt(4);
		
		System.out.println(secondChar);
		System.out.println(thirdChar);
		System.out.println(forthChar);
		System.out.println(fifthChar);
		
		// charAt�� �̿��Ͽ� �ϳ��� �̾Ƽ� ���
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		
		
		// for���� �̿��ؼ� ���ڿ����� ���ڸ� ����
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		
		
		
	}

}
