package com.songjy.designPattern.template;

public abstract class AbstractImageLoader {

	//不同子类根据自身特性实现具体的步骤
	protected abstract String getUrl(String imageUrl,int width,int height);
	
	//抽象类定义整个流程骨架
	public final void downImage(String imageUrl,int width,int height){
		//获取url
		imageUrl = getUrl(imageUrl, width, height);
		System.out.println(imageUrl);
		//然后开始执行下载
		
	}
	
}
