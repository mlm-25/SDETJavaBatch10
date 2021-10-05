package com.company.syntax.class20;

public class ChemistryTeacher extends Teacher{

    void teach(){
        System.out.println(name+" mixes chemicals");
    }


    public static void main(String[] args) {
        ChemistryTeacher a = new ChemistryTeacher();
        a.printInfo("Ms. Smith", "chemistry", 23, 55000);
        a.teach();
    }
}
