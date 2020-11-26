
package org.javaturk.oopj.ch13.string;

import java.util.StringTokenizer;

/**
 * @author akin
 *
 */
public class StringTokenizerExample {

	public static void main(String[] args) {
		String string = "This is a fun class!";
//		tokenizeStringUsignStringTokenizer(string);
		tokenizeStringUsignString(string);
	}

	public static void tokenizeStringUsignStringTokenizer(String s) {
		System.out.println("Tokenizing using StringTokenizer:");
		StringTokenizer st = new StringTokenizer(s, "a", true);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	public static void tokenizeStringUsignString(String s) {
		System.out.println("\nTokenizing using String:");
		String tokens[] = s.split(" ");
		for (String token : tokens)
			System.out.println(token);
	}
}
