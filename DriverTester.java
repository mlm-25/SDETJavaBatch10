package com.company.syntax.groupproject;

public class DriverTester {
    public static void main(String[] args) {
        RemoteWebDriver remoteWebDriver = new ChromeDriver();
        remoteWebDriver.open();
        remoteWebDriver.navigate();
        System.out.println(remoteWebDriver.getTitle());
        remoteWebDriver.getScreenshot();
        remoteWebDriver.close();
        System.out.println();

        RemoteWebDriver remoteWebDriver1 = new Firefox();
        remoteWebDriver1.open();
        remoteWebDriver1.navigate();
        System.out.println(remoteWebDriver1.getTitle());
        remoteWebDriver1.getScreenshot();
        remoteWebDriver1.close();
        System.out.println();


        RemoteWebDriver remoteWebDriver2 = new SafariDriver();
        remoteWebDriver2.open();
        remoteWebDriver2.navigate();
        System.out.println(remoteWebDriver2.getTitle());
        remoteWebDriver2.getScreenshot();
        remoteWebDriver2.close();
    }
}
