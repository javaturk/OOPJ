package org.javaturk.oopj.ch08.varArg;

public class VarArgMethodProblem {
	public static void main(String[] args) {
//		f(1, 2, 3); // Ambiguous call

		int a[] = { 2, 3 };
//		f(1, a);
//
//		f(1, 2, a); // No problem!
		
		f(a);
		
		f(4);
		
		f(4, 5);
		
//		f(4, 5, 6);
	}
	

	public static void f(int ... args) {
		System.out.println("f(int ... args)");
	}
	
//	public static void f(int ... args, int k) {
//		System.out.println("f(int ... args)");
//	}
	
//
//	public static void f(int i, int ... args) {
//		System.out.println("f(int i, int ... args)");
//	}
//
//	public static void f(int i, int j, int... args) {
//		System.out.println("f(int i, int ... args)");
//	}
}
