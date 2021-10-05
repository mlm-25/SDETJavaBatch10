package com.company.syntax.reviewclass12;

import java.util.ArrayList;

public class ArrayListClass1 {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Michael");
        students.add("Olena");
        students.add("Blake");

        System.out.println(students);
        System.out.println(students.get(1));
    }
}
