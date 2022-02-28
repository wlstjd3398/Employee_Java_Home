package chapter17;

public class Customer {

	private String name;
	private String tel;
	private int seat;
	
	// 메서드 용도 : 매개변수의 형태로 인스턴스를 호출하기위해
	public Customer(String name, String tel, int seat) {
		this.name = name;
		this.tel = tel;
		this.seat = seat;
	}
	
	
	
	// 오버라이딩의 조건 : ?? = 상속? 조건을 만족해야한다 
	// 메서드 용도 : 이 객체와 매개변수로 전달받은 객체가(두 객체) 같은지 다른지 알려줌
	// 어떤 코드를 써야될지 채워보자
	
	// 비교대상을 가지고와서 매개변수로, 두객체 비교해서, 비교한 결과를 저장, true or false를 리턴
	@Override
	public boolean equals(Object obj) {
		Customer other = (Customer) obj; // Customer 형태를가져옴
		String otherName = other.getName();
		String otherTel = other.getTel();
		int otherSeat = other.getSeat();
		
		boolean nameSame = name.equals(otherName);
		boolean telSame = tel.equals(otherTel);
		boolean seatSame = seat == (otherSeat);
		
		
//		return super.equals(obj);
		return nameSame && telSame && seatSame;
	}



	// 메서드 용도 : 오버라이딩을 하려면 상속을 만족해야한다(자식클래스가 부모를 선택할수있게해야함)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name=" + name + ",tel =" + tel + ",seat =" + seat;
	}
	
	
	// 메서드 용도 : 멤버변수 private 되어있어서 get으로 외부에서 들어와 반환시켜줌
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public int getSeat() {
		return seat;
	}
	
	
	// 메서드 용도 : 멤버변수 private 되어있어서 set으로 외부에서 저장
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	
	
}
