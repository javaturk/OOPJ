
package org.javaturk.oopj.ch13.string;

/**
 * @author akin
 *
 */
public class StringEquality {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + (s1.equals(s2)));
		
		System.out.println();
		
		String s3 = "Java";
		String s4 = "Java";
		System.out.println("s3 == s4 : " + (s3 == s4));
		System.out.println("s3.equals(s3) : " + (s3.equals(s4)));
		
		System.out.println();
		
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1.equals(s3) : " + (s1.equals(s3)));
	}
}
