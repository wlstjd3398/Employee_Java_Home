package chapter11;

public class Car {

	// �Ű������� 1���� ������
	public Car (String brand) {
//		this.brand = brand;
//		�� �ѹ� ������ �ȿ��� �ٸ� �����ڸ� ȣ�Ⱑ�� -> �ݺ������� ���Ǵ� �ڵ� ���ϼ� ����
//		������ �ȿ��� �ٸ� �����ڸ� ȣ���ϴ� �ڵ�� �ݵ�� ù �ٿ� ��ġ�ؾ���
		this(brand, 0, null);
	}
	
	// �Ű������� 2���� ������
	public Car (String brand, int color) {
		this.brand=brand;
		this.color=color;
	}
	
	// �Ű������� 3���� ������
	public Car(String brand, int color, String type) {
		this.brand=brand; // �Ű����� brand�� ��������� �����ϵ��� this.brand��
		this.color=color;
		this.type=type;
	}
	// �Ű������� �ν��Ͻ��� ���鶧 ���ڸ� ����
	
	// Car Ŭ������ �⺻�����ڸ� �����ض�
//	public Car() {
//		brand = "�����ڵ���";
//		color = 1;
//		type = "�¿���";
//	}
	// -> ���������ڰ� public, �Ű������� ����, �ҽ��ڵ尡 ���� ������
	
	
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
