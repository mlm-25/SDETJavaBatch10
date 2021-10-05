package com.company.syntax.class28;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        int [] arr = {10,20};
        int[] arr2 = new int[20];
        arr2[2]=1452;
        ArrayList<String> arraysList = new ArrayList<>();
        arraysList.add("Hi");
        arraysList.add("Jam");
        arraysList.add("Eli");
        arraysList.add("Tes");
        System.out.println(arraysList);
        System.out.println(arraysList.get(2));
        arraysList.set(2,"1000");
        System.out.println(arraysList.get(2));
        ArrayList<Integer> arraylist1 = new ArrayList<>();
        arraylist1.add(10);

    }
}
