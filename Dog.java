package com.company.syntax.class18;

public class Dog {

    String name;
    private double dogHeight;
    int age;
    double height;
    double weight;
    String breed;
    String color;

    static int noOfLegs=4;
    Dog(String dogName, int dogAge, double dogHeight, double dogWeight, String dogBreed, String dogColor){
        name = dogName;
        age=dogAge;
        height = dogHeight;
        weight=dogWeight;
        breed=dogBreed;
        color=dogColor;
    }

    Dog(){
        name="None";
        age=10;
        weight=10;
        height=10;
        breed="None";
        color="None";
    }
    Dog(String dogName){
        // constructor 1
        name=dogName;
        age=10;
        weight=10;
        height=10;
        breed="None";
        color="None";
    }
    Dog(String dogName, int dogAge){
        // constructor 2
        name=dogName;
        age=dogAge;
        weight=10;
        height=10;
        breed="None";
        color="None";
    }
    Dog(String dogName, int dogAge, double dogHeight){
        // constructor 3
        name=dogName;
        age=dogAge;
        weight=10;
        height=dogHeight;
        breed="None";
        color="None";
    }

    Dog(String dogName, int dogAge, double dogHeight, double dogWeight, String dogBreed){
        // constructor 4
        name=dogName;
        age=dogAge;
        weight=dogWeight;
        height=dogHeight;
        breed=dogBreed;
        color="None";
    }

    void printDogInfo(){
        System.out.println("Name "+name+" Age "+age+" Height "+height+" Breed "+breed+" Color "+color);
    }


}
