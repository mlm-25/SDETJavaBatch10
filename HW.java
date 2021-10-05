package com.syntax.class14;

import java.util.Scanner;

public class HW {

	String username;
	String password;
	String reEnter;

	void accountCreation(String username, String password, String reEnter) {
		System.out.println("Create a username");
		System.out.println(username);
		System.out.println("Create a password");
		
		if (!(password.length() >= 8)) {
			System.out.println("Password is too short");
		} else {

			if (!password.contains(username)) {
				System.out.println("Renter password");

				if (password.equals(reEnter)) {
					System.out.println("Your user name and password has been created");
				} else {
					System.out.println("Passwords do not match");
				}
			}else {
				System.out.println("Password cannot contain username");
			}

		}

	}
}
