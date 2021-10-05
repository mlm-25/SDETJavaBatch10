package com.syntax.class13;

public class HW4 {

	String greeting(String country) {

		String hello = null;
		switch (country) {

		case "USA":
			hello = "Hello";
			break;
		case "Spain":
			hello = "Hola";
			break;
		case "Italy":
			hello = "Ciao";
			break;
		case "Brazil":
			hello = "Ola";
			break;
		default:
			hello = "Invalid Country";
			break;

		}
		return hello;

	}

}
