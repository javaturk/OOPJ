package org.javaturk.oopj.ch12.inheritance.overriding;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class RestrictiveOverrding {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.f();
		System.out.println(p.i);

		Child c = new Child();
		c.f();
//		System.out.println(c.i);
	}
}

class Parent {
	public int i = 8;

	public void f() {
	}
}

class Child extends Parent {
	private int i = 9;

	public void f() {
	}
}
