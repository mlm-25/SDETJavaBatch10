package com.company.syntax.groupproject;

public class CarTester {
    public static void main(String[] args) {
        Truck truck=new Truck();
        truck.weight=3000;
        System.out.println(truck.calculateSalePrice(20000));

        Sedan sedan=new Sedan();
        sedan.length=30;
        System.out.println(sedan.calculateSalePrice(20000));
    }
}

