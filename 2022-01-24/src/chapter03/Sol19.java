package chapter03;

public class Sol19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 6�п� 0.1
		double employ = 2.7;
		double change = employ * 60;
		int hour = (int)change / 60;
		int minute = (int)change % 60; 
		System.out.println(change);
		System.out.println(hour + "��" + minute +"��");
	}

}
