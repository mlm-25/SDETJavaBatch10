package com.company.syntax.class16;

public class InstanceVarDemo {

    int [] arr={10, 20, 30, 50};
    int sum=0;
    void sum(){

        for(int i: arr){
            sum+=i;
        }

    }

    void calculatorAverage(){
        System.out.println(sum/arr.length);
    }

    static void display(){
        System.out.println("Hello from the static method");
    }


}
