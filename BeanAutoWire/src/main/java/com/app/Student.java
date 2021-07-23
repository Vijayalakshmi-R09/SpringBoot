package com.app;

public class Student 
{
	private int studid;
	private String studName;
	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	
	@Override
	public String toString() {
		return "StudentId: " + studid + "\nStudentName: " + studName ;
	}
}
