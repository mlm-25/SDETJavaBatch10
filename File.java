package com.company.syntax.reviewclass11;

public  abstract class File {
    /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need
    Microsoft word to be installed etc
     */
    public abstract void open();

    public void edit(){
        System.out.println("I am here to edit files");
    }

    public void close(){
        System.out.println("I am here to close the file");
    }
}
class JavaFile extends File{
    @Override
    public void open() {
        System.out.println("Java file is opened in java class");
    }
}
class PDFFile extends File implements CheckInterfaceOne, CheckInterfaceTwo{

    @Override
    public void open() {
        System.out.println("Opening pdf in pdf file class");
    }

    @Override
    public void testMethod() {
        System.out.println("Method tested");
    }

    @Override
    public void testMethodInSecondInterface() {
        System.out.println("Method tested from interface two");
    }
}
class WordFile extends File{

    @Override
    public void open() {
        System.out.println("Opening word file in word class");
    }
}