package com.songjy.designPattern.simplefactory;

public class Apple implements IFruit {

	private String name;
	@Override
	public void color() {
		System.out.println("apple 绿色");
	}

	@Override
	public String getName() {
		this.name="apple";
		return this.name;
	}
	
	
	

}
