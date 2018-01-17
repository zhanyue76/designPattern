package com.songjy.designPattern.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume r1 = new Resume("小明");
		r1.setWorkExperience("alibaba", "2000-2002");
		
		Resume r2 = (Resume)r1.deepClone();
		r2.setName("老四");
		r2.setWorkExperience("baidu", "2012-2014");
		
		/*Resume r3 = (Resume) r1.shallowClone();
		r3.setName("王五");
		r3.setWorkExperience("tencent", "2015-now");*/
		
		Resume r4 = (Resume)r1.deepClone2();
		r4.setName("小雷");
		r4.setWorkExperience("xiaomi", "2011-2013");
		
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		//System.out.println(r3.toString());
		System.out.println(r4.toString());
	}

}
