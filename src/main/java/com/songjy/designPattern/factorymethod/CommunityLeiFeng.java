package com.songjy.designPattern.factorymethod;

public class CommunityLeiFeng extends LeiFeng {

	@Override
	public void sweep() {
		System.out.println("社区雷锋扫地");
	}

	@Override
	public void wash() {
		System.out.println("社区雷锋洗衣服");
	}

}
