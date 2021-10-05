package com.company.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AllValuesFromMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Oxana");
        map.put(202, "Jhon");
        map.put(177, "Jane");
        map.put(90, "Mike");
        map.put(90, "Abdul");

        System.out.println("------------- Getting all values ------------");
        Collection<String> val = map.values();

        for(String str:val){
            System.out.println(str);
        }

        System.out.println("---------------------");
        Iterator<String> iterator = val.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------------- Getting all keys ------------");

        Set<Integer> keys = map.keySet();
        for(int key:keys){
            System.out.println(key+" --- "+map.get(key));
        }

        System.out.println("---------------------");
        Iterator<Integer> itr = keys.iterator();
        while(itr.hasNext()){
            Integer id = itr.next();
            System.out.println(id+" --- "+map.get(id));
        }

        System.out.println("------------- Getting all keys and values through collection ------------");

        Set<Map.Entry<Integer, String>> setEnter = map.entrySet();

        for (Map.Entry<Integer, String> entry:setEnter) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("---------------------");

        Iterator<Map.Entry<Integer, String>> it3 = setEnter.iterator();
        while(it3.hasNext()){
            Map.Entry<Integer, String> e = it3.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
