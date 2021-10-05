package com.company.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        /*subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");*/
        Iterator<String> iterator = subjects.iterator();
        System.out.println(iterator.hasNext());
        /*System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());*/
        iterator.remove();
        System.out.println(subjects);
       // System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

    }
}
