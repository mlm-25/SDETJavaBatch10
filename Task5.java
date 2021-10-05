package com.company.syntax.class31;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task5 {

    /*
    Create a Map from array of cities that will sort keys in alphabetical order.
    As a key store the name of the city and as a value store the length of the city
    (Example: Paris=5, Moscow =6, Washington DC=13 etc..).
    If any city name is more than 7 characters remove that city .
     */

    public static void main(String[] args) {
        Map<String, Integer> cities = new TreeMap<>();
        cities.put("Toronto", 7);
        cities.put("Austin", 6);
        cities.put("Houston", 7);
        cities.put("Miami", 5);
        cities.put("San Salvador", 11);
        cities.put("Rome", 4);
        cities.put("Barcelona", 9);

        System.out.println(cities);

        Iterator<Map.Entry<String, Integer>> iterator = cities.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Integer> a = iterator.next();
            for (int i = 0; i < cities.size(); i++) {
                if(!((a.getValue()) >7)){
                    System.out.println(iterator.next());
                }
            }
        }



    }
}
