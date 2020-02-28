package com.app.collection;

public class StudentBean {
	
	   private int sNo;
	   private String sName;
	   private String Course;
	   private double fee;
	   
	   
	public StudentBean() {
		super();
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "StudentBean [sNo=" + sNo + ", sName=" + sName + ", Course=" + Course + ", fee=" + fee + "]";
	}
	   
}
