package com.company.syntax.class31;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {

    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.
     */

    public static void main(String[] args) {
        Map<String, String> caps = new TreeMap<>();
        caps.put("United States", "Washington DC");
        caps.put("El Salvador", "San Salvador");
        caps.put("Argentina", "Buenos Aires");
        caps.put("Chile", "Santiago");
        caps.put("Spain", "Madrid");
        caps.put("Italy", "Rome");

        Set<Map.Entry<String, String>> c = caps.entrySet();

        Iterator<Map.Entry<String, String>> a = c.iterator();

        while(a.hasNext()){
            Map.Entry<String, String> one = a.next();
            System.out.println(one);
        }


    }
}
