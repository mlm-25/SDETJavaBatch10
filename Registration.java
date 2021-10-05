package com.company.syntax.groupproject;

public class Registration {
    String email;
    String userName;
    String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        if(email.contains("yahoo") || email.contains("Yahoo") ){
            System.out.println("Valid email");
        }else {
            System.out.println("Not Allowed Please use yahoo.com");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        if(userName.isEmpty() && userName.length()<6){
            System.out.println("Username is invalid");
        }else{
            System.out.println("Username is valid");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if(password.isEmpty() || password.length()<6 || password.contains(userName)){
            System.out.println("Password is invalid");
        }else{
            System.out.println("Password is valid");
        }
    }
}
