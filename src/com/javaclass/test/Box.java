package com.javaclass.test;

public class Box extends Rectangle{
	int height=30;
	
	void calculateVolume() {
		int volume = length*width*height;
		System.out.println("Volume of Box is "+volume);
	}
	void calculateVolume(int height1) {
		int volume = length*width*height1;
		System.out.println("Volume of Box is "+volume);
	}
	void calculateArea() {
		System.out.println("Calculate Area of Box "+2*(length*width+length*height+width*height));
	}

}
