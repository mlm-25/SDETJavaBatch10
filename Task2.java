package com.company.syntax.class32;

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
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("United States", "Washington DC");
        countries.put("El Salvador", "San Salvador");
        countries.put("Argentina", "Buenos Aires");
        countries.put("Chile", "Santiago");
        countries.put("Spain", "Madrid");
        countries.put("Italy", "Rome");

        for (String value:countries.values()) {
            System.out.println(value);
        }


        Set<Map.Entry<String, String>> c = countries.entrySet();

        Iterator<Map.Entry<String, String>> a = c.iterator();

        while(a.hasNext()){
            Map.Entry<String, String> one = a.next();
            String key = one.getKey();
            String value = one.getValue();
            System.out.println(key+" "+value);

        }
    }
}
