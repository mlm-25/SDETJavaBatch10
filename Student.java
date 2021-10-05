package com.company.syntax.class25.task;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism
     */
    void study(){
        System.out.println(name+" studies");
    }
    void hw(){
        System.out.println(name+" has homework");
    }
}
class SyntaxStudent extends Student{

    public SyntaxStudent(String name) {
        super(name);
    }
    @Override
     void study(){
        System.out.println(name+" studies");
    }
    @Override
     void hw(){
        System.out.println(name+" has Java homework");
    }
     void attendClass(){
         System.out.println(name+" has class online");
     }
     void java(){
         System.out.println(name+" practices Java during the weekends");
     }
}
class CollegeStudent extends Student{
    public CollegeStudent(String name) {
        super(name);
    }
    @Override
    void study(){
        System.out.println(name+" studies");
    }
    @Override
    void hw(){
        System.out.println(name+" has college algebra homework");
    }
    void attendClass(){
        System.out.println(name+" has class in person");
    }
    void subject(){
        System.out.println(name+" practices college algebra during the week");
    }
}
class SchoolStudent extends Student{
    public SchoolStudent(String name) {
        super(name);
    }
    @Override
    void study(){
        System.out.println(name+" studies");
    }
    @Override
    void hw(){
        System.out.println(name+" has algebra homework");
    }
    void attendClass(){
        System.out.println(name+" has class in person");
    }
    void math(){
        System.out.println(name+" practices algebra during the week");
    }
}
