package com.tap.model;

public class EnterMarks {
	int subId;
	String sub ;
	double marks;
	
	public EnterMarks(int subId, String sub) {
		super();
		this.sub = sub;
		this.subId = subId;
		
	}
	
	public EnterMarks(String sub, double marks) {
		super();
		this.sub = sub;
		this.marks = marks;
	}
	
	public EnterMarks(int subId, String sub, double marks) {
		super();
		this.sub = sub;
		this.marks = marks;
		this.subId = subId;
	}
	
	public EnterMarks() {
		
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}
	
	
	
}
