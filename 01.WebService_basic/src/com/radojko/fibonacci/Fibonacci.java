package com.radojko.fibonacci;

import javax.jws.WebService;

@WebService
public class Fibonacci {
	public void constructor(){
		
	}
	
	public int finbonacci(int n){
		int[] fibArray = new int[] {1, 1};
		int tempSum = 1;
		
		if (n < 0){
			throw new IllegalArgumentException();
		}
		
		if (n == 0){
			return 0;
		}
		
		if (n > 2) {
			for (int i = 3; i <= n; i++) {
				tempSum = fibArray[0] + fibArray[1];
				fibArray[0] = fibArray[1];
				fibArray[1] = tempSum;
			}
		}		
		return tempSum;
	}
}
