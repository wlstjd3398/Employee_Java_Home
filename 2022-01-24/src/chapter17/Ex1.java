package chapter17;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �÷��� �����ӿ�ũ -> �ڷ� ������ �ϳ��� ArrayList
		// �迭 -> �ڷ� ������ �ϳ�
		
		String[] strArr = new String[3];
		
		ArrayList<String> strList = new ArrayList<String>();
		// ���ڿ��� ������ ArrayListŬ������ package�ȿ� 
		// ArrayList�� ��� import�������
		
		strList.add("A");
		strList.add("B");
		System.out.println(strList);
		
		strList.add("D");
		strList.add(2, "C");
		System.out.println(strList);
		// C��� ���ڸ� 2���ε��� �ڸ���(D�ڸ�) ��ġ�⸦ �� 
		// -> C�� �� �ڸ��� �����ϰ� D�� ���� �ε����� �̵���
		
		
		// �Ʒ� add �޼����� ���� ������ �м��ϼ���
		strList.add(0, "Z");
		System.out.println(strList);
		
		// 0�� �ε����� ����
		String firstString = strList.get(0);
		System.out.println("ù ��° ���ڿ��� " + firstString);
		
		String removeString = strList.remove(0);
		// 0�� �ε����� �����Ϸ���  0�� ���� �ڸ����� ������ ���� -> ������ �ε��������� ����
		System.out.println("������ ���ڿ��� " + removeString);
		System.out.println(strList);
		
	}

}
