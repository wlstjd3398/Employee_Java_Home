package chapter07;

public class Sol16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu menu1 = new Menu();
		menu1.name = "¥���"; menu1.price = 4900;
		
		Menu menu2 = new Menu();
		menu2.name = "«��"; menu2.price = 5900;
		
		Menu menu3 = new Menu();
		menu3.name = "������"; menu3.price = 13900;
		
		Menu[] menuList = {menu1, menu2, menu3};
		
		Bill bill = new Bill();
		bill.orderNumber = 1;
		bill.menuList = menuList;
		
		// �� �� �Ʒ��� �ڵ尡 �̾����ϴ� ���
		
		int total = 0;
		System.out.println("�ֹ��� �޴�");
		for(int i=0; i<bill.menuList.length; i++) {
			Menu menu = bill.menuList[i];
			
			System.out.println(menu.name + "(" + menu.price + "��)");
			
			total += menu.price;
		}
		System.out.println("===== ===== =====");
		
		System.out.println("���� �ݾ� : " + total + "��");

		
	}

}
