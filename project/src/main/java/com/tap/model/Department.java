package com.tap.model;

public class Department {
	
	int depId;
	String depName;
	
	public Department(int depId, String depName) {
		super();
		this.depId = depId;
		this.depName = depName;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	
	

}
