package com.syntax.reviewclass06;

public class PhoneTester {
	
	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		iphone.camera = 12;
		iphone.maker = "Apple";
		iphone.model = "iPhone 13";
		iphone.is5G = true;
		iphone.screenSize = 5.5;
		iphone.makeCall();
		iphone.takePictures();
	}

}
