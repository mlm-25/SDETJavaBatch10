package com.company.syntax.class17;

public class HW3 {

    private String method(String str){

        return str.replaceAll("[^aAeEiIoOuU]","");

    }

    public static void main(String[] args) {

        HW3 hw = new HW3();
        System.out.println(hw.method("Mauricio"));
    }

}
