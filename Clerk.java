package com.company.syntax.reviewclass09;

public class Clerk extends Employee{


    Clerk(String name, int age, int empId, double salary) {
        super(name, age, empId, salary);
    }

    void adminTask(){
        System.out.println("it works fine");
    }

    public static void main(String[] args) {
        Clerk c = new Clerk("Hilal", 35, 101, 500000);
        c.adminTask();
        c.work();
        c.earn();
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.empId);
        System.out.println(c.salary);
    }
}
