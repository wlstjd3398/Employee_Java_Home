package chapter10;

// Ŭ������ �� ����� ���
// Ŭ������ ����ؼ� ���� ��ü�� �����ؼ�
// �� ��ü�� Ư¡�� ������ �� �ְ� ��� ������ �����ϰ�
// �� ��ü�� ���(�ൿ)�� �� �� �ְ� �޼��带 �����ؾ���

// �ڵ��� 3�븦 �ڹٷ� �����Ϸ�����
// ù��° �ڵ���
// - �� : ������
// - �귣�� : ����
// �ι�° �ڵ���
// - �� : ���
// - �귣�� : ����
// ����° �ڵ���
// - �� : �Ķ���
// - �귣�� : BMW

// 3 �ڵ����� Ȱ���ؼ� ���̽� �������� �����Ϸ�����
// �޸��� ���, ���ߴ� ���, �帮��Ʈ �ϴ� ��� ���� �ʿ���


public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
//		car1.color = "red";
//		car1.brand = "hyundai";
		car1.giveCharacteristicsToObjects("red", "hyundai");
		car1.run();
		car1.stop();
		
		Car car2 = new Car();
//		car2.color = "white";
//		car2.brand = "benz";
		car2.giveCharacteristicsToObjects("white", "benz");
		car2.run();
		car2.stop();
		
		Car car3 = new Car();
//		car3.color = "blue";
//		car3.brand = "BMW";
		car3.giveCharacteristicsToObjects("blue", "BMW");
		car3.run();
		car3.stop();
		
	}

}
