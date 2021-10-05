package com.company.syntax.class23;

public class Employee extends Person{
    String name;
    int age;
    double height;
    double weight;
    String address;
    String phoneNumber;

    public Employee(String name, int age, double height, double weight, String address, String phoneNumber) {
        super(name, age, height, weight, address, phoneNumber);
    }
}
