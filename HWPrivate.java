package com.company.syntax.class23.part2;

public class HWPrivate {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    private void method(){
        System.out.println("1");
    }
    private void method(String str){
        System.out.println("2:"+str);
    }
    private void method(int i){
        System.out.println("3:"+i);
    }

    public static void main(String[] args) {
        HWPrivate a = new HWPrivate();
        a.method();
        a.method(7);
        a.method("Syntax");
    }
}
