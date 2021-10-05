package com.company.syntax.class22;

import java.util.Arrays;

public class Rep {
    String three(String str) {
        String str2=null;
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i += 3) {
            ;
        }
        return Arrays.toString(c);

    }
    public static void main(String[] args) {

        Rep a = new Rep();
        System.out.println(a.three("hello there"));
    }
}
