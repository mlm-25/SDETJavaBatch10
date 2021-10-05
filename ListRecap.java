package com.company.syntax.class31;

import java.util.*;

public class ListRecap {

    public static void main(String[] args) {

        List<String> grocery = new ArrayList<>();
        grocery.add("Milk");
        grocery.add("Cheese");
        grocery.add("Eggs");
        grocery.add("Butter");
        grocery.add("Butter");

        System.out.println(grocery.size());
        System.out.println(grocery);

        System.out.println("*********************** Getting all elements ***************************");

        for (String gros:grocery) {
            System.out.println(gros);
        }
        System.out.println("*********************** Getting all elements ***************************");
        for (int i = 0; i < grocery.size(); i++) {
            System.out.println(grocery.get(i));
        }
        System.out.println("*********************** Getting all elements ***************************");
        Iterator<String> iterator = grocery.iterator();
        while(iterator.hasNext()){
            String itr = iterator.next();
            System.out.println(itr);
        }
        Set<String> car = new TreeSet<>();
        car.add("BMW");
        car.add("Kia");
        car.add("Toyota");
        car.add("Honda");
        car.add("BMW");

        System.out.println(car.size());
        System.out.println(car);

        Iterator<String> it = car.iterator();
        String c = it.next();
        System.out.println("***************************");
        System.out.println(c);
        System.out.println("***************************");

        String cc = car.iterator().next();
        System.out.println(cc);

        System.out.println("Elements from set to list");

        List<String> carCopy = new ArrayList<>(car);
        System.out.println(carCopy);
        System.out.println(carCopy.get(2));

        List<String> carCopy2 = new ArrayList<>();
        carCopy2.addAll(car);
        System.out.println(carCopy2);
        System.out.println(carCopy2.get(2));

        System.out.println("***************************");
        System.out.println(carCopy2);
        carCopy2.add("Honda");
        carCopy2.add("Honda");
        carCopy2.add("Toyota");

        System.out.println(carCopy2);
        //how would you remove duplicate elements from the list

        Set<String> myCars = new LinkedHashSet<>(carCopy2);
        System.out.println(myCars);
    }
}
