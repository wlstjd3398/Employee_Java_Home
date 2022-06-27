package chapter15;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import spring.WrongIdPasswordException;

public class Member {

	private long id;
	private String email;
	@JsonIgnore
	private String password;
	private String name;
//	@JsonFormat(shape=Shape.STRING)
//	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime registerDateTime;
	
	public Member(String email, String password, String name, LocalDateTime registerDateTime) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = registerDateTime;
		
	}
	
	public void changePassword(String oldPw, String newPw) throws WrongIdPasswordException{
		if(!password.equals(oldPw)) {
			throw new WrongIdPasswordException();
			
		}
		
		password = newPw;
		
	}
	
	public boolean matchPassword(String password) {
		return this.password.equals(password);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}
	public void setRegisterDateTime(LocalDateTime registerDateTime) {
		this.registerDateTime = registerDateTime;
	}
	
	
	
}
