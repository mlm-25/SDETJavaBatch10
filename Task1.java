package com.company.syntax.class29.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Task1 {
    /*
    Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
    Using 2 different ways retrieve all elements from set.
     */

    public static void main(String[] args) {
        TreeSet<String> a = new TreeSet<>();
        a.add("Portugal");
        a.add("Brazil");
        a.add("Uruguay");
        a.add("France");
        a.add("Germany");
        a.add("Italy");
        a.add("Spain");
        a.add("United States");

        System.out.println(a);
        System.out.println("----------------------------");
        for (String country:a
             ) {
            System.out.println(country);
        }

    }
}
