package com.company.syntax.class20;

import com.company.syntax.class21.Person;

public class EmployeeFromOtherPackage extends Person {
    String empId;
    double salary;
    void work(){
        System.out.println("Employee "+empId+" having height "+height+" is working");
    }
    void getPaid(){
        System.out.println(empId+" is paid "+salary);
    }
    public static void takesLeaves(){
        System.out.println("Employees can take leaves");
    }
}
