package chapter01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		Greeter g = ctx.getBean("greeter", Greeter.class);
		String msg = g.greeter("스프링");
		
		System.out.println(msg);
		
		ctx.close();
		
		
	}
	
}
