package chapter04;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// ����� ������ �ѹ��� �ϰԵǸ� �迭���� �迭�� �� �ߺ��̰Եȴ�
		int[][] studentScores = {
				{84, 62, 55},
				{93, 71, 80},
				{52, 79, 33},
				{42, 100, 52}
		};
		
		int[] student1 = studentScores[0];
		
		int total1 = student1[0] + student1[1] + student1[2];
		
		// �л��� �������� ���
//		System.out.println("�л��� �������� ��� = " + 
//		(double)(studentScores[0][0] + studentScores[1][0] + studentScores[2][0] + studentScores[3][0]) / 4);
		
		// ����� ���
		int totalKor = studentScores[0][0] + studentScores[1][0] + studentScores[2][0] + studentScores[3][0];
		double avgKor1 = (double) totalKor / 4;
		double avgKor2 = (double) totalKor / studentScores.length;

		System.out.println("����� ������� = " + avgKor1);
		System.out.println("����� ������� = " + avgKor2);
		
		System.out.println(studentScores.length);
		
		
		// �浿�� ���
		System.out.println("�浿���� ��� = " + (double)(studentScores[2][0] + studentScores[2][1] + studentScores[2][2]) / 3);
		
		// ����� ���
		double[] student3Total = {studentScores[2][0] +studentScores[2][1] + studentScores[2][2]};
		  // student3Total �迭�ȿ� 20, 21, 22 �� ��������� �ϳ��� �迭�̴� �׷��� �ؿ� student3Total[0]���� ������ ��ü����
		double student3Avg = (double) student3Total[0] / studentScores[2].length;
		
		System.out.println("�浿���� ��� = " + student3Avg);
		
		
		
	}

}
