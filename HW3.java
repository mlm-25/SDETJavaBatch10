package com.syntax.class13;

public class HW3 {

	String palindrome(char a, char b, char c, char d, char e) {
		String String = null;

		char[] array = new char[5];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		array[3] = d;
		array[4] = e;

		for (int i = 0; i < array.length; i++) {

			if (a == e && b == d) {

				return "Palindrome";

			} else if (!(a == e) || !(b == d)) {

				return "Not Palindrome";
			}
			return null;

		}
		return String;

	}

}
