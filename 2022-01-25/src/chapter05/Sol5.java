package chapter05;

import java.util.Arrays;
import java.util.Random;

public class Sol5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �߰���� ����̻��� �л��� �� ���
		int[] test = {38, 86, 68, 68, 97, 25, 84, 72, 34, 8};
		double sum = test[0] + test[1] + test[2] + test[3] + test[4] + test[5] + test[6] + test[7] + test[8] + test[9]; 
		double avg = sum / test.length; 
		System.out.println("10���� �߰���� ���� ���� = " + sum);
		System.out.println("10���� �߰���� ���� ��� = "  + avg);
		
		int pass = 0;
		
		for(int n=0; n<test.length; n++) {
			if(test[n]>=avg) {
				pass++;
			}
			
		}
		
		

		
		System.out.println("�߰���� ������� �̻��� �л� ���� " + pass + "���Դϴ�.");
		
	}

}
