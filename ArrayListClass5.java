package com.company.syntax.reviewclass12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass5 {

    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("msi");
        li.add("lenovo");
        li.add("hp");
        li.add("Asus");
        li.add("mac");
        System.out.println(li.size());
        System.out.println(li);

        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }
    }
}
