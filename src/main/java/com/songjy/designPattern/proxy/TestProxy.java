package com.songjy.designPattern.proxy;

import java.io.IOException;

public class TestProxy {

	public static void main(String[] args) throws IOException {
		SchoolGirl sgirl = new SchoolGirl("小花");
		Proxy proxy = new Proxy(sgirl);
		proxy.giveChollocate();
		proxy.giveDolls();
		proxy.giveFollows();
		
	}

}
