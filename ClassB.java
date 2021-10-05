package com.company.syntax.class20;

public class ClassB extends ClassA {

    void disappear(){
        System.out.println("Batman disappears at the end of the movie.");
    }

    public static void main(String[] args) {
        ClassB batman = new ClassB();
        batman.title="The Dark Knight";
        batman.yearMade=2008;
        batman.villain="Joker";
        ClassA.cast();
        batman.getTitle();
        ClassA.bruceWayne();
        ClassA.glide();
        batman.fightVillain();
        batman.disappear();

    }

}
