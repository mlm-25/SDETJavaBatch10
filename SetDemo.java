package com.company.syntax.class29;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("apple");
        System.out.println(fruits);

    }
}
