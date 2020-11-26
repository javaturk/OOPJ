package org.javaturk.oopj.ch12.inheritance.hiding;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Parent {
	protected int i;
	protected boolean b;
	
	public Parent() {
		
	}
	
	public Parent(int i, boolean b) {
		this.i = i;
		this.b = b;
	}
	
	protected static void g(){
		System.out.println("g() in Parent");
	}
	
	/**
	 * Instance method.
	 */
	public void f() {
		System.out.println("f() in Parent");
	}
	
	protected void printInfo() {
		System.out.println("\nParent Info: ");
		System.out.println("i: " + i);
		System.out.println("b: " + b);
		g();
		Parent.g();
	}
}
