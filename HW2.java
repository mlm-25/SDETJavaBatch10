package com.syntax.class14;

public class HW2 {

	public static void main(String[] args) {

		String dadsName = "Daniel";
		String momsName = "Mary";
		String expectation = "girl";

		if (expectation.equalsIgnoreCase("boy")) {
			String firstHalf = dadsName.substring(0, dadsName.length() / 2);
			String secondHalf = momsName.substring(momsName.length() / 2);
			System.out.println(firstHalf + secondHalf);
		} else {
			String firstHalf = momsName.substring(0, momsName.length() / 2);
			String secondHalf = dadsName.substring(dadsName.length() / 2);
			System.out.println(firstHalf + secondHalf);
		}

	}
}
