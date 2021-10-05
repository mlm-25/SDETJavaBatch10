package com.company.syntax.reviewclass11;

public abstract class Vehicle {
    //definition

    public void getSpeed(){
        System.out.println("Getting speed of the vehicle");
    }

    public void measureAverage(){
        System.out.println("Calculating average");
    }

    public abstract void color();

    public abstract void getPrice();
}
class Honda extends Vehicle{

    @Override
    public void color(){
        System.out.println("Honda color is black");
    }

    @Override
    public void getPrice(){
        System.out.println("It is costly");
    }
}
class Audi extends Vehicle{

    @Override
    public void color() {
        System.out.println("Forget color focus on price");
    }

    @Override
    public void getPrice() {
        System.out.println("Not affordable");
    }
}