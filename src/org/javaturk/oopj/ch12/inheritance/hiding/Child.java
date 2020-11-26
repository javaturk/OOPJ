package org.javaturk.oopj.ch12.inheritance.hiding;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Child extends Parent {
	protected int i; 	// Hiding i of Parent
	protected byte b;	// Hiding b of Parent
	protected double d;

	public Child(int i1, boolean b1, int i2, byte b2, double d) {
//		super(i1, b1);
		super();
		super.i = i1;
		super.b = b1;
		i = i2;
		b = b2;
		this.d = d;
	}

	/**
	 * This is hiding.
	 * Remove "static" keyword and try to override a static method in parent. It is an error!
	 */
	public static void g() {
		System.out.println("g() in Child");
	}
	
	// When static is removed from g() it tries to override static method pf Parent.
//	public void g() {
//		
//	}
	
	/**
	 * A static method in the child class can't hide an instance method of the parent class.
	 */
//	public static void f() {
//		System.out.println("g() in Child");
//	}

	/**
	 * This is not hiding, this is overriding.
	 */
	public void printInfo() {
		System.out.println("\nChild Info: ");
		System.out.println("i: " + i);
		System.out.println("super.i: " + super.i);
		System.out.println("b: " + b);
		System.out.println("super.b: " + super.b);
		System.out.println("d: " + d);
		g();
		System.out.println();
		super.g();
		Parent.g();
	}
	
	public void printInfoUsingSuper() {
		System.out.println("\nChild Info Using Super: ");
		System.out.println("i: " + i);
		System.out.println("b: " + b);
		System.out.println("d: " + d);
		g();
		
		super.printInfo();
	}
}
