package com.songjy.designPattern.simplefactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		Factory factory = new Factory();
		try {
			IFruit fruit = factory.getFruit(FruitType.BANANA);
			System.out.println(fruit.getName());
			fruit = factory.getFruit(FruitType.APPLE);
			System.out.println(fruit.getName());
			fruit = factory.getFruit(FruitType.PEAR);
			System.out.println(fruit.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
