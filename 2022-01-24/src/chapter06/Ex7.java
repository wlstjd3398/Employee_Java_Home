package chapter06;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int num = 1;
//		
//		while(true) {
//			System.out.println("Hello World~!");
//			
//			num++;
//			
//			if(num==4) {
//				
//				break;
//			}
//				
//		}
		// while �� true�� �� while(num <= 3) �� �ᵵ ���������� ���� while �ȿ� �д�
		
		
		// 1 ~ 10 ������ �� �߿��� ¦���� ����ϴ� ���α׷��� �����ض�
//		int num = 2;
//		
//		while(num <= 10) {
//			System.out.println(num);
//			
//			num = num + 2;
//		}
		
		
		// if continue�� ����� ���
		int num = 2;
		
		while(num <= 10) {
			if(num % 2 == 1) {
				num++;
				continue;
			}
			
			System.out.println(num);
			num++;
			
		}
		
		
		
	}

}
