package com.company.syntax.class25.polymorphismdemo;

public class Tester {
    public static void main(String[] args) {

        WebDriver[] webDrivers = {new GoogleChrome(), new FireFox(), new Safari()};
        for(WebDriver driver: webDrivers){
            testOnAllBrowsers(driver);
        }

    }
    static void testOnAllBrowsers(WebDriver webDriver){
        webDriver.openBrowser();
        webDriver.loadWebsite();
        webDriver.Test1();
        webDriver.Test2();
        webDriver.TestFileDownload();
        webDriver.closeBrowser();
    }
}
