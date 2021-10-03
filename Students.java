package com.company.syntax.class16;

public class Students {

    String studentName;
    String studentID;
    int numberOfStudents;

    public static void main(String[] args) {

        int numberOfStudents = 0;

        Students student1 = new Students();
        student1.studentName = "Mauricio";
        student1.studentID = "123";
        numberOfStudents+=1;

        Students student2 = new Students();
        student2.studentName = "Michael";
        student2.studentID = "456";
        numberOfStudents+=1;

        Students student3 = new Students();
        student3.studentName = "Javier";
        student3.studentID = "789";
        System.out.println();
        numberOfStudents += 1;

        System.out.println(student1.studentName+" is a student and his ID is "+student1.studentID );
        System.out.println(student2.studentName+" is a student and his ID is "+student2.studentID );
        System.out.println(student3.studentName+" is a student and his ID is "+student3.studentID );
        System.out.println("In total there are "+numberOfStudents+" students");


    }

}
