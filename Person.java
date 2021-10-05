package com.company.syntax.class25.overridingdemo;

public class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }

    void eat(){
        System.out.println("Person can eat");
    }
    void performDailActivities(){
        System.out.println("Eat sleep repeat");
    }
}
class Employee extends Person{
    public Employee(String name) {
        super(name);
    }

    void performDailActivities(){
        System.out.println("Office work all the day and emails at night");
    }
}
class Student extends Person{
    public Student(String name) {
        super(name);
    }

    void performDailActivities(){
        System.out.println("Attend classes at night");
    }
}
class Teacher extends Person{
    public Teacher(String name) {
        super(name);
    }

    void performDailActivities(){
        System.out.println("Teaching classes checking assignments");
    }
}
