package com.company.syntax.class26.abstaction;

public class FileTester {
    public static void main(String[] args) {

        /*File file = new PdfFile();
        file.open();
        file.edit();
        file.close();*/

        File[] file = {new JavaFile(), new WordFile(), new PdfFile()};
        for (File value:file) {
            value.open();
            value.edit();
            value.close();
        }
    }
}
