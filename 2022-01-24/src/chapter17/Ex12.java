package chapter17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �系 ���� ���� ���α׷� ����
		Book book1 = new Book("Java Master", 34500);
		Book book2 = new Book("JSP?Servlet �Թ�", 29000);
		
		// set�� �� ����? Ư¡�� �����ؼ� �����ϰ��־���� 
		Set<Book> bookList = new HashSet<>();
		
		bookList.add(book1);
		bookList.add(book2);
		System.out.println(bookList);
		
		Book book3 = new Book("JSP/Servlet �Թ�", 29000);
		// set�� ���� ������ å�� ��µǾ��� 
		// -> equals�� hascode �޼���� �������̵��ؼ� ȣ��
		// add ���۽� equals �� hashcode�� ���� ����
		
		bookList.add(book3);
		System.out.println(bookList);
		
//		�Ȱ��� ������ ���������ʴ´� equals Hashset
		
		System.out.println("***** �系 ���� ��� *****");
		// bookList�� ����ؼ� �系 �������� ������ ����ϼ���
		for(Book book : bookList) {
			System.out.println("������ = " + book.getTitle());
			System.out.println("�������� = " + book.getPrice());
		}
		System.out.println("***** ***** ***** *****");
		
		
		// iterator�� �غ���
		Iterator<Book> iterator = bookList.iterator();
		Book nthBook;
		
		while(iterator.hasNext()) {
			nthBook = iterator.next();
			System.out.println(nthBook);
			
		for() {
			
			
		}
			
		
		}
		
	}

}
