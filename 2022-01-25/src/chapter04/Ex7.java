package chapter04;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ������ 0�� �ε���, ���������� 1���ε���, ���������� 2���ε���
		int[][] stScores = {
				{84, 93, 52, 42},
				{62, 71, 79, 100},
				{55, 80, 33, 52}
		};
		
		
		// stScores �迭�� �����ڸ��� �̿��ؼ�
		// �л����� �������� ��հ� �浿���� ����� ����ض�
		int korSum = stScores[0][0] + stScores[0][1] + stScores[0][2] + stScores[0][3];
		// 0���� ��������
		double korAvg =(double) korSum / stScores[0].length;
		System.out.println("�л��� �������� ��� = " + korAvg);
				
		int kilSum = stScores[0][2] +stScores[1][2] + stScores[2][2];
		// �浿���� ������ 3�������� ���� 
		double kilAvg = (double) kilSum / stScores.length;
		System.out.println("�浿���� ��� = " + kilAvg);
		
		
		
				
		
	}

}
