package chapter06;

import java.util.Arrays;
import java.util.Random;

public class Sol9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		int[] arrLotto = new int[6];
		
		for(int i = 0; i < 6; i++) {
			arrLotto[i] = random.nextInt(45) + 1;
			
			for(int j = 0; j < i; j++){
				if(arrLotto[i] == arrLotto[j]) { // ���Ǽ��� ���Ǽ��� ������ 
					i--; // Ƚ���� ���̰� ���� for�����ǽ��� �������ϴ� ���� �ö�  �ٽ� �����ϰ��ϴ� �ߺ�����
					break;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arrLotto));
		
	}

}