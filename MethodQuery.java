package com.syntax.reviewclass06;

public class MethodQuery {

	double getMaximumValue(double v1, double v2) {
		
		if (v1 > v2) {
			return v1;
		} else if (v1 < v2) {
			return v2;
		}
		return 0;
	}

}
