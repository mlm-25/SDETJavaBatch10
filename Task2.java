package com.company.syntax.class16;

public class Task2 {

    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters, numbers and special characters.
        Find out how many alpha characters are there in the String.
         */
        // To fromat the code use CTL+ALT+L

        String str = "ajafaASDFR1234!@#$%^";
        System.out.println(str.replaceAll("[^a-z A-Z 0-9]", ""));
        System.out.println(str.replaceAll("[^a-z A-Z 0-9]", "").length());


    }
}
