package com.company.syntax.class26.abstaction;

public class PhoneTester {
    public static void main(String[] args) {
        //Phone phone = new Phone(); CE not possible to create object directly

        Phone phone = new Iphone();
        phone.makePhoneCall();
        phone.sendSMS();
        phone.takePictures();
        phone.unlock();

        CallAble callAble = new Iphone();



    }
}
