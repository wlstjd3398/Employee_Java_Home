package chapter08;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 스프링 MVC가 요청을 처리할 컨트롤러로 사용
@Controller
public class HelloController {

	// http://서버IP:포트번호/프로젝트path/hello로 들어온 GET 방식 요청을 처리하겠다. 라는 애노테이션
	// 프로젝트path까지는 생략(servlet했던것처럼)
	@GetMapping("/hello")
	public String hello(Model model, 
			@RequestParam(value = "name", required=false) String name) {
//		System.out.println("Hello Controller 의 hello() 메서드 호출");
		
		model.addAttribute("greeting", name + " 님 안녕하세요~!");
		
		return "hello";
	}
	
}
