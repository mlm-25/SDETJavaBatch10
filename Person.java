package com.company.syntax.class31;

public class Person {
    String name;
    String lastName;
    int age;
    double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void personId(String name, String lastName){
        System.out.println(this.name+" "+this.lastName);
    }
}
