package com.company.syntax.class28;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    /*
   1) Create an ArrayList that will store 5 names into it.
   2) Find out whether the given ArrayList is empty or not?
   3) Check whether the specific name is present in an ArrayList or not?
   4) Find the size of your arrayList and print all values from that
     */

    public static void main(String[] args) {
        //Part 1
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Luka");
        arr.add("Karim");
        arr.add("Eder");
        arr.add("David");
        arr.add("Toni");

        //Part 2
        System.out.println(arr.isEmpty());

        //Part 3
        System.out.println(arr.contains("Toni"));

        //Part 4
        int size = arr.size();
        System.out.println(arr);
        System.out.println("Array length is "+size);

    }
}
