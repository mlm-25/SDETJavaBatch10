package com.syntax.reviewclass06;

public class Phone {

	String maker;
	String model;
	int RAM;
	int ROM;
	int camera;
	boolean is5G;
	double screenSize;

	void makeCall() {
		System.out.println(maker + " " + model + " can make calls");
	}

	void takePictures() {
		System.out.println(maker + " " + model + " can take pictures");
	}
	
	
	
}
