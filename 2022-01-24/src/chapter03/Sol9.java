package chapter03;

import java.util.Random;

public class Sol9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		int value = random.nextInt() / 3;
		int tri = (value==0) ? true : false;
		
		System.out.println(tri);
		
		
		
	}

}
