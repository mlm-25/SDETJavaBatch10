package com.company.syntax.class28;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Micheal");
        list.add("Andrei");
        list.add("Sule");
        list.add("Andrei");
        list.add("Abdul");
        list.add("Andrei");
        System.out.println(list);
        //System.out.println(list.remove("Andrei"));

        ArrayList<String> name = new ArrayList<>();
        name.add("Andrei");
        list.removeAll(name);
        System.out.println(list);

       /* while (list.remove("Andrei")){
        // recommended if you want to remove all entities
       }*/
        /*for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("Andrei")){
                list.remove(i);
            }
        }*/
        //System.out.println(list);

    }
}
