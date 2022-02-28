package chapter17;

public class Customer {

	private String name;
	private String tel;
	private int seat;
	
	// �޼��� �뵵 : �Ű������� ���·� �ν��Ͻ��� ȣ���ϱ�����
	public Customer(String name, String tel, int seat) {
		this.name = name;
		this.tel = tel;
		this.seat = seat;
	}
	
	
	
	// �������̵��� ���� : ??������ �����ؾ��Ѵ� 
	// �޼��� �뵵 : �� ��ü�� �Ű������� ���޹��� ��ü��(�� ��ü) ������ �ٸ��� �˷���
	// � �ڵ带 ��ߵ��� ä������
	
	// �񱳴���� ������ͼ� �Ű�������, �ΰ�ü ���ؼ�, ���� ����� ����, true or false�� ����
	@Override
	public boolean equals(Object obj) {
		Customer other = (Customer) obj; // Customer ���¸�������
		String otherName = other.getName();
		String otherTel = other.getTel();
		int otherSeat = other.getSeat();
		
		boolean nameSame = name.equals(otherName);
		boolean telSame = tel.equals(otherTel);
		boolean seatSame = seat == (otherSeat);
		
		
//		return super.equals(obj);
		return nameSame && telSame && seatSame;
	}



	// �޼��� �뵵 : 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name=" + name + ",tel =" + tel + ",seat =" + seat;
	}
	
	
	// �޼��� �뵵 : ������� private �Ǿ��־ get���� �ܺο��� ���� ��ȯ������
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public int getSeat() {
		return seat;
	}
	
	
	// �޼��� �뵵 : ������� private �Ǿ��־ set���� �ܺο��� ����
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
