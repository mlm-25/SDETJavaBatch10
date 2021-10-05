package com.company.syntax.reviewclass12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Enes");
        names.add("Hilal");
        names.add("Oxana");
        names.add("Sharif");
        names.add("Hilal");
        names.add("Burju");
        System.out.println(names);

        LinkedHashSet<String> names2 = new LinkedHashSet<>();
        names2.add("Anne");
        names2.add("Blake");
        names2.add("Sharif");
        names2.add("Mike");
        names2.add("Mike");
        System.out.println(names2);

        TreeSet<String> t = new TreeSet<>();
        t.add("Enes");
        t.add("Dinara");
        t.add("Mars");
        t.add("Sule");
        t.add("Olena");
        System.out.println(t);
    }
}
