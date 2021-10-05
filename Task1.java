package com.company.syntax.class31;

import java.util.TreeMap;

public class Task1 {
    /*
    Create a map of a building. Store floor number and it is associated company name.
     (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
     */

    public static void main(String[] args) {
        TreeMap<Integer, String> building = new TreeMap<>();
        building.put(1, "Facebook");
        building.put(2, "Google");;
        building.put(3, "Netflix");
        building.put(4, "Amazon");
        building.put(5, "Google");
        building.put(6, "Apple");
        building.put(7, "IMB");
        building.put(1, "Apple");
        System.out.println(building);
        System.out.println(building.size());
        building.replace(4, "Adobe");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);
    }
}
