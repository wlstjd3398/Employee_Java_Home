package chapter06;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ageArray = {21, 21, 23, 22};
		
		// ageArray �ȿ��� �� �л��� ���̰� ����ֽ��ϴ�.
		// �� �л��� �հ� ���̿� ��� ���̸� ����� ����ض�
		
//		for(int n=0; n<=ageArray.length; n++) {
//			System.out.println(ageArray[n]);
//			
//		}
		
		// ���2
		int totalAge = 0;
//		totalAge = totalAge + ageArray[0];
//		totalAge = totalAge + ageArray[1];
//		totalAge = totalAge + ageArray[2];
//		totalAge = totalAge + ageArray[3];
		
		for(int i=0; i<=3; i++) {
			totalAge = totalAge + ageArray[i];
		}
		System.out.println("�л��� �ѳ��� = " + totalAge);
		
		double avgAge = (double) totalAge / ageArray.length;
		System.out.println("�л��� ��ճ��� = " + avgAge);
		
		
		
		
		// ���1
//		int totalAge = ageArray[0] + ageArray[1] + ageArray[2] + ageArray[3];
//		double avgAge =(double) totalAge / ageArray.length;
//		System.out.println("�л��� �ѳ��� = " + totalAge);
//		System.out.println("�л��� ���� ��� = " + avgAge);
		
	}

}
