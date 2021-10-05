package com.company.syntax.class17;

public class StudentTester {

    public static void main(String[] args) {

        Student student = new Student();
        student.studentID="1";
        student.studentName="Michael";
        Student.numberOfStudents++;

        Student student1 = new Student();
        student1.studentID="2";
        student1.studentName="Serge";
        Student.numberOfStudents++;

        Student student2 = new Student();
        student2.studentID="3";
        student2.studentName="Mars";
        Student.numberOfStudents++;

        System.out.println(Student.numberOfStudents);


    }
}
