package etc;

import chapter12.Object1;
// �ٸ���Ű������ �ڽ�Ŭ���� Object2�� �θ�Ŭ����Object1���� �ڵ� �������� -> ��밡��
public class Object2 extends Object1{

	public void func() {
		
		num = 10;
		
		func();
	}
	
}
