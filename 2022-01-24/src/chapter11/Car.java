package chapter11;

public class Car {

	private String brand;
	private int color;
	private String type;
	
	
	// setter 해당 멤버변수에 값을 저장하는 메서드
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	// getter 해당 멤버 변수의 값을 변환하는 메서드
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
