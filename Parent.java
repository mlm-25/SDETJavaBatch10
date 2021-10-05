package com.company.syntax.class23;

public class Parent {
    String name = "akbulut";

    void printName(){
        System.out.println("Name is "+name);
    }
    void getMarried(){
        System.out.println(" my children will get marry by my choice");
    }
}

class Child extends Parent{
    String name = "Enes";
    void printName(){
        String name = "Tesfab";
        System.out.println("Name is "+name);
        System.out.println("Name is "+this.name);
        System.out.println("Name is "+super.name);
    }

    void getMarried(){
        System.out.println("But I like someone else");
    }
    void letsDoSomethingCrazy(){
        getMarried();
        this.getMarried();
        super.getMarried();
    }
}
