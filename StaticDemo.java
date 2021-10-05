package com.company.syntax.class17;

public class StaticDemo {

    String name = "BlaBla";
    static String country = "USA";
    void method1(){
        System.out.println(name);
        System.out.println(country);
    }

    static void method2(){
        //System.out.println(name); name is an instance field and its
        // value can vary from object to object

        StaticDemo staticDemo = new StaticDemo();
        System.out.println(staticDemo.name);
        staticDemo.method1();
        method3();
    }

    static void method3(){

    }


}
