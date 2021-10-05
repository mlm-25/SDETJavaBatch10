package com.company.syntax.class20;

public class MathTeacher extends Teacher{

    void teach(){
        System.out.println(name+" solves equations");
    }

    public static void main(String[] args) {
        MathTeacher a = new MathTeacher();
        a.printInfo("Mr. Perez", "Math", 8, 65000);
        a.teach();
    }

}
