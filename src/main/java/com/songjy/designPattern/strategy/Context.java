package com.songjy.designPattern.strategy;
/**
 * 策略设计模式：环境(Context)角色
 * @author lenovo
 *
 */
public class Context {
	public Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void strategyInterface(){
		this.strategy.strategyInterface();
	}
}
