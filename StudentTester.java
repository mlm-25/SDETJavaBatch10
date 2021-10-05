package com.company.syntax.class25.task;

public class StudentTester {
    public static void main(String[] args) {
        Student student = new SyntaxStudent("Mauricio");
        student.study();
        student.hw();
        ((SyntaxStudent)student).attendClass();
        ((SyntaxStudent)student).java();

        student = new CollegeStudent("Jose");
        student.study();
        student.hw();
        ((CollegeStudent)student).attendClass();
        ((CollegeStudent)student).subject();

        student = new SchoolStudent("Miguel");
        student.study();
        student.hw();
        ((SchoolStudent)student).attendClass();
        ((SchoolStudent)student).math();
    }
}
