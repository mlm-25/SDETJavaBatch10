package com.company.syntax.class26.casting;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Cat();

        Animal animal1 = new Dog();
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            ((Cat)animal).meow();
        }

    }
}
