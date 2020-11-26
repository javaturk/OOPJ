package org.javaturk.oopj.ch03;

import java.util.Arrays;
import java.util.function.Predicate;

public class StackDemo {
	private static String[] methods = { "f", "g", "main", "u" }; // Must be sorted for Array.binarySearch to work
															     // correctly.
	private static int uCallCount;

	public static void main(String[] args) {
		printStackTrace(1);
		f();
		printStackTrace(7);
		u();
		printStackTrace(9);
	}

	public static void f() {
		printStackTrace(2);
		int i = 5;
		String s1 = new String("Java!");
		g(false);
		printStackTrace(4);
		g(true);
		i++;
	}

	public static void g(boolean b) {
		// g() is called twice by f().
		if (!b)
			printStackTrace(3);
		else
			printStackTrace(5);
		int i = 5;
		i++;

		String s1 = new String("Java!");
		if (b)  // called only for true b
			u();
	}

	public static void u() {
		if (uCallCount == 0) {
			printStackTrace(6);
			uCallCount++;
		} else
			printStackTrace(8);
		int i = 5;
		String s1 = new String("Java!");
	}

	public static void printStackTrace(int breakPoint) {
		System.out.println("================");
		System.out.println("Break Point " + breakPoint + " ||");
		Predicate<String> isInArray = s -> {
			int position = Arrays.binarySearch(methods, s);
			if (position >= 0)
				return true;
			else
				return false;
		};

		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		for (StackTraceElement element : stackTraceElements) {
			String methodName = element.getMethodName();
			if (isInArray.test(methodName))
				System.out.printf("%-13s %2s\n", methodName, "||");
		}
		System.out.println("================");
	}

//	public static void main(String[] args) {
//		f();
//		u();
//	}
//	
//	public static void f(){
//		int i = 5;
//		System.out.println(i);
//		String s1 = new String("Java!"); 
//		g(false);
//		g(true);
//	}
//	
//	public static void g(boolean b){
//		int i = 5;
//		System.out.println(i);
//		i++;
//		
//		String s1 = new String("Java!"); 
//		if(b)
//			u();
//	}
//	
//	public static void u(){
//		int i = 5;
//		System.out.println(i);
//		String s1 = new String("Java!"); 
//	}
//	
//	public static void printStackTrace() {
//		String s = Arrays.toString(Thread.currentThread().getStackTrace()));
//	}
}
