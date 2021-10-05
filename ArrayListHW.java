package com.company.syntax.class29.hw;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class ArrayListHW {

    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        LinkedHashSet<String> b = new LinkedHashSet<>(aList);

        System.out.println(b);
    }
}
