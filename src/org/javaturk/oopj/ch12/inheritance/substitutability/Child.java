package org.javaturk.oopj.ch12.inheritance.substitutability;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Child extends Parent {
//	protected int i = 5;	// Hiding b of Parent
//	protected boolean b = true;	// Hiding b of Parent
//	protected static String s = "Child"; // Hiding b of Parent
	
	private int i = 5;	// Hiding b of Parent
	private boolean b = true;	// Hiding b of Parent
	private static String s = "Child";
	
	public static void f(){
		System.out.println("f() in Child");
	}
	
	public void g() {
		System.out.println("g() in Child");
	}
}
