package chapter04;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ö���� ������ ������ st1Scores �迭�� �����ϰ�
		// st1scores �迭�� �����ڸ� Ȱ���ؼ�
		// ö���� ����, ����� ����� ����ض�
		
//		int[] st1Scores = new int[4];
//		st1Scores = new int[3];
//		
//		st1Scores[0] = 84;
//		st1Scores[1] = 62;
//		st1Scores[2] = 55;

		
		int[] st1Scores = new int[] {84, 62, 55};
		
		int sum = st1Scores[0] + st1Scores[1] + st1Scores[2];
		System.out.println("sum = " + sum);
		
		double avg = sum / 3;
		System.out.println("avg = " + avg);
		
		
	}

}
