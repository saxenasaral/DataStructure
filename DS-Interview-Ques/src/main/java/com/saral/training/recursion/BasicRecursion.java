package com.saral.training.recursion;

public class BasicRecursion {

	//print 1 to 100
	static void printHundered(int n){
		
		if(n<1){
			return;
		}
		
		printHundered(n-1);
		// stay
		System.out.println(n);
		
	}
	
	//print fabinocci series
	static int printFabinocci(int n){
		if(n<=2){
			return 1;
		}
		else{
			return printFabinocci(n-1)+printFabinocci(n-2);
		}
	}
	
	static int printFactorial(int n){
		if(n<1){
			return 1;
		}
		n=n*printFactorial(n-1);
		return n;
	}
	
	
	
	
	public static void main(String[] args) {
	//	printHundered(100);
	//	System.out.println(printFabinocci(8));
		System.out.println(printFactorial(5));
	}

}
