package com.company.syntax.class28;

import java.util.ArrayList;

public class ArrayListDemo9 {

    public static void main(String[] args) {
        ArrayList<String> subject = new ArrayList<>();
        subject.add("SDLC");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");
        subject.add("TestNg");
        for (int i = 0; i < subject.size(); i++) {
            if(subject.get(i).length()>4){
                subject.remove(i);
            }
        }
        System.out.println(subject);
    }
}
