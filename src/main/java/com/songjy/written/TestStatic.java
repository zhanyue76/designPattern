package com.songjy.written;

import java.util.ArrayList;
import java.util.Random;

public class TestStatic {

	private static ArrayList list;
	
	public void add(){
		if(list==null)
			list = new ArrayList();
		Random random = new Random();
		list.add(random.nextInt(20));
	}
	
	public Integer get(){
		return (Integer) (list.get(0)==null?-1:list.get(0));
	}
	
	public static void main(String[] args) {
		TestStatic t1 = new TestStatic();
		TestStatic t2 = new TestStatic();
		
		t1.add();
		
		System.out.println(t2.get());
		
		System.out.println(t2.list == t1.list);
		
		
	}

}
