package chapter17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Character> set = new HashSet<>();
		
		for(char ch='a'; ch<='z'; ch++) {
			set.add(ch);
		}
		
		
		// ���� for��
		int count = 1;
		
		for(Character ch : set) { // set���� ���ʴ�� ���� ��ü�� ���������� ch�� �ְڴ�
			
			if(count % 2==0) {
				System.out.println(ch + ", ");
			}else {
				System.out.println("���ĺ� ¦����°�� �ƴմϴ�");
			}
			count++;
		}
		
		// for�� continue����ϴ� ����� �غ���
		
		
		
		// iterator ���
		Iterator<Character> iterator = set.iterator();
		Character nthIterator;
		
		
	}

}
