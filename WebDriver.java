package com.company.syntax.class27.task;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Google Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Google Chrome Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements in Google Chrome");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Firefox Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements in Firefox");
    }
}