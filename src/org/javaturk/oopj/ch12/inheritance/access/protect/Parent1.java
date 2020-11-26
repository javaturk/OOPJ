package org.javaturk.oopj.ch12.inheritance.access.protect;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Parent1{
	public int x = 10;
	int y = 20;
	protected int t = 30;
	private int z = 40;
	
	public static int sx = 10;
	static int sy = 20;
	protected static int st = 30;
	private static int sz = 40;
    
	public void f() {
		System.out.println("f in Parent1");
	}
	
	void g() {
		System.out.println("g in Parent1");
	}
	
	protected void u() {
		System.out.println("u in Parent1");
	}
	
	private void v() {
		System.out.println("v in Parent1");
	}
	
	public static void sf() {
		System.out.println("sf in Parent1");
	}
	
	static void sg() {
		System.out.println("sg in Parent1");
	}
	
	protected static void su() {
		System.out.println("su in Parent1");
	}
	
	private static void sv() {
		System.out.println("sv in Parent1");
	}
}