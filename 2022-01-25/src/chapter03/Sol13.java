package chapter03;

public class Sol13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Math.floor() : �Ҽ��� ���ϸ� �����Ѵ�.
//		Math.ceil() : �Ҽ��� ���ϸ� �ø��Ѵ�.
//		Math.round() : �Ҽ��� ���ϸ� �ݿø��Ѵ�.
		
		double num1 = 0.16;
		double num2 = 0.2;
		double after = num1 / num2;
		System.out.println(Math.round(after * 10) / 10.0);
		
	}

}
