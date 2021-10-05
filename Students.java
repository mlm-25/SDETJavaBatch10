package com.company.syntax.class31;

import com.company.syntax.class29.hw.Student;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Students {

    public static void main(String[] args) {
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("Andrei", 101));
        students.add(new Student("Olena", 102));
        students.add(new Student("Serge", 103));
        students.add(new Student("Michael", 104));
        students.add(new Student("Mauricio", 105));

        System.out.println(students.size());

        Iterator<Student> it = students.iterator();
        while(it.hasNext()){
            Student s = it.next();
            String name = s.name;
            int id = s.studentID;
            System.out.println(name+" id is = "+id);
        }
        System.out.println("--------------------------------");
        Iterator<Student> itr = students.iterator();
        while(itr.hasNext()){
            Student stu = itr.next();
            System.out.println(stu.name+" id is = "+stu.studentID);
        }
    }
}
