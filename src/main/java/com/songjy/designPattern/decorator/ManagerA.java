package com.songjy.designPattern.decorator;
/**
 * 项目经理A:
 * @author Administrator
 * 具体装饰角色（ManagerA、ManagerB）：负责给构件对象“贴上”附加的责任
 */
public class ManagerA extends Manage {

	public ManagerA(Project project) {
		super(project);
	}
	//项目经理A的准备工作
	 public void doBeforWork() {
		 System.out.println("项目经理A的准备工作");
	 }
}
