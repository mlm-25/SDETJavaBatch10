package com.company.syntax.class18;

public class Task2 {
    // Create a method that will take a String
    // as a parameter and returns reversed String.
    // Method should be available to all classes within
    // your project and accessible by class name

    public static String reverse (String inputStr){
        return new StringBuilder(inputStr).reverse().toString();

    }
}
