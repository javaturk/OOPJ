package org.javaturk.oopj.ch09.init.initializers;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class InitializerMethods {
	boolean isOpen = isDoorOpen();
//	boolean isOpen = isDoorOpenStatic(); // OK.
	
//	getPi must also be static
//	static double pi = getPi(); // Error!
	static double pi = getPiStatic();

//	No forward references!
//	int i = j;

//	But following is ok and it may cause a inconsistent state
	int i = getJ(); // i = 0;
	int j = 10;

	public static void main(String[] args) {
		InitializerMethods demo = new InitializerMethods();
		System.out.println("i: " + demo.i); // Should be 10
		System.out.println("j: " + demo.j);
		System.out.println("isOpen: " + demo.isOpen); // Should be true
		System.out.println("Pi: " + pi);
		System.out.println(demo.getPi());
	}
	
	double getPi() {
		return Math.PI;
	}
	
	static double getPiStatic() {
		return Math.PI;
	}

	boolean isDoorOpen() {
		if (i > pi)
			return true;
		else
			return false;
	}
	
	static boolean isDoorOpenStatic() {
		return true;
	}

	public int getJ() {
		return j;
	}
}
