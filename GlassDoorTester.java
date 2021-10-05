package com.company.syntax.reviewclass09;

public class GlassDoorTester {
    public static void main(String[] args) {
        GlassDoorSalary g1 = new GlassDoorSalary(101, 5000, 6000, 7000);
        g1.printAverageSalary();

        GlassDoorSalary g2 = new GlassDoorSalary(201, 9000, 1000, 3500);
        g2.printAverageSalary();
    }
}
