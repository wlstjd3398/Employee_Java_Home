package chapter12;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// AppleŸ��, BananaŸ��, OnionŸ���� basket�� ��ƾ��Ѵ�
//		Apple[] applebasket = new Apple[3];
//		
//		applebasket[0] = new Apple();
//		applebasket[1] = new Apple();
//		applebasket[2] = new Apple();
//		
//		Banana[] bananabasket = new Banana[3];
//		bananabasket[0] = new Banana();
//		bananabasket[1] = new Banana();
//		bananabasket[2] = new Banana();
//		
//		Onion[] onionbasket = new Onion[3];
//		onionbasket[0] = new Onion();
//		onionbasket[1] = new Onion();
//		onionbasket[2] = new Onion();
		
		
		Product[] basket = new Product[3];
		basket[0] = new Apple();
		basket[1] = new Banana();
		basket[2] = new Onion();
		
		// ������ ����������, ä�Ҵ� ä�������븸 �����ϰ�, �ٱ��Ͽ� ��� ���α׷� ����
		Fruit[] fruitShelf = new Fruit[3];
		fruitShelf[0] = new Apple();
		fruitShelf[1] = new Banana();
		fruitShelf[2] = new Onion(); // �������� ���� Ʋ�� �ڵ尡 �´°�
		
		Vegetable[] VegetableShelf = new Vegetable[3];
		VegetableShelf[0] = new Onion();
		VegetableShelf[1] = new banana(); // �������� ���� Ʋ�� �ڵ尡 �´� ��
		
	
	}

}
