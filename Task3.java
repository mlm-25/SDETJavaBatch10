package com.company.syntax.class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task3 {
    /*
    Create a map of Best Buy store. Place
    item id and item name into it.
    Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet.
     */

    public static void main(String[] args) {
        Map<Integer, String> best = new HashMap<>();
        best.put(1, "PS5");
        best.put(2, "TV");
        best.put(3, "Laptop");
        best.put(4, "Fire Stick");
        best.put(5, "Air Pods");

        Set<Map.Entry<Integer, String>> c = best.entrySet();
        Iterator<Map.Entry<Integer, String>> a = c.iterator();

        while(a.hasNext()){
            System.out.println(a.next());
        }
    }
}
