package chapter06;

import java.util.Random;

public class StudentManagement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		int studentCount = random.nextInt(9)+2;
		int subjectCount = 3;
		
		int[] kor = new int[studentCount];
		int[] eng = new int[studentCount];
		int[] mat = new int[studentCount];
		int[] sums = new int[studentCount];
		double[] avgs = new double[studentCount];
		int[] ranks = new int[studentCount];
		
		for(int i=0; i<sums.length; i++) {
			kor[i] = random.nextInt(101);
			eng[i] = random.nextInt(101);
			mat[i] = random.nextInt(101);
			
			sums[i] = kor[i] + eng[i] + mat[i];
			avgs[i] = (double) sums[i] / subjectCount;
		}
		
		for(int i=0; i<sums.length; i++) {
			ranks[i]=1;
			for(int j=0; j<sums.length; j++) {
				if(sums[i] < sums[j]) {
					ranks[i]++;
				}
			}
		}
				
				
				
		for(int i=0; i<sums.length; i++) {
			System.out.println("<<" + (i+1) +" ��° �л��� ���� >>");
			System.out.println("���� = " + kor[i]);
			System.out.println("���� = " + eng[i]);
			System.out.println("���� = " + mat[i]);
			System.out.println("���� = " + sums[i]);
			System.out.println("��� = " + avgs[i]);
			System.out.println("���� = " + ranks[i]);

		}		
				
	}

}
