package com.company.syntax.class22;

public class Dog extends Animal{
    int noOfLegs=4;
    void eat(){
        System.out.println("Dogs like to eat meat");
    }
    void activities(){
        sleep();
        eat();
    }
    void sleep(){
        System.out.println("Dog can sleep");
    }

    void printLegs(){
        System.out.println(noOfLegs);
        System.out.println(super.noOfLegs);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printLegs();

        dog.eat();

    }


}
