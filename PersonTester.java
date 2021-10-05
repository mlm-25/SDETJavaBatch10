package com.company.syntax.class18;

public class PersonTester {

    public static void main(String[] args) {
        Person person = new Person("Jesus",25,"USA");
     /*   person.name="Jesus";
        person.age=25;
        person.country="USA";*/
        person.printInfo();
        Person person1 = new Person("Somi",18,"USA");
      /*  person1.name="Somi";
        person1.country="USA";*/
        person1.printInfo();

    }
}
