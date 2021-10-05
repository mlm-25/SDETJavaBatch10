package com.company.syntax.class25.hw;

public class Computer {
    int MainMemory;
    double price;
    String make;

    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */

    void browseInternet(){
        System.out.println("You can browser internet on computer");
    }
    void openFiles(){
        System.out.println("You can open different files on a Computer");
    }
}
class Apple extends Computer{

    void browseInternet(){
        System.out.println("You can browser internet on computer on Apple using Safari");
    }
    void useItunes(){
        System.out.println("You can use ITunes");
    }
}
class Lenovo extends Computer{

    void browseInternet(){
        System.out.println("You can browser internet on computer using Google Chrome");
    }
    void vantageApp(){
        System.out.println("Use vantage app to customize me");
    }
}
class HP extends Computer{
    void browseInternet(){
        System.out.println("You can browser internet on computer using Firefox");
    }
    void HPSmartApp(){
        System.out.println("Use HPSmartApp app to customize me");
    }
}
class Dell extends Computer{
    void browseInternet(){
        System.out.println("You can browser internet on computer");
    }
    void DellSupportApp(){
        System.out.println("Use DellSupportApp app to customize me");
    }
}