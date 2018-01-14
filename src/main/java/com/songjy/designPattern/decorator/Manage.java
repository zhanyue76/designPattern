package com.songjy.designPattern.decorator;
/**
 * 装饰角色（Manager）：持有一个构件对象的实例，并定义一个与抽象构件接口一致的接口
 * @author Administrator
 *
 */
public class Manage implements Project {

	private Project project;
	
	public Manage(Project project){
		this.project = project;
	}
	@Override
	public void doCode() {
		this.startNewWork();
	}
	
	public void startNewWork(){
		doBeforWork();
		project.doCode();
		doAfterWork();
	}
	/** 
    * 项目经理自己的事情：做早期工作 
    */ 
	public void doBeforWork(){
		System.out.println("初始工作");
	}
	
	/** 
    * 项目经理自己的事情：做收尾工作
    */ 
	public void doAfterWork(){
		System.out.println("收尾工作");
	}
}
