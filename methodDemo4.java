package com.company.syntax.reviewclass07;

public class methodDemo4 {
    public static void main(String[] args) {
        String test = "Automation jobs are in high demand";

        String[] atrArr = test.split(" ");
        System.out.println(atrArr[0]);
        System.out.println(atrArr[1]);
        System.out.println(atrArr[4]);

        for(String string: atrArr){
            System.out.println(string);
        }

        String testOne = "%Automation%jobs%are%in%high%demand";

        String[] strArr = testOne.split("[%]");
        System.out.println(strArr.length);

    }
}
