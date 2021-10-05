package com.company.syntax.class28;

import java.util.ArrayList;

public class ArrayListDemo8 {

    public static void main(String[] args) {
        ArrayList<String> subject = new ArrayList<>();
        subject.add("SDLC");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");
        subject.add("TestNg");

        for(String subjects: subject){
            if(subjects.length()>4){
                subject.remove(subjects);
            }
        }
    }
}
