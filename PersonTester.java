package com.company.syntax.class19;

import java.util.Scanner;

public class PersonTester {

    public static void main(String[] args) {
        Person person1 = new Person(30, "Jamil");
        person1.printInfo();

        Scanner scan = new Scanner(System.in);
        Person person2 = new Person(scan.next(), scan.nextInt());
        person2.printInfo();

        StringBuilder  stringBuilder = new StringBuilder();
    }
}
