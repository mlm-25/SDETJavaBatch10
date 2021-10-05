package com.company.syntax.class19;

public class Person {
    String name;
    int age;
    double weight;
    double height;
    String education;

    // windows: Ctrl+shift+/ to comment/uncomment

    Person(){
        System.out.println("Important lines of code that should always be"+
                " executed when creating the object of this class");
        name = "None";
        age = 30;
        weight = 50;
        height = 5.5;
        education = "None";
    }

    Person(String personName){
        this(); // calls the no argument constructor must be on first line
        System.out.println("First constructor");
        name = personName;
    }

    Person(String personName, int personAge){
        this(personName);
        System.out.println("First constructor");
        age = personAge;
    }

    void printInfo(){
        System.out.println("Name "+name+" Age "+age+" Weight "+weight+" Height "+height+" Education "+education);
    }

    Person(int personAge ,  String personName){
        System.out.println("Second constructor");
        name = personName;
        age = personAge;
        weight = 50;
        height = 5.5;
        education = "None";

        System.out.println("Important lines of code that should always be"+
                " executed when creating the object of this class");

    }
}
