package chapter06;

//팩토리얼을 계산해주는 클래스(프록시 디자인 패턴이 적용된 클래스)
//엄밀히 말하면 프록시 디자인 패턴보다 데코레이터 디자인 패턴이 적용된 클래스
//디자인 패턴을 많이 알고있는게 중요함 -> 자주 사용하는 코드들을 패턴화 시켜놓은 것
//
//직접 팩토리얼을 계산하는 클래스가 아님
//팩토리얼 수행시간 측정이 주요기능이고
//팩토리얼 계산은 부가적인 기능인 클래스
//
//주요 기능은 이 클래스에서 수행하고
//부가적인 기능은 그러한 기능을 수행하는 객체를 활용하는 클래스

public class ExecTimeCalculator implements Calculator{

	private Calculator delegate;
	// delegate 위임하다
	
	public ExecTimeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public long factorial(long num) {
		long start = System.currentTimeMillis();
		
		long result = delegate.factorial(num);
		
		long end = System.currentTimeMillis();
		long duration = end - start;
		
		System.out.println("실행 시간 = "+ duration);
		
		return 0;
		
	}

	
	
}
