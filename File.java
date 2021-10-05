package com.company.syntax.class26.abstaction;

public abstract class File {

    public void edit(){
        System.out.println("Edits file");
    }
    public void close(){
        System.out.println("Close file");
    }
    public abstract void open();
}
class JavaFile extends File{
    @Override
    public void open(){
        System.out.println("File opens in Java");
    }
}
class WordFile extends File{
    @Override
    public void open(){
        System.out.println("File opens in word");
    }
}
class PdfFile extends File{
    @Override
    public void open(){
        System.out.println("Pdf File opens");
    }
}

