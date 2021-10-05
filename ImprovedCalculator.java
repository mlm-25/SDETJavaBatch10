package com.company.syntax.class23.methodOverloading;

public class ImprovedCalculator {
    void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    void add(double num1, double num2){
        System.out.println(num1+num2);
    }
    void add(double num1, int num2){
        System.out.println(num1+num2);
    }
    void add(int num1, double num2){
        System.out.println(num1+num2);
    }
    void add(int ... arr){
        int sum=0;
        for (int num:arr
        ) {
            sum+=num;
        }
        System.out.println(sum);
    }
}
