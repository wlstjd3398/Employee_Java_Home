package chapter12;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lion lion1 = new Lion("Simba");
		
		Lion lion2 = new Lion("Mufasa");
		
		Rabbit rabbit = new Rabbit("Bunny");
		
		ZooKeeper jane = new ZooKeeper();
		jane.feed(lion1);
		jane.feed(rabbit);
		// �����ε��� ����ؼ� ���ڿ��� �����ֱ�, �䳢���� �����ֱ�
		
	}

}
