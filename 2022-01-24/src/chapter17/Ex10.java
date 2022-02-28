package chapter17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(7);
		set.add(9);
		System.out.println("�ʱ� : " + set);
		
		
		set.add(1); // 1�� ����Ǿ��־ �ȵ�(����)
		System.out.println("1 ���� : " + set);
		
		
		if(set.add(3)) {
			System.out.println("3�� �߰�����");
		}else {
			System.out.println("3�� �߰����� ������");
		} // �̷��� Ȯ���� �� ����
		
		
		set.remove(1); // 1�� ������ �ƴ϶� Ÿ���� Integer�� �ٲ㼭 ����°�
		System.out.println("1 ���� : " + set);
		
		
		// index��ȣ�� ��� get�� �Ҽ�����
//		set.get
		// ���ٹ��1
		for(Integer number : set) {
			System.out.println(number);
		}
		
		
		// ���ٹ��2
//		iterator() -> set�ȿ� ����ִ� ��ü �����͵��� 
//		iterator �ڷᱸ���� ��Ƽ� iterator�� ��ȯ�ϴ� �޼���
//		iterator �ڷᱸ�� -> ���� ������(Ŀ��)�� �����͵��� �����ִ� ����
//		�Ʒ�ȭ��ǥ��� (���� ������ �Ǵ� Ŀ����� �θ�)
		// Integer�� ����ִ� Iterator�� -> ���׸��� �߰�
//		Iterator<Integer> iterator = set.iterator();
//		Integer nthInteger = iterator.next();
//		System.out.println(nthInteger);
		// ���������͸� ��ĭ�ڷ� �ű�� ���ڸ��� �ִ� nthInteger�� ���� 
//		nthInteger = iterator.next();
//		System.out.println(nthInteger);
//		
//		nthInteger = iterator.next();
//		System.out.println(nthInteger);
//		
//		nthInteger = iterator.next();
//		System.out.println(nthInteger);
		// ���̻� next�� ��� ����
		
		// while �ݺ������� �ٲټ���
		// �� ������� �� �ʿ����, �ݺ��Ǵ°ͺ��� ���� �ص���
		Iterator<Integer> iterator = set.iterator();
		Integer nthInteger;
		
//		int count = 1;
		
		// iterator.hasNext()
		// hasNext ���� Ŀ����ġ���� �������� �̵��Ҽ��ִ��� �˷��ִ� �޼���
		
		while(iterator.hasNext()) {
			nthInteger = iterator.next();
			System.out.println(nthInteger);
//			count++;
		}
		
		
	}

}
