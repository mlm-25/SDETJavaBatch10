package com.company.syntax.reviewclass10;

public class Student {
    String name;
    String course;

    Student(String name, String course){
        this.name = name;
        this.course = course;
    }

    void getCourseInfo(){
        System.out.println(name + " is learning "+ course);
    }
}
class Selenium extends Student{
    Selenium(String name, String course){
        super(name, course);
    }

    void getCourseInfo(){
        System.out.println(name + " is learning the course of "+course);
    }
}
class Java extends Student{

    Java(String name, String course) {
        super(name, course);
    }
    void getCourseInfo(){
        System.out.println(name + " is learning the course of "+course);
    }

    public static void main(String[] args) {
        Java j = new Java("Olena", "Java 8");
        j.getCourseInfo();

        Selenium s = new Selenium("Sharif", "Selenium 3");
        s.getCourseInfo();


    }
}
