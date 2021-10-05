package com.company.syntax.class23.part1;

public class VolumeTester extends Volume {

    public static void main(String[] args) {
        VolumeTester shape = new VolumeTester();
        shape.math(12.5, 13);
        shape.math(23);
        shape.math(12.0,13,14.3);
    }
}