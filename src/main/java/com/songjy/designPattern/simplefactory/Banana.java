package com.songjy.designPattern.simplefactory;

public class Banana implements IFruit {

	@Override
	public void color() {
		System.out.println("banana is yellow");
	}

	@Override
	public String getName() {
		return "banana";
	}

}
