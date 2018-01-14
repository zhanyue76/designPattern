package com.songjy.designPattern.decorator;

public class TestDecorator {

	public static void main(String[] args) {

		Employe employe = new Employe();
		ManagerA managerA = new ManagerA(employe);
		managerA.startNewWork();
		
		ManagerB managerB = new ManagerB(employe);
		managerB.startNewWork();
	}

}
