package chapter12;

public class ElectricFan {

	private boolean power; // ���� ��/���� ����
	private int fanStrength; // �ٶ��� ����
	private boolean rotation; // ȸ�� ����
	
	public void powerOnOff() {
		System.out.println("��ǳ���� ���� ��/����");
	}
	
	public void pushFanStrength() {
		System.out.println("��ǳ���� �ٶ����� ����");
	}
	
	public void rotationSwitch() {
		System.out.println("��ǳ���� ȸ�� ���� ����");
	}
	
}
