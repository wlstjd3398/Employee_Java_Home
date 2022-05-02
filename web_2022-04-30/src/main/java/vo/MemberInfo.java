package vo;

public class MemberInfo {
	private String name;
	private String id;
	private String pw;
	
	public MemberInfo(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public MemberInfo(String id, String pw, String name) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	
	
	
}
