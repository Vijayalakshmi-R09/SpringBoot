package com.app;

import java.util.Date;

public class DateOfJoin {
	
	private String dt;
	
	public DateOfJoin(String dt) {
		super();
		this.dt=dt;
	}

	public String getDt() {
		return dt;
	}

	@Override
	public String toString() {
		return "DateOfJoin: " + dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}
}
