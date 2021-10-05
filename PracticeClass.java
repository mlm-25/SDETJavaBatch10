package com.company.syntax.reviewclass12;

import java.util.ArrayList;

public class PracticeClass {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hira");
        names.add("Sule");
        names.add("Blake");
        names.add("Ana");
        names.add("Mike");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Ana"));
        System.out.println(names.contains("sohel"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
