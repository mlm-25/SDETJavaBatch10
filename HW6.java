package com.syntax.class13;

public class HW6 {

	String number(int num){
		
		boolean prime = false;
		for (int i = 2; i < num / 2; ++i) {

			if (num % i == 0) {
				prime = true;
				break;
			}
		}
		if (!prime)
			return (num + " is a prime number.");
		else
			return (num + " is not a prime number.");
		
	}
		
	}
	
	

