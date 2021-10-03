package com.company.syntax.class16;

public class Task4 {

    public static void main(String[] args) {
        /*
        How would you reverse a String character by character?
         */

        String str = "Mauricio";
        System.out.println(str);
        char[] arr = str.toCharArray();
        for(int i = arr.length - 1; i>=0; i--){
            System.out.print(arr[i]);
        }

    }
}
