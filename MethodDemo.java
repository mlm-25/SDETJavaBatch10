package com.company.syntax.reviewclass07;

public class MethodDemo {

    public static void main(String[] args){
        String employeeFirstName = "Michael";
        String employeeLastName = "Lopez";
        String level = "permanent";

        if(level.equalsIgnoreCase("permanent")){
            String firstHalfOfFirstName = employeeFirstName.substring(0, employeeFirstName.length()/2);
            String secondHalfOfLastName = employeeLastName.substring(employeeLastName.length()/2);
            System.out.println(firstHalfOfFirstName+secondHalfOfLastName);
        }else{
            String firstHalf = employeeLastName.substring(0, employeeLastName.length()/2);
            String firstHalfOfLastName = employeeFirstName.substring(employeeFirstName.length()/2);
            System.out.println(firstHalf+firstHalfOfLastName);
        }

    }

}
