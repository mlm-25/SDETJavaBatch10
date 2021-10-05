package com.company.syntax.class27.encapsulationdemo1;

public class BankAccount {
    private String name;
    private double balance;
    private String userName;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>20){
            System.out.println("Please reduce the length of the name");
        }else if(name.replaceAll("[^A-Z a-z]","").length()!=name.length()){
            System.out.println("Special characters and numbers are not allowed in name");
        }else{
            this.name=name;
        }
    }

    public double getBalance(String password) {
        if(this.password.equals(password)){
            return balance;
        }else{
            return -1;
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
