package chapter16;

public class Product {

	private String category;
	private int price;
	
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
	}
// ��������� private �ɷ��־  get���� ��ȯ�ؼ� �Ű����� ���·� ȣ��� 
	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}
	
	
	
}
