package chapter11;

public class Phone {

	// ������ Phone Ŭ���� ����� �������� �����͸� �����ؼ�
	// �� �ڵ����� ������ �����ϼ���
	
	private String maker;
	private int price;
	private double displaySize;
	private int ram;
	
	
	// private�� ���� �����ص� ��밡���ѵ� ���������ڸ� ����ؼ� �����Ͽ����� ���� ��찡 ����
	
	// setter �ش� ��������� ���� �����ϴ� �޼���
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	
	public String getMaker() {
		return maker;
	}
	
	public int getPrice() {
		return price;
	}
	public double getDisplaySize() {
		return displaySize;
	}
	public int getRam() {
		return ram;
	}
	
}
