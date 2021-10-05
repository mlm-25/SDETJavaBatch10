package com.company.syntax.reviewclass07;

public class Country {

    String state;
    static int dialCode = 1;

    static void display(){
        System.out.println(dialCode);
    }

    void display2(){
        System.out.println(dialCode);
        System.out.println("The dial code for "+state+" is "+dialCode);
    }

}
