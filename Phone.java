package com.company.syntax.class26.abstaction;

public abstract class Phone {
    public void makePhoneCall(){
        System.out.println("Calling");
    }
    public void sendSMS(){
        System.out.println("Sending a message");
    }
    public abstract void takePictures();
    public abstract void unlock();
}
class Iphone extends Phone implements CallAble{
    public void method(){}
    @Override
    public void takePictures(){
        System.out.println("Take pictures with 12Mega pixel camera");
    }
    public void unlock(){
        System.out.println("unlocks with face id");
    }
}
class Samsung extends Phone{
    public void takePictures(){
        System.out.println("Take pictures with 108 Mega pixel camera");
    }
    public void unlock(){
        System.out.println("unlock using fingerprint");
    }
}