package chapter10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

	// 빈으로 등록해줘야 동작함
	@Bean
	public RegistController registController() {
		return new RegistController();
	}
	
}
