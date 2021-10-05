package com.company.syntax.reviewclass12;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Melon");
        fruits.add("Berries");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("ab");
        fruits.add("cd");

        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            if(name.length()>2){
                iterator.remove();
            }
        }
        System.out.println(fruits);
    }
}
