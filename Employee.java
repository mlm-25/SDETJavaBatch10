package com.company.syntax.class16;

public class Employee {

    static String CEO="Sumair";
    static int CEOslary= 350000;
    String empID;
    int salary;

    public static void main(String[] args) {

        Employee empl1 = new Employee();
        empl1.empID = "Asghar";
        empl1.salary = 125000;
        System.out.println(empl1.empID+" makes $"+empl1.salary);

        Employee empl2 = new Employee();
        empl2.empID = "Asel";
        empl2.salary = 125000;
        System.out.println(empl2.empID+" makes $"+empl2.salary);

        System.out.println(Employee.CEO+" makes $"+Employee.CEOslary);


    }

}
