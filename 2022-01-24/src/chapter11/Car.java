package chapter11;

public class Car {

	private String brand;
	private int color;
	private String type;
	
	
	// setter �ش� ��������� ���� �����ϴ� �޼���
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	// getter �ش� ��� ������ ���� ��ȯ�ϴ� �޼���
	public String getBrand() {
		return brand;
	}
	public int getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
}
