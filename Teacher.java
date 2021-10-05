package com.company.syntax.class20;

public class Teacher {

    String name;
    int experience;
    String subject;
    double salary;

    void printInfo(String teacherName, String teacherSubject, int teacherExperience, double teacherSalary){
        this.name=teacherName;
        this.subject=teacherSubject;
        this.experience=teacherExperience;
        this.salary=teacherSalary;
        System.out.println(this.name+" teaches "+this.subject+" they have "+this.experience+" years of experience"+
                " and they make $"+this.salary);
    }

}
