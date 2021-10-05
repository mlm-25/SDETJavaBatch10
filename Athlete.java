package com.company.syntax.reviewclass09;

public class Athlete {
    String name;
    int age;
    int weight;
    String game;

    Athlete(String name, int age, int weight, String game){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.game = game;
    }

    void gameInfo(){
        String name = "Michael";
        System.out.println(name+" "+this.age+" "+this.weight+" "+this.game);
    }
}
