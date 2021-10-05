package com.company.syntax.class23.methodOverloading;

public class CalculatorTester {
    public static void main(String[] args) {
        ImprovedCalculator improvedCalculator = new ImprovedCalculator();
        improvedCalculator.add(15.0,14.5);
        improvedCalculator.add(15,14);
        int[] arr={10,20,30};
        improvedCalculator.add(arr);
        improvedCalculator.add(15,14, 15);
        improvedCalculator.add(15,14, 15, 15);
        improvedCalculator.add(15,14, 15, 15, 15);
    }
}
