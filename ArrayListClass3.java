package com.company.syntax.reviewclass12;

import java.util.ArrayList;

public class ArrayListClass3 {

    public static void main(String[] args) {
        ArrayList<String> employee = new ArrayList<>();
        employee.add("Jennifer");
        employee.add("Test Lead");
        employee.add("USA");
        System.out.println(employee);

        ArrayList<String> employee2 = new ArrayList<>();
        employee2.add("Sule");
        employee2.add("Deliver Manager");
        employee2.add("USA");
        System.out.println(employee2);

        //employee.addAll(employee2);
        employee.addAll(2, employee2);
        System.out.println(employee);
    }
}
