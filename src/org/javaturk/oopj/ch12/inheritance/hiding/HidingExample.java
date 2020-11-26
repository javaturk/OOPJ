package org.javaturk.oopj.ch12.inheritance.hiding;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class HidingExample {

	public static void main(String[] args) {
//		Parent p = new Parent(10, true);
//		System.out.println("p.i: " + p.i);
//		Parent.g();
//		p.printInfo();
//		
//		System.out.println();

		Child c = new Child(20, false, 30, (byte) 120, 40);
		System.out.println("c.i: " + c.i);
//		System.out.println(c.super.i); // Can't say this!
		c.printInfo();	// Inherited method
		
		c.printInfoUsingSuper();
	}
}
