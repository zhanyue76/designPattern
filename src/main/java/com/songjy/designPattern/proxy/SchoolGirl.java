package com.songjy.designPattern.proxy;

public class SchoolGirl {
	
	public SchoolGirl(String name){
		this.name = name;
	}
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
