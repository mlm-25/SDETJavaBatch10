package com.company.syntax.class28.task;

import java.util.ArrayList;

public class Task3 {
    /*
    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
     */

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Fanta");
        drinks.add("Coke");
        drinks.add("Wine");
        drinks.add("Rum");
        drinks.add("Tequila");
        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("e") || drinks.get(i).contains("a")){
                drinks.set(i, "water");
            }
        }
    }
}
