package com.songjy.designPattern.decorator;
/**
 * 具体构件角色:代码工人
 * @author Administrator
 *
 */
public class Employe implements Project {

	@Override
	public void doCode() {
		System.out.println("编代码......完成了");
	}

}
