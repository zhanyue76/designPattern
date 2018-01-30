package com.songjy.written;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * 比较Vector和ArrayList的区别
 * @author 宋俊月
 * Vector与ArrayList
 * 1、Vector    线程安全，空间不够扩容空间翻一倍
 * 2、ArrayList线程不安全，空间不够扩容一半
 * 
 * 
 * 扩展知识：
 * Iterator（迭代器）和Enumeration（枚举）区别
 * Iterator可以删除元素（remove方法），Enumeration不能删除
 * Iterator "fail-fast"的——如果它在遍历过程中，底下的容器发生了结构变化,会抛出ConcurrentModificationException
 * 
 *
 */
public class DiffVectorAndArrayList {

	public static void main(String[] args) {

		Vector vector = new Vector();
		ArrayList list = new ArrayList();
		vector.add(new Integer(1));
		vector.add(new Integer(2));
		vector.add(new Integer(3));
		vector.add(new Integer(4));
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		
		Iterator ite = list.iterator();
		
		while(ite.hasNext()){
			System.out.println(ite.next());
			ite.remove();;
			//list.add(new Integer(5));
			//list.remove(2);
		}
		System.out.println("枚举.");
		//枚举
		Enumeration enumeration= vector.elements();
		while(enumeration.hasMoreElements()){
			System.out.println(enumeration.nextElement());
			vector.remove(2);
		}
	}

}
