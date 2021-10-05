package com.syntax.class14;

public class StringMethodDemo2 {
	
	public static void main(String[] args) {
		
		String name = " ";
		System.out.println(name.isEmpty());
		name="";
		System.out.println(name.isEmpty());

		
		
		String str="       Hi there     ";
		System.out.println(str);
		System.out.println(str.trim());
		
		String longStr="This class is easy";
		System.out.println(longStr.startsWith("T"));
		System.out.println(longStr.startsWith("t"));
		System.out.println(longStr.startsWith("This"));

	}

}
