package com.company.syntax.reviewclass08;

public class Mobile {
    protected String make;
    String model;
    public int mainMemory;
    public int secondaryMemory;

    public Mobile(String make, String model, int mainMemory, int secondaryMemory) {
        this.make = make;
        this.model = model;
        this.mainMemory = mainMemory;
        this.secondaryMemory = secondaryMemory;
    }
    private void printInfo(){
        System.out.println(make+model+mainMemory);
    }
    protected void printModel(){
        System.out.println(model);
    }
    public void printMake(){
        System.out.println(make);
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile("Iphone", "Iphone 12", 8, 512);
        mobile.printInfo();
    }
}
class MobileTester{
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Android", "Galaxy 15", 8 , 512);
    }
}
