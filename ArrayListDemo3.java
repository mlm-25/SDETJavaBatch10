package com.company.syntax.class28;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {
        ArrayList<String> arraysList = new ArrayList<>();
        arraysList.add("Hi");
        arraysList.add("Eli");
        arraysList.add("Jam");
        arraysList.add("Eli");
        arraysList.add("Tes");
        arraysList.add("Eli");
        System.out.println(arraysList);
        arraysList.remove("Eli");
        System.out.println(arraysList);
        arraysList.add(2, "Serge");
        System.out.println(arraysList);

    }
}
