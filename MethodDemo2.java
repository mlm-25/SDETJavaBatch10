package com.company.syntax.reviewclass07;

public class MethodDemo2 {

    public static void main(String[] args) {
        String test = "Automation job is in high demand in the USA";
        String reverse = "";

        for(int i = test.length()-1 ; i>=0; i--){
            reverse+=test.charAt(i);
        }
        System.out.println(reverse);

    }
}
