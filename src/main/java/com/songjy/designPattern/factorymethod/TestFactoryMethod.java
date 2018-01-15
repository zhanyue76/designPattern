package com.songjy.designPattern.factorymethod;

public class TestFactoryMethod {

	public static void main(String[] args) {
		LeiFeng leifeng = new StudentFactory().createLeiFeng();
		leifeng.sweep();
		leifeng.wash();
		
		leifeng = new CommunityFactory().createLeiFeng();
		leifeng.sweep();
		leifeng.wash();
	}

}
