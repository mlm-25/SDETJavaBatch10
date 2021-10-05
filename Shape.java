package com.company.syntax.groupproject;

public interface Shape {
    void calculateArea (int radius);
    void calculatePerimiter(int radius);
}
class Circle implements Shape{

    @Override
    public void calculateArea(int radius) {
        System.out.println(Math.PI*radius*radius);
    }

    @Override
    public void calculatePerimiter(int radius) {
        System.out.println(2* Math.PI*radius);
    }
}
class Square implements Shape{

    @Override
    public void calculateArea(int area) {
        System.out.println(area*area);
    }

    @Override
    public void calculatePerimiter(int area) {
        System.out.println(area*4);
    }
}
