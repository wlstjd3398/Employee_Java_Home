package chapter05;

import java.util.Scanner;

public class Sol17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanf = new Scanner(System.in);
		
		String[] menuList = {"���", "���İ�Ƽ", "������ũ", "��������"};
		
		System.out.print("� ������ �ֹ��Ͻðڽ��ϱ�? ");
		String menu = scanf.next();
		
		boolean exist = false;
		if(!exist) exist = menuList[0].equals(menu);
		if(!exist) exist = menuList[1].equals(menu);
		if(!exist) exist = menuList[2].equals(menu);
		if(!exist) exist = menuList[3].equals(menu);;
		
		if(exist) System.out.println("�ֹ��Ͻ� " + menu + " ��(��) �����Ǿ����ϴ�.");
		else System.out.println("�ֹ��Ͻ� " + menu + " ��(��) ���� �޴��Դϴ�.");

		
	}

}
