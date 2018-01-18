package com.songjy.designPattern.facade;
/*
 * 外观设计模式
 */
public class Facade {
	
	private SubSystemOne systemOne;
	private SubSystemTwo systemTwo;
    
	public Facade(){
		 systemOne = new SubSystemOne();
         systemTwo = new SubSystemTwo();
	}
    public void MethodA()
    {
        System.out.println("\n方法组A（）---");
        systemOne.MethodOne();
    }

    public void MethodB()
    {
    	System.out.println("\n方法组B（）---");
        systemTwo.MethodTwo();
    }
}
