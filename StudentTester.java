package com.syntax.reviewclass06;

public class StudentTester {
	
	public static void main(String[] args) {
		
		Student bilal = new Student();
		bilal.name="Ahamad";
		bilal.id="99";
		bilal.gender='M';
		bilal.school="Syntax";
		bilal.tuition=15000;
		bilal.study();
		bilal.payTuition();
		
		Student serge = new Student();
		serge.name="Casisan";
		serge.id="98";
		serge.gender='M';
		serge.school="Syntax";
		serge.tuition=10000;
		serge.study();
		serge.payTuition();
		
		
		
	}

}
