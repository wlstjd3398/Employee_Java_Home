package chapter12;

public class Pc {

	private String CPU;
	private String GPU;
	private String RAM;
	private String HDD;
	
	public void powerOnOff() {
		System.out.println("������ �Ѱų� ����");
	}
	
	public void typing() {
		System.out.println("Ÿ������ �Ѵ�");
	}
	
	public void playGame() {
		System.out.println("������ �Ѵ�");
	}
	
	public void showPcInfo() {
		System.out.println("===========[Pc Info]===========");
		System.out.println("CPU = " + CPU);
		System.out.println("GPU = " + GPU);
		System.out.println("RAM = " + RAM);
		System.out.println("HDD = " + HDD);
		System.out.println("===============================");
	}
	
	
	
	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public void setGPU(String gPU) {
		GPU = gPU;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public void setHDD(String hDD) {
		HDD = hDD;
	}

	public String getCPU() {
		return CPU; // ���⼭ return �̶�� ���� NoteBookInto�� getCPU�� ���ư�
	}
	public String getGPU() {
		return GPU;
	}
	public String getRAM() {
		return RAM;
	}
	public String getHDD() {
		return HDD;
	}
	
	
	
}
