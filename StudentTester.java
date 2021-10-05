package com.company.syntax.class18;

public class StudentTester {

    public static void main(String[] args) {

        String name = null;
        double av = 0;

        Student student1 = new Student();
        name=student1.getName("Mauricio");
        av=student1.Average(88,95,89);
        System.out.println(name+av);

        Student student2 = new Student();
        name = student2.getName("Victor");
        av = student2.Average(78,83,93);
        System.out.println(name+av);

        Student student3 = new Student();
        name = student3.getName("Danny");
        av = student2.Average(87,82,91);
        System.out.println(name+av);

    }
}
