package com.syntax.reviewclass06;

public class MethodsWithMultipleParam {

	void repeat(int times, String word) {
		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}
	
	void isThisBatchIntelligent(boolean isIntelligent) {
		if(isIntelligent) {
			System.out.println("Everyone will get a job ASAP");
		}else {
			System.out.println("Wait for ages");
		}
	}

	int add(int v1, int v2) {
		return v1+v2;
	}
	
	
	
}
