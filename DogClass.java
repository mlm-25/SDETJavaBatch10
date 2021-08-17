package com.syntax.class12;

public class DogClass {
	
	String name;
	String breed;
	String color;
	int age;
	char gender;
	
	void rollOver() {
		System.out.println(name+" the "+breed+" can roll over");
	}
	
	void sleep() {
		System.out.println(name+" the "+breed+" can sleep");
	}
	
	void sit() {
		System.out.println(name+" the "+breed+" can sit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DogClass dog1 = new DogClass();
		dog1.breed="Husky";
		dog1.color="White";
		dog1.name="Apalo";
		dog1.age=2;
		dog1.gender='M';
		dog1.sit();
		
		DogClass dog2 = new DogClass();
		dog2.breed="Bulldog";
		dog2.color="Gary";
		dog2.name="Chuey";
		dog2.age=8;
		dog2.gender='M';
		dog2.sleep();
		
		DogClass dog3 = new DogClass();
		dog3.breed="Labrador";
		dog3.color="Brown";
		dog3.name="Daisy";
		dog3.age=4;
		dog3.gender='F';
		dog3.rollOver();
		
		
		
		
		

	}

}
