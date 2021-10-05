package com.company.syntax.class24.overridingdemo;

public class Employee {
    double salary;
    String name;
    Employee(String name, double salary){
        this.salary=salary;
        this.name=name;
    }
    void getPaid(){
        System.out.println(name+" is getting paid "+salary+"/anum");
    }
}
class Contractor extends Employee{

    Contractor(String name, double salary){
        super(name, salary);
    }
    @Override
    void getPaid(){
        System.out.println(name+" is getting paid "+salary+"/hourly");
    }
}
class FullTimeEmployee extends Employee{

    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Mauricio", 100000);
        fullTimeEmployee.getPaid();
        Contractor contractor = new Contractor("Mike", 45);
        contractor.getPaid();
    }
}