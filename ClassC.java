package com.company.syntax.class20;

public class ClassC extends ClassB {

    void gordonFindsIdentity(){
        System.out.println("James Gordon finds out Bruce Wayne is Batman.");
    }

    public static void main(String[] args) {
        ClassC batman = new ClassC();
        batman.title="The Dark Knight Rises";
        batman.yearMade=2012;
        batman.villain="Bane";
        ClassA.cast();
        batman.getTitle();
        ClassA.bruceWayne();
        ClassA.glide();
        batman.fightVillain();
        batman.disappear();

    }

}
