package chapter04;

import java.util.Arrays;

public class Sol14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length = 4;
		
		int[] intArray = new int[length];
		
		
		
		char[] alphabet1 = {'a', 'b', 'c', 'd', 'e'};
		char[] alphabet2 = new char[alphabet1.length];
		
		alphabet2[0] = alphabet1[0] - 32;
		alphabet2[1] = alphabet1[1];
		alphabet2[2] = alphabet1[2];
		alphabet2[3] = alphabet1[3];
		alphabet2[4] = alphabet1[4];
		
		System.out.println("alphabet1 => " + Arrays.toString(alphabet1));
		System.out.println("alphabet2 => " + Arrays.toString(alphabet2));


	}

}
