package com.tap.model;

public class Students {

	private int studentId;
	private String studentName;
	private String rollNo;
	private String studentPass;
	private String dob;
	private String contactno;
	private int depId;
	
	public Students(int studentId, String studentName, String rollNo, String studentPass, String dob,
			String contactno) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.studentPass = studentPass;
		this.dob = dob;
		this.contactno = contactno;
	}
	
	public Students(String studentName, String rollNo, String studentPass, String dob, String contactno) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.studentPass = studentPass;
		this.dob = dob;
		this.contactno = contactno;
	}
	
	public Students(String studentName, String rollNo, String studentPass, String dob, String contactno, String depId) {
		super();
		String[] arr= {"null", "computer-science", "electrical-engineering", "mechanical-engineering", "civil-engineering"}; 
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.studentPass = studentPass;
		this.dob = dob;
		this.contactno = contactno;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i].equals(depId)) {
				this.depId = i;
			}
		}
		
	}
	
	public Students() {
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentPass() {
		return studentPass;
	}

	public void setStudentPass(String studentPass) {
		this.studentPass = studentPass;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}
	
	
}
