package chapter02;

public class Sol21 {
	public static void main(String[] args) {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		double var1 = (double) intValue; 
//		업캐스팅 정수 -> 실수
		byte var2 = (byte) intValue; 
//		바이트가 작은것이니 다운캐스팅 정수 -> 정수?
		int var3 = (int) doubleValue; 
//		다운캐스팅 실수 ->정수
		char var4 = (char) strValue; 
//		다운캐스팅 문자열 -> 문자 

//		문자열을 문자로 다운캐스팅 불가능?
	}
}
