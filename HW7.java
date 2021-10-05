package com.syntax.class13;

public class HW7 {

	char avrage(int grade) {

		if (grade >= 90) {
			return 'A';
		} else if (grade < 90 && grade > 80) {
			return 'B';
		} else if (grade < 80 && grade > 70) {
			return 'C';
		} else if (grade < 70 && grade > 50) {
			return 'D';
		} else {
			return 'F';
		}

	}

}
