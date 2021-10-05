package com.syntax.class15;

public class StringMethodDemo {
	
	public static void main(String[] args) {
		
		String str="I am a good tester. I am a good person";
		System.out.println(str.replace("a", "A"));
		System.out.println(str.replace("good", "Naughty"));
		
		String str2="sksakdAHDKFCGC65435698!@#$%&&*%$%#*";
		System.out.println(str2.replaceAll("[0-9]", "+")); // will replace all the numbers from 0-9 in the string
		System.out.println(str2.replaceAll("[A-Z]", "")); // will remove all the upercase letters from A-Z from string
		System.out.println(str2.replaceAll("[a-z]", ""));
		System.out.println("--------------------------");
		System.out.println(str2.replaceAll("[a-z 5-9]", "")); // will remove all lowecase leters from a-z from string
		System.out.println(str2.replaceAll("[a-z 5-9 A-Z]", "")); // will remove a letters and numbers from 5-9 from string
		System.out.println(str2.replaceAll("[^a-z 5-9 A-Z]", ""));
		System.out.println(str2.replaceAll("[^a-z 5-9 A-Z]", ""));
		
		
	}

}
