package com.syntax.reviewclass06;

public class StringPart1 {
	
	public static void main(String[] args) {
		
		String str = "Hello";
		String str2 = new String("Hello");
		
		System.out.println(str.length());
		System.out.println(str2.length());
		
		// to convert the string into upper case
		String name = "My name is aka naughty boy";
		System.out.println(name.toUpperCase());
		
		//to convert the string into lower case
		String name2 = "MY NAME IS BILAL";
		System.out.println(name2.toLowerCase());
		
		// add 2 strings together
		String firstName= "Micheal";
		String secondName= "Bilal";
		
		System.out.println(firstName.concat(" ").concat(secondName));
		System.out.println(firstName+" "+secondName);
		
		//isEmpmty
		String batch = "";
		boolean results= batch.isEmpty();
		System.out.println(results);
		
		//to remove the white spaces from the string
		String newString="       Batch10      ";
		System.out.println(newString);
		System.out.println(newString.trim());
		
		String newS= "Batch 10";
		System.out.println(newS.replace(" ", ""));
		
		String longString = "This is SDET batch";
		System.out.println(longString.startsWith("T"));
		System.out.println(longString.startsWith("S"));
		
		
	}

}
