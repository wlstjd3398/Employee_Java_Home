package chapter17;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> intList = new ArrayList<Integer>();
		// 인스턴스의 제네릭스 를 생략가능 -> 객체의 제네릭스를 따라감(아래와 같이)
		// ArrayList<Integer> intList = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			intList.add(i);
		}
		System.out.println("intList = " + intList);
	}

}
