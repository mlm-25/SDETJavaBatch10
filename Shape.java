package com.company.syntax.class23.part1;

public class Shape {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code.
     */
    double rad;
    Shape(double radius){
        this.rad = radius;
    }
}
class Circle extends Shape{
    double cal;
    Circle(double radius){
        super(radius);
    }
    void calculate(){
        System.out.println(cal=Math.PI*(Math.pow(super.rad,2)));
    }

    public static void main(String[] args) {
        Circle c = new Circle(10);
        c.calculate();
    }
}
