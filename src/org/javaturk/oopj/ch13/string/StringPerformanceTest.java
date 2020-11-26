
package org.javaturk.oopj.ch13.string;

/*
 * Method               100,000		1,000,000	   10,000,000
 * --------------------------------------------------------------
 * String				15692
 * StringBuilder		       17			56			   410
 * StringBuffer			   17			71		       601	
 */
public class StringPerformanceTest {

	public static void main(String[] args) {
//		buildStringWithPlus("Java", 100_000);
//		buildStringWithStringBuilder("Java", 100_000);
		buildStringWithStringBuffer("Java",  100_000);
	}

	public static void buildStringWithPlus(String string, int count) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			string = string + i;
		}
		long end = System.currentTimeMillis();
		System.out.println("buildStringWithPlus: Time to build string is " + (end - start) + " ms.");
		System.out.println("String length: " + string.length());
	}

	public static void buildStringWithStringBuilder(String string, int count) {
		StringBuilder sb = new StringBuilder(string);
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("buildStringWithStringBuilder: Time to build string is " + (end - start) + " ms.");
		System.out.println("String length: " + sb.toString().length());
	}

	public static void buildStringWithStringBuffer(String string, int count) {
		StringBuffer sb = new StringBuffer(string);
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("buildStringWithStringBuffer: Time to build string is " + (end - start) + " ms.");
		System.out.println("String length: " + sb.toString().length());
	}
}
