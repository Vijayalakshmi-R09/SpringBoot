package com.app;

public class Age {
	private int age;
	public DateOfJoin doj;
	
	public Age(DateOfJoin doj) {
		super();
		this.doj = doj;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Age: " + age ;
	}
	public DateOfJoin getDoj() {
		return doj;
	}

	public void setDoj(DateOfJoin doj) {
		this.doj = doj;
	}

	
	
}
