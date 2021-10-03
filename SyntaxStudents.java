package com.company.syntax.class16;

public class SyntaxStudents {

    static String schoolName="Syntax";
    static int courseDuration=6;
    String name;
    String id;
    int age;

    double calculatorFee(){
        int var1=10;
        int var2 = 20;
        name="not bla bla";
        System.out.println(name);
        return var1*var2+100;
    }

    void didplayFee(){
        System.out.println(name+" has to pay "+calculatorFee());
    }


}
