package chapter16;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<Object> box1 = new Box<Object>();
		// �ڽ��� ���׸����� ����������ϴµ� �����༭ ������ٻ���
		// ���������� Ʋ������ �ƴ�
		
		// �ȵ�
//		String box1_item = box1.getItem();
		String box1_item = box1.getItem("������1");
		// ���ڿ��� �����ϸ� ���ڿ���, ���ڸ� �����ϸ� ���ڷ�
		// ������Ÿ���� T�δ� �Ҽ���� Object�� �ٲ� 
		// ������Ÿ���� Object��� �� � ���̵� �� �����Ҽ��ִ�
		Object box1_item = box1.getItem();
		
		
		
		Box<String> box2 = new Box<String>();
		box2.item = "������1";
		
		
		
		Box<Integer> box3 = new Box<Integer>();
		box3.item = new Integer(13);
		
		
		
	}

}
