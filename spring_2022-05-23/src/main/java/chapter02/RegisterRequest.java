package chapter02;

public class RegisterRequest {

	// 회원 가입을 처리할때 필요한 이메일, 암호, 이름 데이터을 담고 있는 클래스
	private String email;
	private String password;
	private String confirmPassword;
	private String name;
	
	public boolean isPasswordEqualToConfirmPassword() {
		return password.equals(confirmPassword);
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
