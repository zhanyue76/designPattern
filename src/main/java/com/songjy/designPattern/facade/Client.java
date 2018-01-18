package com.songjy.designPattern.facade;

public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.MethodA();
		facade.MethodB();
	}

}
