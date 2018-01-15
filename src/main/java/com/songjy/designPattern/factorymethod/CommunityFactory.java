package com.songjy.designPattern.factorymethod;
/**
 * 社区雷锋工厂
 * @author lenovo
 *
 */
public class CommunityFactory implements IFactory {

	@Override
	public LeiFeng createLeiFeng() {
		return new CommunityLeiFeng();
	}

}
