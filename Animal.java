package com.company.syntax.class26.casting;

public class Animal {
    void sleep(){
        System.out.println("Sleeping");
    }
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dogs like meat");
    }
}
class Cat extends Animal{

    void eat(){
        System.out.println("Milk fish");
    }
    void meow(){
        System.out.println("meow");
    }
}