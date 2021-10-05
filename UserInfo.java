package com.company.syntax.class23;

public class UserInfo extends UserClass{
    String address;

    UserInfo(String name, String mobileNumber, String address){
        super(name, mobileNumber);
        this.address=address;
    }
    void userDetails(){
        System.out.println(name+" "+mobileNumber+" "+address);
    }

    public static void main(String[] args) {
        UserInfo userInfo=new UserInfo("Masoud", "13546", "afkabf");
        userInfo.userDetails();
    }
}
