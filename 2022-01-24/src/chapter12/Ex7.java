package chapter12;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// �� ���α׷��� ���� ������ �ľ��ϰ�
// �� ���α׷��� ��������� �� �߻��ϴ� ������ ������ �����ض�
		// -> fe1.water, fe2.water �޼��� �̿� �� �� ����
		
		// ��� �����̱� ������ �������� ������ �� ������
		// �������� ��Ģ�� ��߳��� ��Ȳ�� ����
		// -> �ڹ����� ��������  �˻��ش޶� ��û�ϴ°�
		// instancof ������ ���
		// ��ü�� ������ Ÿ������ ����ȯ �� �� �ִ��� �˷���
		
		Car car = new Car();
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
//		fe1 = (FireEngine) car;
//		fe2 = (FireEngine) fe1;
//		
//		fe1.water();
//		fe2.water();
		
		// fe1 = (FireEngine) Car; �̰��� ����°�
		// car��ü�� Car���� ����ȯ �Ҽ��ֳ���?
		// car��ü�� Object(�ֻ��� ��ü)�� ����ȯ �Ҽ��ֳ���?
		System.out.println(car instanceof Car);
		System.out.println(car instanceof Object);
		
		if(car instanceof FireEngine) {
			fe1 = (FireEngine) car;
		}
		
		// fe1��ü�� FireEngine���� ����ȯ �Ҽ��ֳ���?
		// fe1��ü�� Car�� ����ȯ �Ҽ� �ֳ���?
		// fe1��ü�� Object(�ֻ�����ü)�� ����ȯ �Ҽ��ֳ���?
		// -> �������� Object obj = (Object) fe1; �̰� ����°�
		System.out.println(fe1 instanceof FireEngine);
		System.out.println(fe1 instanceof Car);
		System.out.println(fe1 instanceof Object);
		
	}

}
