package com.company.syntax.class25.hw;

public class ComputerTester {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Dell dell = new Dell();
        Computer [] computers = {apple, dell, new HP(), new Lenovo()};
        for (Computer computer : computers) {
            computer.browseInternet();
            computer.openFiles();
        }
    }
}
