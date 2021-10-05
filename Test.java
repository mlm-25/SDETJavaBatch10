package com.company.syntax.reviewclass12;

public class Test {

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setFirstName("Michael");
        e.setUserId(123);
        e.setUsername("Mike123");
        e.setPassword("MyNameIsMike");

        System.out.println(e.getFirstName());
        System.out.println(e.getUsername());

    }
}
