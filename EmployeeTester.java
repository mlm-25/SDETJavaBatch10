package com.company.syntax.class20;

import com.company.syntax.class21.Person;

public class EmployeeTester {

    public static void main(String[] args) {

        EmployeeFromOtherPackage employee = new EmployeeFromOtherPackage();
        //employee.name; can't be access because its private, and we are not inside same package
        //employee.age; can't be access because its private because it has default access modifier
        //employee.height; can't access because no extends keyword
        employee.weight=50;
        employee.sleep();
        //employee.eat(); can't access no extends keyword
        Person.run();
        EmployeeFromOtherPackage.run();
    }
}

