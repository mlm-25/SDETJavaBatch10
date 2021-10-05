package com.company.syntax.class33.hw;

import java.util.Scanner;

public class Task2 {
    /*
    Create a method checkUserName that will throw a runtime exception.
    Method should throw an exception when entered username is less than 5 characters.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a username");
        try{
            String userName = scan.nextLine();
            if(userName.length()>=5){
                System.out.println(userName+" is a valid username");
            }else{
                System.out.println(0/0);
            }

        }catch(Exception e ){
            System.out.println("Exception username is less than 5 characters");
        }
    }
}
