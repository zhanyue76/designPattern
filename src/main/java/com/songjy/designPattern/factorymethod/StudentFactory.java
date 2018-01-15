package com.songjy.designPattern.factorymethod;
/**
 * 学雷锋的大学生公出
 * @author lenovo
 *
 */
public class StudentFactory implements IFactory {

	@Override
	public LeiFeng createLeiFeng() {
		return new StudentLeiFeng();
	}

}
