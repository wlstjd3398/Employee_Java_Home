package chapter05;

public class Sol7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {30, 24, 71, 43, 86, 70, 68, 78, 86, 98};
		
		// �迭 �հ�
		double sum = arr[0];
		for(int n=1; n<arr.length; n++) {
			sum=sum+arr[n];
		}
		System.out.println(sum);
		
		// �迭 ���
		double avg = sum / arr.length;
		System.out.println(avg);
		
		// �迭 �ִ밪 0-1 0-2 0-3 0-4 0-5
		int max = arr[0];
		for(int m=1; m<arr.length; m++) {
			if(arr[m]>=max) {
				max=arr[m];
			}
		}
		System.out.println("�ִ밪 = " + max);
		
		// �迭 �ּҰ�
		int min = arr[0];
		for(int m=1; m<arr.length; m++) {
			if(arr[m]<=min) {
				min=arr[m];
			}
		}
		System.out.println("�ּҰ� = " + min);
		
		
	}

}
