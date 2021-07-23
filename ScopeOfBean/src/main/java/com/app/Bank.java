package com.app;

public class Bank {
	
	private String bname;
	private int code;
	public Bank() {
		super();
		System.out.println("\nConstructor invoked");
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}

}
