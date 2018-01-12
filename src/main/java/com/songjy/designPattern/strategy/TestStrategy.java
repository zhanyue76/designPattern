package com.songjy.designPattern.strategy;

public class TestStrategy {

	public static void main(String[] args) {

		Strategy stragety = new ContreteStrategyA();
		Context context = new Context(stragety);
		context.strategyInterface();
		
		context = new Context(new ContreteStrategyB());
		context.strategyInterface();
	}

}
