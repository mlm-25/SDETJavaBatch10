package com.company.syntax.reviewclass08;

import java.util.Locale;

public class MobileTester1 {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Iphone", "samsung", 8, 512);
        System.out.println(mobile.secondaryMemory);
        System.out.println(mobile.mainMemory);
    }
}
