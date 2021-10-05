package com.company.syntax.reviewclass11;

public abstract class VehicleTwo {
    String name;
     static int registrationNumber = 1;

     VehicleTwo(String name){
         this.name = name;
         registrationNumber++;
     }

     abstract void speedOfVehicle();
     static void displayNameQuantityOfVehicle(){
         System.out.println("Vehicle numbers are "+registrationNumber);
     }

     public void color(){
         System.out.println("Color of the vehicle is black");
     }

     protected void price(){
         System.out.println("It's in budget");
     }


}
abstract class Car extends VehicleTwo{

    String model;
    Car(String name, String model) {
        super(name);
        this.model = model;
    }

    @Override
    public void speedOfVehicle(){
        System.out.println("Speed has been tested in this class");
    }
    public abstract void breakMyCar();
}
class Byk extends Car{

    String color;

    Byk(String name, String model, String color) {
        super(name, model);
        this.color = color;
    }

    @Override
    public void breakMyCar() {

    }
}