package com.company.syntax.reviewclass12;

import java.util.ArrayList;

public class Iterator {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Honda");
        al.add("Audi");
        al.add("BMW");
        al.add("Mercedes");
        al.add("Jaguar");

        java.util.Iterator<String> iterator = al.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(al);
    }
}
