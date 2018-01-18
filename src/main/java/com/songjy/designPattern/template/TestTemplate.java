package com.songjy.designPattern.template;

public class TestTemplate {

	public static void main(String[] args) {

		AbstractImageLoader imageLoader = new WebpImageLoader();
		imageLoader.downImage("url", 0, 0);
		
		imageLoader = new JpegImageLoader();
		imageLoader.downImage("url", 0, 0);
	}

}
