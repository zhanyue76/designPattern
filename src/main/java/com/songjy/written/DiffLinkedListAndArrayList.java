package com.songjy.written;

import java.util.LinkedList;

/**
 * 
 * @author lenovo
 * ArrayList，LinkedList说明
 * 两者都是线程不安全的。 
 * ArrayList查询效率高，修改效率低，适合查询比较频繁，增删次数较少的集合管理
 * LinkedList查询效率低，修改效率高，适用于增删动作的比较频繁，查询次数较少的元素管理集合。
 * 
 * 扩展：LinkedList（实现堆栈的好方法） 
 *
 */
public class DiffLinkedListAndArrayList {

	public static void main(String[] args) {
		MyStack mystatck = new MyStack();
		mystatck.push("1");
		mystatck.push("2");
		mystatck.push("3");
		mystatck.push("4");
		
		while(!mystatck.isEmpty()){
			System.out.println(mystatck.pop());
		}
		System.out.println(mystatck.isEmpty());
	}
	
	
	public static class MyStack{
		private LinkedList linkedList = new LinkedList();
		//先进后出
		public void push(Object ob){
			linkedList.addFirst(ob);
		}
		
		public Object peek(){
			if(linkedList.isEmpty()){
				 System.out.println("栈为空");  
		         return null;  
			}else
				return linkedList.getFirst();
		}
		//出栈
		public Object pop(){
			if(this.linkedList.isEmpty()){
				 System.out.println("栈为空");  
		         return null;  
			}else{
				return linkedList.removeFirst();
			}
		}
		
		public boolean isEmpty(){
			return this.linkedList.isEmpty();
		}
		
	}

}
