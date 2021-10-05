package com.company.syntax.reviewclass07;

public class MethodDemo3 {

    public static void main(String[] args) {
        //regex
        String name = "Softw@re Testing is @m@zing";
        System.out.println(name.replaceAll("@","a"));

        String test = "sharifEDWIANA321654@#%&*#";
        System.out.println(test.replaceAll("[0-9]", "*"));
        System.out.println(test.replaceAll("[A_Z]", "."));
        System.out.println(test.replaceAll("[a-z]", "+"));
        System.out.println("------------------------------");

        System.out.println(test.replaceAll("[A-Z 0-9]", ""));
        System.out.println(test.replaceAll("[a-z A-Z 0-9]", ""));
        System.out.println(test.replaceAll("[^a-z A-Z 0-9]", ""));
    }
}
