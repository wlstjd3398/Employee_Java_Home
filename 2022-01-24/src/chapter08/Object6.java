package chapter08;

import java.util.Arrays;

public class Object6 {
	
	void func(int num) {
		num = num + 1;
		System.out.println("num = " + num);
	}
	
	// func2�޼����� �Ű������� ������ Ÿ����? obj.func2(numArr)�� Ÿ���� int
	void func2(int[] param) {
		param[0] = param[0] + 1;
		System.out.println(Arrays.toString(param));
	}
	// �ٱ����� ������ ��ħ(���� ������Ÿ���� ������ �޸��ּҰ� ����Ǿ� ���޵Ǳ⶧��
	
	// func3�޼����� �Ű������� ������Ÿ����? Object7�� �Ű����� Ÿ��
	void func3(Object7 param) {
		param.value = param.value + 1;
		System.out.println("param.value = " + param.value);
	}
	
	// func3 ���õ� ���ۿ��� �ľ��ؿ���!!(Ex7, Object6, Object7)
	
	
	
	
}
