package chapter19;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����Ʈ ��� ����� ��Ʈ��
		// ���� ����ƮŸ�� �迭 ����
//		���������Ͱ� { �տ� ����
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		// ����Ʈ�迭�� ����� inputstream
		// Ex1.java ������ �����ü��ִ� inSrc�� �����ؼ� ������ �����´�
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		
		// ����Ʈ�迭�� ����� outputstream
		// Ex1.java ������ �������� outSrc�� �����ؼ� ������ ��������
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		// ();�� �޸��� �����ǰ����� �����
		
//		// 1��° �����͸� ������
//		int data = input.read();
//		System.out.println("data = " + data);
//		// 2��° �����͸� ������
//		data = input.read();
//		System.out.println("data = " + data);
// 10��°���� �̷����ϸ� ���ŷο� 
//		// for������ 10��°���� �������¹�
//		for(int i=1; i<=10; i++) {
//			int data = input.read();
//			System.out.println("data = " + data);
//		}
//		// 7��°���� �����Ͱ� ���� ��� �� ���� �����ʹ� -1�� ������
//		// Returns:the next byte of data, or
//		// -1 if the end of the stream has been reached
		
		
		// while������ �������¹�(4byte�� �����͸� �о�ü�����)
		// ���� ���� ���ڴٰ� �ƴ� ������� ����
		while(true) {
			int data = input.read();
//			���� �����Ͱ� ���ڸ� �ڷΰ��� 0�� ������ ��Ʈ���� ���� ������
			if(data == -1) {
				break; // ���� �����ϸ� ����������
			}
			
//			System.out.println("data = " + data);
			output.write(data); // �Է��� �����͸� ���
		}
		
		outSrc = output.toByteArray();
		// output�� ����� ������ ByteArrayȭ ��Ų��
//		Arrays.toString(null);
		// �迭�� ���ڿ�ȭ��Ų��
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
		// input output�� �츮�� ����� ����Ѱ����� �ݾ������ (��Ʈ���� ����ϰ� �ݾƾ���)
		// ��Ʈ���� ����ϰ��ִ����̶� ��ǻ�Ͱ� ������
		// -> IOException �����༭ �����Ͽ���
		
		// ���ε��� �ݾ������
		try {
			input.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		try {
			output.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

}
