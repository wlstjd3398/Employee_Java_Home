package chapter08;

public class Ex5 {

		void method1() {
			System.out.println("�ν��Ͻ� �޼���");
		}
		
		static void method2() {
			System.out.println("Ŭ���� �޼���");
		}
	
		public static void main(String[] args) {
			Ex5 ex = new Ex5();
			ex.method1();// �ν��Ͻ� �޼���
			ex.method2();// Ŭ���� �޼���
		}

}
