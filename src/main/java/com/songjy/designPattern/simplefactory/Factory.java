package com.songjy.designPattern.simplefactory;
/**
 * 简单工厂模式工厂类
 * @author lenovo
 *
 */
public class Factory {

	//实际水果引用
	private IFruit fruit;

	public IFruit getFruit(FruitType fruitType) throws Exception {

		switch (fruitType) {
		case APPLE:
			fruit = new Apple();
			break;
		case BANANA:
			fruit = new Banana();
			break;
		default:
			throw new Exception("没有该水果");

		}
		;
		return fruit;
	}
}
