package com.company.syntax.class27.demo1;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", "X5", "123", "Sedan");
        bmw.drive();
        bmw.start();
        bmw.stop();
        bmw.displayInfo();
        Vehicle.displayTotalVehicle();

        Car car = new Toyota("Toyota", "Yaris", "Sedan", "456");
        ((Toyota)car).displayInfo();
    }
}
