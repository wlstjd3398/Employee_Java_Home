package chapter12;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElectricFan fan1 = new ElectricFan();
		// fan1.  �̶�� ���� �ٷ� �� ��ü�� Ÿ�� EletricFan���� � �޼��忡 �����Ҽ��ִ��� ������
		
		WallMountedFan fan2 = new WallMountedFan();
		// fan2. �̶�� ���� �ٷ� �� ��ü�� Ÿ�� WallMountedFan���� � �޼��忡 �����Ҽ��ִ��� ������
		
		// ��ü Ÿ�԰� �ν��Ͻ� Ÿ���� ���� �������
		// ������ = ��ü�� �ν��Ͻ� �̸� �ٸ��� ��
		// �θ� Ÿ���� ��ü(ElectricFan)�� �ڽ� Ÿ��(WallMountedFan)�� �ν��Ͻ��� �����ϴ� ��
		
		ElectricFan fan3 = new WallMountedFan();
		// ��ǳ�⸦ �ϳ� �����Ҽ��ִ� �Ϳ� �����̼�ǳ�⸦ �����ߴ�
		// fan3. ElectricFan ��ü Ÿ�Կ��� �ν��Ͻ��� 100�� Ȱ����� -> hangFan ��� ����
		// ����� ������ �̰͵� ������ ��������
		
//		WallMountedFan fan4 = new ElectricFan();
		// ������ ���� -> �ڽ�(WallMountedFan)�� �θ�(ElectricFan)���� �� ���� ���� �˰� ����(ex.hangFan)
		// �������� �����Ϸ��� ��� ���迡 �ִ� Ŭ�������� Ȱ���ؾ���
		// �������� �����Ϸ��� ��ü�� Ÿ���� �θ� Ŭ�����̾���ϰ�
		// �ν��Ͻ� Ÿ���� �ڽ� Ŭ���� Ÿ���̾����
		
	}

}
