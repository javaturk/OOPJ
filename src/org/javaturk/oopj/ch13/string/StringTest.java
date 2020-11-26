/**
 * 
 */
package org.javaturk.oopj.ch13.string;

/**
 * @author akin
 *
 */
public class StringTest {


	public static void main(String[] args) {
		String s = new String("Akin");
		s += "Kaldiroglu";
		s += " :)";
		
		StringBuilder sb = new StringBuilder("Akin");
		sb.append("Kaldiroglu");
		sb.append(" :)");
		String s2 = sb.toString();
		System.out.println(s + " \n" + s2);
	}

}
