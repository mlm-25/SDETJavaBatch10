package com.company.syntax.class21;

public class EmployeeTester {

    public static void main(String[] args) {
        Person person = new Person();
        person.age=10;
        person.sleep();
        person.eat();
        Employee employee = new Employee();
        employee.age=15;
        employee.salary=100000;
        employee.work();
        employee.getPaid();
        employee.sleep();
    }
}
