package com.syntax.reviewclass06;

public class Dog {
	
	String name;
	String breed;
	String color;
	int age;
	char gender;
	double heigth;
	int weight;
	
	void bark() {
		System.out.println("Dog can bark");
	}
	
	void sleep() {
		System.out.println("Dog can sleep");
	}
	
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.name="Jerry";
		dog1.color="Brown";
		dog1.breed="Lab";
		dog1.age=21;
		dog1.heigth=20;
		dog1.gender='M';
		dog1.weight=43;
		dog1.bark();
		dog1.sleep();
		
		Dog dog2 = new Dog();
		dog2.name="Tommy";
		dog2.color="Black";
		dog2.breed="Lab";
		dog2.age=19;
		dog2.heigth=19;
		dog2.weight=39;
		dog2.gender='M';
		dog2.sleep();
		
		
		
		
	}

}
