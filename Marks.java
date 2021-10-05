package com.company.syntax.groupproject;

public abstract class Marks {
    abstract void getPercentage();
}
class StudentA extends Marks{
    double subject1;
    double subject2;
    double subject3;

    public StudentA(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    void getPercentage() {
        System.out.println((subject1+subject2+subject3)/3);
    }
}
class StudentB extends StudentA{
    double subject4;

    public StudentB(double subject1, double subject2, double subject3, double subject4) {
        super(subject1, subject2, subject3);
        this.subject4 = subject4;
    }
    @Override
    void getPercentage() {
        System.out.println((subject1+subject2+subject3+subject4)/4);
    }
}