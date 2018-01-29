package com.songjy.designPattern.builder;

import com.songjy.designPattern.builder.User.UserBuilder;

public class TestBuilder {

	public static void main(String[] args) {

		UserBuilder builer = new User.UserBuilder("zhang","san");
		builer.age(18);
		User user = builer.getUser();
		
		System.out.println(user.toString());
	}

}
