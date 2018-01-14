package com.songjy.designPattern.proxy;

public class Pursuit implements GiveGift {

	private SchoolGirl schoolGirl;
	
	public Pursuit(SchoolGirl schoolGirl){
		this.schoolGirl = schoolGirl;
	}
	@Override
	public void giveDolls() {
		System.out.println("送"+schoolGirl.getName()+"洋娃娃");
	}

	@Override
	public void giveFollows() {
		System.out.println("送"+schoolGirl.getName()+"鲜花");
	}

	@Override
	public void giveChollocate() {
		System.out.println("送"+schoolGirl.getName()+"巧克力");
	}

}
