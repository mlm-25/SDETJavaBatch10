package com.company.syntax.class29.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task2 {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”
     */

    public static void main(String[] args) {
        LinkedHashSet<String> a = new LinkedHashSet<>();
        a.add("Atlanta");
        a.add("Miami");
        a.add("Amarillo");
        a.add("Orlando");
        a.add("Austin");
        a.add("Houston");
        a.add("Dallas");

        System.out.println(a);
        System.out.println("-------------------");
        Iterator<String> iterator = a.iterator();
        while(iterator.hasNext()){
            String c = iterator.next();
            if(c.startsWith("a") || c.startsWith("A")){
             iterator.remove();
            }
        }
        System.out.println(a);
    }
}
