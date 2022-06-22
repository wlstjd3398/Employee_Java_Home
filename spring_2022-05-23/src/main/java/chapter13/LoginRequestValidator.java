package chapter13;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class LoginRequestValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return LoginRequestValidator.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "required");
		ValidationUtils.rejectIfEmpty(errors, "password", "required");
		
	}

	
	
}
