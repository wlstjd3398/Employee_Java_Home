package vo;

public class NoticeInfo {
	private int idx;
	private String title;
	private String content;
	
	public NoticeInfo(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public NoticeInfo(int idx, String title, String content) {
		this.idx = idx;
		this.title = title;
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	
	
	
}
