package com.app;

public class Department 
{
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "\nDepartment: " + dept ;
	}
	
}
