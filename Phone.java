package com.syntax.class12;

public class Phone {
	
	String brand;
	String model;
	String color;
	boolean touchScreen;
	double screenSize;
	int gigSpace;
	
	void canTakePictures() {
		System.out.println(brand+" "+model+" can take pictures");
	}
	
	void canNotTakePictures() {
		System.out.println(brand+" "+model+" can't take pictures");
	}
	
	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		phone1.brand="iPhone";
		phone1.model="12 max pro";
		phone1.color="Pacific Blue";
		phone1.touchScreen=true;
		phone1.screenSize=6.68;
		phone1.gigSpace=256;
		phone1.canTakePictures();
		
		Phone phone2 = new Phone();
		phone2.brand="Android";
		phone2.model="Samsung Galaxy S21 Ultra";
		phone2.color="Phantom Black";
		phone2.touchScreen=true;
		phone2.screenSize=6.8;
		phone2.gigSpace=256;
		phone2.canTakePictures();
		
		Phone phone3 = new Phone();
		phone3.brand="Nokia";
		phone3.model="8";
		phone3.color="Polished Copper";
		phone3.touchScreen=true;
		phone3.screenSize=5.3;
		phone3.gigSpace=64;
		phone3.canTakePictures();
		
		
		
		
	}
	

}
