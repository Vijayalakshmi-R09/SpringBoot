package com.spring;

public class User {

	private int id;
	private String name;

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	private Mobile mobile;
	
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User Id: " + id + "\nName: " + name ;
	}
	

	
}