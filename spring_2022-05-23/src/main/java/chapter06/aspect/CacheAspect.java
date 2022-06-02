package chapter06.aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class CacheAspect {

	private Map<Long, Object> cache = new HashMap<>();
	
	@Pointcut("execution(public * chapter06.*.*(..))")
	public void cacheTarget() {
		
	}
	
// 또한 여러 Aspect에서 같은 pointcut을 사용한다면
//
//	pointcut을 재사용할 수 있음
//	
//	ㅡㅡ
//	
//	@Pointcut 애노테이션이 달린 메서드가 private 이라면
//	
//	이 pointcut은 이 클래스 안에서만 사용할 수 있는...
//	
//	재사용할 수 없는 pointcut임
	
	// @Around("execution(public * chapter06.*.*(long))")
	// 위에 pointcut을 삭제하고 아래 around에 execution 명시자를 직접 지정가능
	
	@Around("cacheTarget()")
	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable{
		Long num = (Long) joinPoint.getArgs()[0];
		
		// 키가 존재하는지?
		// 앞에서 동작했으니 빨리 호출할수 있게 함
		if(cache.containsKey(num)) {
			long result = (long) cache.get(num);
			
			System.out.println("CacheAspect: Cache에서 " + num + "key의 값 " + result + " 찾음");
			return result;
		}
		
		// 핵심기능의 팩토리얼 동작
		Object result = joinPoint.proceed();
		
		cache.put(num, result);
		
		System.out.println("CacheAspect: Cache에 key = " + num + ", value = " + result + " 추가");
		
		// 핵심 기능이 동작한 것을 리턴
		return result;
	}
	
}
