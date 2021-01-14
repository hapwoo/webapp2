package com.mycompany.webapp.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Ch03Dto {
	private String param1;
	private int param2;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date param3;
	
	
	public String getParam1() {
		return param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	public int getParam2() {
		return param2;
	}
	public void setParam2(int param2) {
		this.param2 = param2;
	}
	public Date getParam3() {
		return param3;
	}
	public void setParam3(Date param3) {
		this.param3 = param3;
	}

}
