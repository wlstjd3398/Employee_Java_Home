package chapter16;

public class Box<T> {
//�ڽ�Ŭ���� �ȿ��� ���׸����� �����Ų��
// ���׸��� Ÿ��
	
	private int quantity;
	
	
	
	
//	private�̿��������� generics �������� ��ø� public ��
	public T item;
	
	// ������Ÿ�� �ڸ��� ���׸��� Ÿ���� ����� ����, ���� �޼��带 ���� �����ض�
	
	// ��ȯ�ϴ� item�� ��ȯŸ���� T
	 public T getItem() {
	
		return item;
	}
	
	 // �Ű������� Ÿ���� T
	 public void setItem(T item) {
			this.item = item;
			
		}
	 
}
