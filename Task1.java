package com.company.syntax.class16;

public class Task1 {

    public static void main(String[] args) {
        //Create a String that will hold a sentence. Write a program to get a new String without any spaces.

        String str = "This is a sentence with spaces";
        System.out.println(str);
        System.out.println(str.replace(" ","")); // removes all spaces from sentence

    }
}
