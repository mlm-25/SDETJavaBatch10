package com.syntax.class14;

public class HW4 {

	public static void main(String[] args) {

		String name = "Sunday";

		String reversed = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			
			reversed+=name.charAt(i);

		}
		
		System.out.println(reversed);

	}

}
