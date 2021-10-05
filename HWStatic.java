package com.company.syntax.class23.part2;

public class HWStatic {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    static void method(String str){
        System.out.println("1:"+str);
    }
    static void method(boolean str){
        System.out.println("2:"+str);
    }
    static void method(int str){
        System.out.println("3:"+str);
    }

    public static void main(String[] args) {
        method("Mauricio");
        method(true);
        method(12);
    }
}
