package chapter06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chapter06.config.AppContext;

public class Ex03 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		Calculator cal = ctx.getBean("calculator", Calculator.class);
		cal.factorial(1000);
		
		ctx.close();
		
	}

}
