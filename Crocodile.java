package com.company.syntax.reviewclass09;

public class Crocodile extends Animal{

    int teeth = 70;

    void kill(){
        System.out.println("crocodile kills zebra");
    }

    void nature(){
        System.out.println("crocodile is a cold blooded animal");
    }

    void printTeeth(){
        System.out.println(teeth);
        System.out.println(super.teeth);
    }

    public static void main(String[] args) {
        Crocodile c = new Crocodile();
        c.printTeeth();
        c.nature();
        c.kill();
        c.hunt();
    }
}
