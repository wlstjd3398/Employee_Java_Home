package chapter07;

public class Sol11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character c1 = new Character();
		c1.HP = 100;
		c1.MP = 50;
		c1.AP = 10;
		c1.DP = 5;
		
		Character c2 = new Character();
		c2.HP = 90;
		c2.MP = 70;
		c2.AP = 7;
		c2.DP = 3;
		
		System.out.println("���� ĳ������ ü�� = " + c1.HP);
		System.out.println("���� ĳ������ ���� = " + c1.MP);
		System.out.println("���� ĳ������ ���ݷ� = " + c1.AP);
		System.out.println("���� ĳ������ ���� = " + c1.DP);
		System.out.println();
		System.out.println("�ü� ĳ������ ü�� = " + c2.HP);
		System.out.println("�ü� ĳ������ ���� = " + c2.MP);
		System.out.println("�ü� ĳ������ ���ݷ� = " + c2.AP);
		System.out.println("�ü� ĳ������ ���� = " + c2.DP);
		
	}

}
