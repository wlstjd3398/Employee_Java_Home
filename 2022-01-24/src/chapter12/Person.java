package chapter12;

// ������� �̸�, ����, Ű�� ���� �ְ�
// ���ϰ� �Դ� �ൿ�� �� �� �ִ�
// ����� Ư¡

public class Person {
// Ŭ������(�ڽ�Ŭ����)�� Student(�θ�Ŭ����)�� ����
// �����޴� �ڵ�� ���� �� ����
	
	private String name;
	private int age;
	private double height;
	
	public void say() {
		System.out.println("���ϴ�");
	}
	
	public void eat() {
		System.out.println("�Դ�");
	}

	
	// getter setter ����Ű alt + shift + s -> r
	// �������� ����Ű�� ���� �͵� �Ƿ�!!
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}
	
	
	
}
