package vo;

import java.time.LocalDateTime;

public class EnrollInfo {
	private int idx;
	private String paymentMethod;
	private int memberIdx;
	private int classesIdx;
	private LocalDateTime enrollDate;
	
	
	public EnrollInfo(){
		
	}
	
	public EnrollInfo(int idx, String paymentMethod, int memberIdx, int classesIdx, LocalDateTime enrollDate) {
		this.idx = idx;
		this.paymentMethod = paymentMethod;
		this.memberIdx = memberIdx;
		this.classesIdx = classesIdx;
		this.enrollDate = enrollDate;
	}
	
	public EnrollInfo(String paymentMethod, int memberIdx, int classesIdx, LocalDateTime enrollDate) {
		this.paymentMethod = paymentMethod;
		this.memberIdx = memberIdx;
		this.classesIdx = classesIdx;
		this.enrollDate = enrollDate;
	}
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public int getMemberIdx() {
		return memberIdx;
	}
	public void setMemberIdx(int memberIdx) {
		this.memberIdx = memberIdx;
	}
	public int getClassesIdx() {
		return classesIdx;
	}
	public void setClassesIdx(int classesIdx) {
		this.classesIdx = classesIdx;
	}
	public LocalDateTime getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(LocalDateTime enrollDate) {
		this.enrollDate = enrollDate;
	}

	
	
	
	
}
