package chapter06;

import java.util.Scanner;

public class Sol21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// trim() �Լ��� ���ڿ��� �յ� ���鸸  ���Ű���
		// replaceAll(" ","") �Լ��� ��� ���� ���Ű���
		
		Scanner scan = new Scanner(System.in);
		
		String s1 = "j a v a";
		System.out.println(s1);
		
//		s1.trim();
		 s1 = s1.replaceAll(" ", "");
		
		
		System.out.println(s1);
		
	}

}
