package chapter08;

public class Object5 {

	// �� ������ ���޹޾� �� ���� �� ū ���� ȣ�� �������� �ǵ����ִ� �޼���
	int big(int num1, int num2) {
		if(num1 >= num2) {
			return num1;
		}else {
			return num2; // return �� ������ �޼����� ������, Ex4�� ���� �ش�κ��� ��ȯ�Ѵ�
			// �׸��� ������ �� ������
		}
	}
	
	
	// �ϳ��� ������ ���� �޾� 
	// �� ���� ¦����� ¦��
	// Ȧ����� Ȧ��
	// ȣ�������� �ǵ����ִ� �޼���
	String compare(int a) {
		if(a % 2 == 0) {
			return "¦��";
		}else {
			return "Ȧ��";
		}
	}
	
	
	void sum() {
		System.out.println(1 + 1);
	}
	
	// �޼����� ��ȯŸ���� void�� �ƴϸ�
	// ��ȯŸ���� �ִ� �޼���� ��� ǥ��(= void �Ⱦ��ٸ� return�� �ִ�)
	// ��ȯŸ�� -> �޼��带 ȣ���ϸ� ��ȯ Ÿ�԰� ��ġ�ϴ� Ÿ���� �����Ͱ� ��ȯ�ȴ�, return�� int(���� �߿� �ϳ�)�� �ѽ�
	// ��ȯŸ���� �ִ� �޼��� = return ������ �־����
	int sum2() {
		System.out.println(3);
		
		return 3;
		
	}
	
	
	double sum3() {
		
		return 170.6;
		
	}
}
