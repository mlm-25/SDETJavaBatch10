package com.company.syntax.class20;

public class PianoTeacher extends Teacher{

    void teach(){
        System.out.println(name+" knows beethoven");
    }

    public static void main(String[] args) {
        PianoTeacher a = new PianoTeacher();
        a.printInfo("Mrs. Rivera", "piano",5, 45000);
        a.teach();
    }
}
