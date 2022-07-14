package vo;

import java.time.LocalDateTime;

public class ClassesInfo {
	private int idx;
	private int memberIdx;
	private String id;
	private int classCount;
	private String classSort;
	private String className;
	private LocalDateTime classTime;
	private String grade;
	private int cost;
	private String status;
	private LocalDateTime insertDate;
	
	
	public ClassesInfo() {
		
	}
	
	public ClassesInfo(int idx, int memberIdx, String id, int classCount, String classSort, String className, LocalDateTime classTime, String grade, int cost, String status, LocalDateTime insertDate) {
		this.idx = idx;
		this.memberIdx = memberIdx;
		this.id = id;
		this.classCount = classCount;
		this.classSort = classSort;
		this.className = className;
		this.classTime = classTime;
		this.grade = grade;
		this.cost = cost;
		this.status = status;
		this.insertDate = insertDate;
	}
	
	
	public int getClassCount() {
		return classCount;
	}

	public void setClassCount(int classCount) {
		this.classCount = classCount;
	}

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getMemberIdx() {
		return memberIdx;
	}
	public void setMemberIdx(int memberIdx) {
		this.memberIdx = memberIdx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassSort() {
		return classSort;
	}
	public void setClassSort(String classSort) {
		this.classSort = classSort;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public LocalDateTime getClassTime() {
		return classTime;
	}
	public void setClassTime(LocalDateTime classTime) {
		this.classTime = classTime;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(LocalDateTime insertDate) {
		this.insertDate = insertDate;
	}
	
	
	
	
}
