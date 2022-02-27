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
	
	
	
	// �������̵��� ���� : ?? = ���? ������ �����ؾ��Ѵ� 
	// �޼��� �뵵 : �� ��ü�� �Ű������� ���޹��� ��ü�� ������ �ٸ��� �˷���
	// � �ڵ带 ��ߵ��� ä������
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}



	// �޼��� �뵵 : �������̵��� �Ϸ��� ����� �����ؾ��Ѵ�(�ڽ�Ŭ������ �θ� �����Ҽ��ְ��ؾ���)
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
