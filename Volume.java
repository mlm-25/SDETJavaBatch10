package com.company.syntax.class23.part1;

public class Volume {
    /*
    Create 1 class in which create a methods that will calculate the area
    (volume in case of box) of
    Rectangle
    Square
    Box
     */

    void math(double length, double width){
        System.out.println(length*width);
    }
    void math(double length){
        System.out.println(Math.pow(length,2));
    }
    void math(double length, double width, double height){
        System.out.println(length*width*height);
    }
}
