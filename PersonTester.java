package com.company.syntax.class27.encapsilation;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Burju");
        person.setAge(18);
        person.setWeight(80);
       /* person.name="Burju";
        person.age=16;
        person.weight=30;
        person.height=5;*/
        person.printInfo();

        Person person1 = new Person();
        /*person1.name="Mick King";
        person1.age=120;
        person1.height=2000;
        person1.weight=-15;*/
        person1.printInfo();
    }
}
