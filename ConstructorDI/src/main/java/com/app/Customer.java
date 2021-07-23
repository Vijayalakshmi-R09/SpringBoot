package com.app;

public class Customer {
	
	private Display display;
    private String custName;
    private int age;
	
	public Customer(String custName,int age,Display display) {
		super();
		this.custName=custName;
		this.age=age;
		this.display = display;
	}
	
	public int getAge() {
		return age;
	}

	public String getCustName() {
		return custName;
	}
	public Display getDisplay() {
		return display;
	}
	
}
