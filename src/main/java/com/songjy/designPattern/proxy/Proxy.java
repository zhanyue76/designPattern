package com.songjy.designPattern.proxy;

public class Proxy implements GiveGift {
	private Pursuit pursult;
	public Proxy(SchoolGirl schoolGirl){
		pursult = new Pursuit(schoolGirl);
	}
	@Override
	public void giveDolls() {
		pursult.giveDolls();
	}
	@Override
	public void giveFollows() {
		pursult.giveFollows();
		
	}
	@Override
	public void giveChollocate() {
		pursult.giveChollocate();
		
	}
}
