package com.company.syntax.class16;

public class InstanceVarDemoTetser {

    public static void main(String[] args) {

        InstanceVarDemo instanceVarDemo = new InstanceVarDemo();
        System.out.println(instanceVarDemo.sum);
        instanceVarDemo.sum();
        System.out.println(instanceVarDemo.sum);
        instanceVarDemo.calculatorAverage();
        InstanceVarDemo.display();
    }

}
