package org.javaturk.oopj.ch12.inheritance.substitutability;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Parent {
	protected int i = 3;
	protected boolean b = false;
	protected static String s = "Parent";
	
	public static void f(){
		System.out.println("f() in Parent");
	}
	
	public void g() {
		System.out.println("g() in Parent");
	}
}
