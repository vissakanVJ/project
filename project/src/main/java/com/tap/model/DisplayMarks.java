package com.tap.model;

public class DisplayMarks {
	
	String subName;
	int sem;
	double marks;
	
	public DisplayMarks(String subName, int sem, double marks) {
		super();
		this.subName = subName;
		this.sem = sem;
		this.marks = marks;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	

}
