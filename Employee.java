package com.company.syntax.class21;

public class Employee extends Person{

    String empId;
    double salary;
    void work(){
        System.out.println("Employee "+empId+" having age "+age+" is working");
    }
    void getPaid(){
        System.out.println(empId+" is paid "+salary);
    }
}
