package chapter12;

public class ZooKeeper {

//	public void feed(Lion lion) {
//		System.out.println(lion.getName() + " ���� ���� �ֱ�");
//	}
//	
//	public void feed(Rabbit rabbit) {
//		System.out.println(rabbit.getName() + " ���� ���� �ֱ�");
//	}
	
	// �����ε��� �Ѱ� : �ϳ��� �������� �����������
	// -> ������ �����Ͽ� Ŭ���� ����и� �̾Ƽ� ��� Ȱ���ؾ���(�������� ��ӿ����� ��밡���ؼ�)
	// -> Rabbit Lion�� Ŭ������ ����κ� ���� -> �ڽ� �θ� �����ؾ���
	// extends Animal ����
	
	public void feed(Animal animal) {
		System.out.println(animal.getName() + " ���� ���� �ֱ�");
	}
}
