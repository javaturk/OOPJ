
package org.javaturk.oopj.ch13.string;

/**
 * @author akin
 *
 */
public class StringBufferAndStringBuilderExample {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();
		processString(sb1);
		System.out.println();
		processString(sb2);
	}

	private static void processString(StringBuilder sb) {
		sb.append("I love Java very much!");
		System.out.println("Reverse: " + sb.reverse());
		System.out.println("Replace: " + sb.replace(11, 15, "++C"));
		System.out.println("Reverse: " + sb.reverse());
		sb.append(" How ");
		sb.append("about ");
		sb.append("you?");
		System.out.println(sb);
		sb.setCharAt(20, ',');
		System.out.println(sb);
		sb.delete(21, sb.length());
		System.out.println(sb);
		sb.replace(sb.length() - 1, sb.length() + 2, " :)");

		String finalString = sb.toString();
		System.out.println(finalString);
	}
	
	private static void processString(StringBuffer sb) {
		sb.append("I love Java very much!");
		System.out.println("Reverse: " + sb.reverse());
		System.out.println("Replace: " + sb.replace(11, 15, "++C"));
		System.out.println("Reverse: " + sb.reverse());
		sb.append(" How ");
		sb.append("about ");
		sb.append("you?");
		System.out.println(sb);
		sb.setCharAt(20, ',');
		System.out.println(sb);
		sb.delete(21, sb.length());
		System.out.println(sb);
		sb.replace(sb.length() - 1, sb.length() + 2, " :)");

		String finalString = sb.toString();
		System.out.println(finalString);
	}
}
