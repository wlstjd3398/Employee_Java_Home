package chapter12;

public class NoteBook extends Pc{
//�θ�(Pc)���� �ڽ�(NoteBook)�� Ȯ��Ȱ�
	// �ܼ��� Ŭ������ �ҽ��ڵ尡 �ߺ� �Ǿ��ٰ� �ؼ� ����� �ϸ� �ȵ�
	// ��Ŭ������ Ư¡�� �ٸ� Ŭ������ �����ϰ� ������ �����鼭
	// ��Ŭ���� �� ��Ŭ������ �� Ȯ��� �����϶����� ����� �����ؾ���

// �θ� ���� ��� Ŭ������ Object Ŭ������ �ڽ��� ��
	// �ڽ� Ŭ������ �θ� �������� �ڵ嵵 ���� �ް� ��
	
	private double Battery;
	
	public void charging() {
		System.out.println("������ �Ѵ�");
	}
	
//	public void showPcInfo( ) {
//		System.out.println("===========[Pc Info]===========");
//		System.out.println("CPU = " + getCPU()); // ��ӹ��� ������� ������ ���� why? -> �ڱⰡ ���� �ִ� ���������� ã��(��� �����Ŷ� ���ٰ� �Ǵ�)
//		System.out.println("GPU = " + getGPU()); // -> getter�� ��ӹ��� ������ ������� ����ؼ� �ذ�(��ü�������� ã�����)
//		System.out.println("RAM = " + getRAM()); // super.getCPU()��� �����ڸ� �Ἥ ��ü�������� �ٷ� ã�� ->�� �Ⱥ��̱���
//		System.out.println("HDD = " + getHDD());
//		System.out.println("Battery = " + Battery); // �ڱⰡ �����ִ� ��������� ����
//		System.out.println("===============================");
//	}
	
	// �������̵� ����Ű : alt + shift + s + v
	
	public void showNoteBookInfo() {
		System.out.println("===========[NoteBook Info]===========");
		System.out.println("CPU = " + getCPU());
		System.out.println("GPU = " + getGPU());
		System.out.println("RAM = " + getRAM());
		System.out.println("HDD = " + getHDD());
		System.out.println("Battery = " + Battery);
		System.out.println("===============================");
	}

	
	
	// ���� �����, �Ʒ��� �������̵� �����ؼ� ���� �ҽ��ڵ� �����Ѱ�
	// @Override��� ���� �־ ��� �Ǵµ� �ֳ����̼��̶� �θ�, ��ǻ�Ͱ� ���� �ּ����� �ν��ϸ�� -> JSP, Spring ��� ����
	
	@Override
	public void showPcInfo() {
		System.out.println("===========[NoteBook Info]===========");
		System.out.println("CPU = " + getCPU());
		System.out.println("GPU = " + getGPU());
		System.out.println("RAM = " + getRAM());
		System.out.println("HDD = " + getHDD());
		System.out.println("Battery = " + Battery);
		System.out.println("===============================");
	}
	
}
