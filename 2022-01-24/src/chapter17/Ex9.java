package chapter17;

import java.util.ArrayList;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1 = new Customer("홍길동", "010-1234-5678", 1);
		Customer c2 = new Customer("홍길동", "010-1234-5678", 3);
		Customer c3 = new Customer("고영희", "010-1111-2222", 2);
		
		System.out.println("c1와 c2가 같나요? " + c1.equals(c2));
		
		
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(c1);
		list.add(c3);
		
		
		System.out.println(list.contains(c2)); // 홍길동의 정보가 이 리스트에 들어있나요?
		// contains에 for반복문이 들어있음(ppt확인)
		
	}

}
