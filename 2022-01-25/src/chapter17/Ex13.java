package chapter17;

import java.util.HashMap;
import java.util.Map;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Map�� ���׸���Ÿ���� Ű�� �� �ΰ����� ����
		// Ű String, �� Integer
		
		// 1�г� 1���� ��������
		Map<String, Integer>  classOneKor = new HashMap<>();
		
		classOneKor.put("ȫ�浿", 95); // ȫ�浿�̶�� Ű�� ���� 10�� �����
		classOneKor.put("��ö��", 86); 
		classOneKor.put("����", 35);
		
		System.out.println(classOneKor);
		
		// �� �����ʹ�� Ű�� �ֱ⿡ get ���� Ű�� ����ؼ� �� �ҷ���
		int student1Kor = classOneKor.get("ȫ�浿");
		System.out.println("ȫ�浿�� �������� : " + student1Kor);
		
		// ���� �ִ� ȫ�浿Ű�� ������� 73�� ������ �����
		classOneKor.put("ȫ�浿", 73); 
		
		// �̷��� ����� Ű���� �� ������
		classOneKor.remove("��ö��");
		System.out.println(classOneKor); 
		
		// Ű�� �˰������� �����͸� �����ϱ� ���� 
		// �׷��� Ű�� �𸣸� �����͸� �����ϱ� �����
		
		// list�� �ε�����ȣ��� ������� �����(�����ִ°� �ƴ� �̻�)
		// map�� ���� ������� �����������
		
	}

}
