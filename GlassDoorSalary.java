package com.company.syntax.reviewclass09;

public class GlassDoorSalary {
    int empId;
    double salaryOne;
    double salaryTwo;
    double salaryThree;

    GlassDoorSalary(int empId, double salaryOne, double salaryTwo, double salaryThree) {
        this.empId = empId;
        this.salaryOne = salaryOne;
        this.salaryTwo = salaryTwo;
        this.salaryThree = salaryThree;
    }
    void printAverageSalary(){
        System.out.println("Average salary of an employee is : "+(salaryOne+salaryTwo+salaryThree)/3);
    }
}
