package com.company.syntax.class28;

import java.util.Arrays;

public class Issues {

    /*char[] methodArr(int[] array, int number){
       String newArray = array.toString();
       char[] charArray = newArray.toCharArray();
        if (!charArray.equals(number)) {

            return charArray;
        }else {
            String finalArr = charArray.toString();
            finalArr.replaceAll(String.valueOf(number), "");
            charArray=finalArr.toCharArray();
            return charArray;
        }
    }*/


    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 20;
        System.out.println(num);
        int[] arr = new int[3]; // need to define the size first
        arr[0] = 12;
        arr[1] = 120;
        arr[2] = 125;
        //arr[3] = 12;
        int[] newArr = new int[4];
        newArr[0]=arr[0];
        newArr[1]=arr[1];
        newArr[2]=arr[2];
        newArr[3] = 100;
        arr = newArr;
        System.out.println(arr[3]);
        System.out.println("Size of the arr after increase "+arr.length);

        System.out.println(Arrays.toString(arr));

        //write a method that takes an array and a number if number is present
        // inside that array delete it how create a new array of lesser size copy
        // elements and return it

        /*Issues i = new Issues();
        char[] a=i.methodArr(new int[]{1, 3, 45, 6, 67, 8, 9},  5);
        System.out.println(Arrays.toString(a));*/


    }
}
