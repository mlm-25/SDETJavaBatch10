package com.company.syntax.groupproject;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {

    }

    @Override
    public void close() {
        System.out.println("Opens with Google Chrome");
    }

    @Override
    public String getTitle() {
        return  "https://www.google.com/chrome/";
    }

    @Override
    public void navigate() {
        System.out.println("Navigates through Google Chrome");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Google Chrome can take screenshots");
    }
}
class Firefox implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opens Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closes Firefox");
    }

    @Override
    public String getTitle() {
        return "Firefox.com";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox can take Screenshots");
    }

    @Override
    public void navigate() {
        System.out.println("Navigates through Firefox");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opens Safari");
    }

    @Override
    public void close() {
        System.out.println("Closes Safari");
    }

    @Override
    public String getTitle() {
        return "www.Safari.com";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari acn take screenshots");
    }

    @Override
    public void navigate() {
        System.out.println("Navigates through Safari");
    }
}