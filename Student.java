package com.company.syntax.class18;

public class Student {

    String name;
    double g1;
    double g2;
    double g3;

    String getName(String name){
        return name.concat(" has an average of ");
    }

    double Average(double g1, double g2, double g3){
        double sum = 0;
        double answer = 0;
        sum = g1+g2+g3;
        answer=sum/3;
        return answer;

    }

}
