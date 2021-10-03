package com.company.syntax.class16;

public class Task5 {

    public static void main(String[] args) {
        /*
        How would you reverse a String word by word?
         */
        String str = "This is a sentence that I want to reverse";
        String[] arr = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String s : arr) {
            StringBuilder stringBuilder = new StringBuilder(s); // converting String to StringBuilder
            stringBuilder.reverse(); // reverse the String
            reversed.append(stringBuilder).append(" "); // append part is similar to concat

        }

        System.out.println(reversed);

    }
}
