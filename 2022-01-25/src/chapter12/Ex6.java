package chapter12;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		// �ϳ��� ��ü�� �̿��ؼ� �������� �ν��Ͻ��� �������� �����Ҽ��ִ�
		
		car = (Car) fe1; // ������Ÿ���� Car�� ���� Ÿ������ ����ȯ����� ���尡��
		fe2 = (FireEngine) car;
		// �ڽ� fe1�� car�θ�� ��ĳ����(����ȯ ������ ��������)
		// �θ� car�� fe2�ڽ����� �ٿ�ĳ����(����ȯ ������ ���� �Ұ���)
		
		// ���������� ����
//		int num1 = 3;
//		double num2 = (double) num1;
//		
//		double num3 = 3.14;
//		int num4 = (int) num3;
		
//		// ��ĳ����
//		���� �������� ū������ �ö󰥶�, ����ȯ ������ ��������
//		�ڼ�Ÿ�Կ��� ����Ÿ������ �ö󰥶�
//		// �ٿ�ĳ����
//		ū �������� ���� ������ ��������, ����ȯ ������ �����Ұ���
//		����Ÿ�Կ��� �ڼ�Ÿ������ ��������

	}

}
