package chapter05;

import java.util.Random;

public class StudentManagement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] mat = new int[2];
		int[] sums = new int[2];
		double[] avgs = new double[2];
		int[] ranks = new int[2];
		
		Random random = new Random();
		
		System.out.println("1 ��° �л��� ������ �Է��ϼ���");
		System.out.println("���� => ");
		kor[0] = random.nextInt(101);
		System.out.println("���� => ");
		eng[0] = random.nextInt(101);
		System.out.println("���� => ");
		mat[0] = random.nextInt(101);
		
		System.out.println("2 ��° �л��� ������ �Է��ϼ���");
		System.out.println("���� => ");
		kor[1] = random.nextInt(101);
		System.out.println("���� => ");
		eng[1] = random.nextInt(101);
		System.out.println("���� => ");
		mat[1] = random.nextInt(101);
		
		sums[0] = kor[0]+eng[0]+mat[0];
		avgs[0] = (double) sums[0] / 3;
		
		sums[1] = kor[1]+eng[1]+mat[1];
		avgs[1] = (double) sums[1] / 3;
		
		ranks[0] = avgs[0] > avgs[1] ? 1 : 2; 
		ranks[1] = avgs[0] < avgs[1] ? 1 : 2; 
		ranks[0] = avgs[0] == avgs[1] ? 1 : ranks[0]; 
		ranks[1] = avgs[0] == avgs[1] ? 1 : ranks[1]; 
		
		System.out.println("<< 1 ��° �л��� ���� >>");
		System.out.println("���� = " + kor[0]);
		System.out.println("���� = " + eng[0]);
		System.out.println("���� = " + mat[0]);
		System.out.println("���� = " + sums[0]);
		System.out.println("��� = " + avgs[0]);
		System.out.println("���� = " + ranks[0]);
		System.out.println("<< 2 ��° �л��� ���� >>");
		System.out.println("���� = " + kor[1]);
		System.out.println("���� = " + eng[1]);
		System.out.println("���� = " + mat[1]);
		System.out.println("���� = " + sums[1]);
		System.out.println("��� = " + avgs[1]);
		System.out.println("���� = " + ranks[1]);
		
	}

}
