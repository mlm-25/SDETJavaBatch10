package com.company.syntax.reviewclass12;

import java.util.ArrayList;

public class ArrayListClass4 {

    public static void main(String[] args) {
        ArrayList<String> al  = new ArrayList<>();
        al.add("Sohel");
        al.add("abbasi");
        al.add("Module lead");
        al.add("India");

        System.out.println(al);
        al.remove("India");
        System.out.println(al);

        al.add(2, "USA");
        System.out.println(al);
    }
}
