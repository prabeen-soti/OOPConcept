package com.javaclass.test;

public class OOPConcept {

	public static void main(String[] args) {
		Box box = new Box();
		box.height = 5;
		box.calculateVolume();
		box.calculateVolume(10);
		box.calculateArea();
		System.out.println(box.length);
	}

}
