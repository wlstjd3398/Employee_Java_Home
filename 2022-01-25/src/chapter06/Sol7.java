package chapter06;

import java.util.Scanner;

public class Sol7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanf = new Scanner(System.in);
		String[] menuList = {"���", "���İ�Ƽ", "������ũ", "��������"};
		
		System.out.println("� ������ �ֹ��Ͻðڽ��ϱ�?");
		String menu = scanf.next();
		
		boolean exist = false;
		for(int i=0; i<menuList.length; i++) {
			if(!exist) exist = menuList[i].equals(menu);
		}
		
//		if(!exist) exist = menuList[0].equals(menu);
//		if(!exist) exist = menuList[1].equals(menu);
//		if(!exist) exist = menuList[2].equals(menu);
//		if(!exist) exist = menuList[3].equals(menu);
		
		if(exist) System.out.println("�ֹ��Ͻ� " + menu + " ��(��) �����Ǿ����ϴ�.");
		else System.out.println("�ֹ��Ͻ� " + menu + " ��(��) ���� �޴��Դϴ�.");

		
	}

}
