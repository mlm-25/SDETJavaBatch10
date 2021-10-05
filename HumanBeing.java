package com.company.syntax.reviewclass09;

public class HumanBeing {
    String name;
    int age;
    double height;
    double weight;

    HumanBeing(){
        System.out.println("Testing the constructor");
        name = "Elon Musk";
        age = 46;
        height = 6;
        weight = 70;
    }

    HumanBeing(String humanName){
        this();
        System.out.println("Testing the constructor");
        name = humanName;

    }

    HumanBeing(String humanName, int humanAge){
        this(humanName);
        System.out.println("Testing the constructor");
        age = humanAge;
    }

    void printHumanInfo(){
        System.out.println(name+" "+age+" "+height+" "+weight);
    }

}
