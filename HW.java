package com.syntax.class15;

public class HW {
	
	public static void main(String[] args) {
		
		//Task 1
		String sentence = "I am a Syntax Student.";
		System.out.println(sentence);
		System.out.println(sentence.replaceAll(" ", ""));
		
		System.out.println("--------------");
		
		//Task 2
		String special = "assdfghAFDHDKDNSjkl1234567890!@#$%^%^&*";
		System.out.println(special);
		System.out.println(special.replaceAll("[a-z A-Z 0-9]",""));
		System.out.println(special.replaceAll("[a-z A-Z 0-9]","").length());
		
		System.out.println("--------------");
		
		//Task 3
		String a ="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] b = a.split("[?]");
		System.out.println(b.length);
		
		System.out.println("--------------");
		
		//Task4
		String rev = "Mauricio";
		System.out.println(rev);
		char[] c =rev.toCharArray();
		for(int i = c.length - 1; i>= 0 ; i--) {
			System.out.print(c[i]);
		}
		
		System.out.println();
		System.out.println("--------------");
		
		//Task 5 
		String d = "I like to practice Java on the weekends.";
		System.out.println(d);
		StringBuilder reversed = new StringBuilder(d);
		System.out.println(reversed.reverse());
		
		
		
		System.out.println("--------------");
		
		//Task 7
		String str1 = "This is my first string";
		String str2 = "This is my second string";
		System.out.println("Before swap");
		System.out.println("var1-->"+str1);
		System.out.println("var2-->"+str2);
		
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length()- str2.length());
		str1 = str1.substring(str2.length());	
		System.out.println("After sawp");
		System.out.println("var1-->"+str1);
		System.out.println("var2-->"+str2);
		
	}

}
