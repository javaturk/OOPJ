
package org.javaturk.oopj.ch13.string;

public class SubStringExample {
	
	public static void main(String[] args) {
		String s1 = "I love Java very much and I want to learn it very quickly";
		String s2 = "Java";
		System.out.println(s1.regionMatches(true, 0, s2, 0, s2.length()));
		System.out.println(s1.regionMatches(true, 7, s2, 0, s2.length()));
	}

}
