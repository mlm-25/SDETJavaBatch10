package com.company.syntax.class25.polymorphismdemo;

public class WebDriver {
    void openBrowser(){
        System.out.println("Opening browser");
    }
    void loadWebsite(){
        System.out.println("load the website inside the browser");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order");
    }
    void TestFileDownload(){
        System.out.println("Testing file download");
    }
    void closeBrowser(){
        System.out.println("Close browser");
    }
}
class GoogleChrome extends WebDriver{
    void openBrowser(){
        System.out.println("Opening browser Google Chrome");
    }
    void loadWebsite(){
        System.out.println("load the website inside the browser Google Chrome");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login Google Chrome");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order Google Chrome");
    }
    void TestFileDownload(){
        System.out.println("Testing file download Google Chrome");
    }
    void closeBrowser(){
        System.out.println("Close browser Google Chrome");
    }
}
class FireFox extends WebDriver{
    void openBrowser(){
        System.out.println("Opening browser FireFox");
    }
    void loadWebsite(){
        System.out.println("load the website inside the browser FireFox");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login  FireFox");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order FireFox");
    }
    void TestFileDownload(){
        System.out.println("Testing file download FireFox");
    }
    void closeBrowser(){
        System.out.println("Close browser FireFox");
    }
}
class Safari extends WebDriver{
    void openBrowser(){
        System.out.println("Opening browser Safari");
    }
    void loadWebsite(){
        System.out.println("load the website inside the browser Safari");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login Safari");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order Safari");
    }
    void TestFileDownload(){
        System.out.println("Testing file download Safari");
    }
    void closeBrowser(){
        System.out.println("Close browser Safari");
    }
}
