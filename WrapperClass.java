package com.company.syntax.class29;

import java.util.ArrayList;

public class WrapperClass {

    public static void main(String[] args) {
        String name = "Hello";
        String name2 = new String("Hello");
        Integer number = new Integer(10);  //Boxing
        String strNumber = number.toString();
        System.out.println(strNumber);
        Integer number2 = 20; // AutoBoxing
        Double doubleNumber = 35.0;
        int number3 = Integer.parseInt("1000");
        System.out.println();
        int number6 = number.intValue();

    }
}
