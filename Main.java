package com.company.syntax.groupproject;

public class Main {
    String dogName;
    double dogWeight;
    static String dogBreed = "Mutt";

    Main(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }

    void printInfo(){
        System.out.println(this.dogName+" "+dogBreed+" "+this.dogWeight);
    }

    public static void main(String[] args) {
        Main a = new Main("Tarzan", 50);
        a.printInfo();

        Main b = new Main("Lucy", 10);
        b.printInfo();
    }
}
