package com.songjy.designPattern.decorator;

public class ManagerB extends Manage {

	public ManagerB(Project project) {
		super(project);
	}

	@Override
	public void doBeforWork() {
		System.out.println("项目经理B的准备工作");
	}

	@Override
	public void doAfterWork() {
		System.out.println("项目经理B的收尾工作");
	}
	
	

}
