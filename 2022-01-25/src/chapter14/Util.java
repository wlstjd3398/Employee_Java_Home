package chapter14;

public class Util {

	public static int findChar(String target, char findData) throws NullPointerException{
		// findChar �޼��尡 �����ϴٰ� NullPointerException�� �߻��ϸ� findChar�� �����ְڴ�
		
		// ���ڿ��� �����ϳ��� ã�����ϴ� �����ϳ��� ���ؼ� ������ ����ε�������, ������ ã�� ���߽��ϴ�. ���
		try {
			for(int i=0; i<target.length(); i++) {
				char nthChar = target.charAt(i);
				
				if(nthChar == findData) {
					return i;
				}
				
			}
		}catch(NullPointerException e) {
			System.out.println("target �Ű������� Null �� �� �����ϴ�.");
		}
		return -1; // ���ڿ� �ȿ� ���ڰ� ���ٸ� -1 ��ȯ �� Ex5 index�� ��
	
	}
	
}
