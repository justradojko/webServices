package com.radojko.fibonacci;

import javax.jws.WebService;

@WebService
public class Fibonacci {
	public int finbonacci(int n){
		int[] fibArray = new int[] {1, 1};
		int tempSum = 1;
		
		if (n < 0){
			throw new IllegalArgumentException();
		}
		
		if (n > 1) {
			for (int i = 2; i <= n; i++) {
				tempSum = fibArray[0] + fibArray[1];
				fibArray[0] = fibArray[1];
				fibArray[1] = tempSum;
			}
		}		
		return tempSum;
	}
}