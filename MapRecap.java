package com.company.syntax.class31;

import java.util.*;

public class MapRecap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Oxana");
        map.put(202, "Jhon");
        map.put(177, "Jane");
        map.put(90, "Mike");
        map.put(90, "Abdul");
        map.put(null, null);
        map.put(null, "Elizabeth");

        System.out.println(map.size());
        System.out.println(map);
        //map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());

        Map<Integer, String> lmap = new LinkedHashMap<>();
        lmap.put(101, "Oxana");
        lmap.put(202, "Jhon");
        lmap.put(177, null);
        lmap.put(90, "Mike");
        lmap.put(90, "Abdul");
        lmap.put(null, null);
        lmap.put(null, "Elizabeth");

        System.out.println("LinkedHash Map");
        System.out.println(lmap);

        Map<Integer, String> tmap = new TreeMap<>();
        tmap.put(101, "Oxana");
        tmap.put(202, "Jhon");
        tmap.put(177, null);
        tmap.put(90, "Mike");
        tmap.put(90, "Abdul");
        //tmap.put(null, null); //treeMap does not allow null keys

        System.out.println("Tree Map");
        System.out.println(tmap);

        Map<Integer, String> htable = new Hashtable<>();
        htable.put(190, "Jack");
        //htable.put(null, "Me");
        // hashTable does not allow to have null keys or null values

        System.out.println(htable);
        // access 1 vale by specifying key
        System.out.println(tmap.get(90));
    }
}
