package com.company.syntax.class28;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Micheal");
        list.add("Andrei");
        list.add("Sule");
        list.add("Jam");
        list.add("Abdul");
        list.add("Andrei");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Micheal");
        list1.add("Andrei");
        list1.add("Abdul");

        list.removeAll(list1);
        System.out.println(list);
    }
}
