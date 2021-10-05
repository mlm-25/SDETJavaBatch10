package com.company.syntax.groupproject;

public class Car {
    double carPrice;
    String color;
    double calculateSalePrice(double carPrice){
        return carPrice;
    }
}
class Sedan extends Car {
    double length;

    @Override
    double calculateSalePrice(double carPrice) {
        this.length = length;
        if (length > 20) {
            return carPrice * 0.95;
        } else {
            return carPrice * 0.90;
        }
    }
}

class Truck extends Car {
    double weight;

    @Override
    double calculateSalePrice(double carPrice) {
        this.weight=weight;
        if(weight>2000){
            return carPrice*0.90;
        }else{
            return carPrice*0.80;
        }
    }

}
