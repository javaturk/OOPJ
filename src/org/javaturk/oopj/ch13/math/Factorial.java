package org.javaturk.oopj.ch13.math;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of which factorial will be calculated:");
		int limit = in.nextInt();
		
		calculateFactorialWithLong(limit);
		calculateFactorialWithBigInteger(limit);
	}
	
	public static void calculateFactorialWithLong(int n){
		long factorial = 1;
		for(int i = 2; i < n; i++)
			factorial *= i;
		System.out.println("Factorial of " + n + ": " + factorial);
	}
	
	public static void calculateFactorialWithBigInteger(int n){
		BigInteger factorial = BigInteger.ONE;
		for(int i = 2; i < n; i++)
			factorial = factorial.multiply(BigInteger.valueOf(i));
		System.out.println("Factorial of " + n + ": " + factorial);
	}

}
