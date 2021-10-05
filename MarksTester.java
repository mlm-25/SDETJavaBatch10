package com.company.syntax.groupproject;

public class MarksTester {

    public static void main(String[] args) {
        StudentA studentA = new StudentA(10, 20 ,30);
        studentA.getPercentage();

        StudentB studentB = new StudentB(30, 40, 50, 10);
        studentB.getPercentage();
    }
}
