package com.company.syntax.class27.interfacedemo1;

public interface HasTail {
    int getTailLength();

 }

 abstract class Puma implements HasTail {}

 class Cougar extends Puma {

 public int getTailLength() {

         return 4;}

 public int getTailLength(int length) {

         return 2;}
}
