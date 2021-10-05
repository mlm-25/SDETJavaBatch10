package com.syntax.reviewclass06;

public class MethodsWithMultipleParamTester {
	
	public static void main(String[] args) {
		
		MethodsWithMultipleParam methods = new MethodsWithMultipleParam();
		//methods.repeat(10, "Automation");
		//System.out.println("----------");
		methods.repeat(4, "Syntax");
		methods.isThisBatchIntelligent(false);
		methods.isThisBatchIntelligent(true);
		
		int sum = methods.add(15, 20);
		System.out.println(sum);
		
		
		
	}

}
