package com.company.syntax.reviewclass07;

public class AccessModifiers {
    private String employeeName;
    // it can only be accessed inside the class
    String designation;
    protected double salary;
    public String state;


    private void employeeDetails(){
        System.out.println(employeeName);
        System.out.println(designation);
        System.out.println(salary);
    }

    void employeeNameArea(){
        System.out.println(employeeName);
        System.out.println(designation);
        System.out.println(salary);
    }

    public void anotherMethod(){
        System.out.println("Just a public method");
    }

}
