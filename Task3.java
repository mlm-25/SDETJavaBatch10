package com.company.syntax.class18;

public class Task3 {


    private static String onlyVowels(String input){
        return input.replaceAll("[^aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.println(onlyVowels("abcdefghijklmnopqrstuvwxyz"));
    }
}
