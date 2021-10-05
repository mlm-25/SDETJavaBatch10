package com.company.syntax.class32.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadingDemo1 {

    public static void main(String[] args) throws IOException {
        //location of the file
        String path = "C:\\Users\\young\\IdeaProjects\\OOPS\\Files\\Config.properties";
        //creating a connection between class or navigation to that file
        FileInputStream inputStream = new FileInputStream(path);
        //choosing a program to open that file
        Properties properties = new Properties();
        //opening the file
        properties.load(inputStream);
        //Reading the data
        System.out.println(properties.get("UserName"));
        System.out.println(properties.get("Password"));
    }
}
