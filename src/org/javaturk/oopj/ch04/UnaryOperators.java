package org.javaturk.oopj.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example about unary operators.
 */
public class UnaryOperators {

	public static void main(String args[]) {
		unaryOperators();
//		unaryPromotion();
	}
	
	/**
	 * Learn use of + and - as unary operators.
	 */
	public static void unaryOperators(){
//		-5; // Error!
		int a = 3;
//		+a; // Error!
//		-a; // Error! 
		
		int i = -5;
		int j = +i;
		int k = -i;
		int l = +-5;
		prt("i: " + i + " j: " + j + " k: " + k + " l: " + l);
		
		int m = +-7;
		int n = -+9;
		int o = - -11; // Better to write - (-11)
		int p = -(-13);
		prt("m: " + m + " n: " + n + " o: " + o + " p: " + p);
	}

	public static void unaryPromotion() {
		byte b1 = 18;
		short s1 = 44;
		
//		byte b2 = +b1;   // Error! Need a cast
		byte b2 = (byte) +b1;
		
//		b2 = -b1;   // Error! Need a cast
		b2 = (byte) -b1;
		
//		short s2 = -s1;  // Error! Need a cast
		short s2 = (short) -s1;
		
		int i = 7;
//		byte b3 = -i;    // Error! Need a cast
		byte b3 = (byte) -i;
		
		prt("b2: " + b2);
		prt("s2: " + s2);
		prt("b3: " + b3);
		
		byte b4 = ++b1; // OK. No need to implicitly cast
		short s4 = --s1; // OK. No need to implicitly cast
		prt("b4: " + b4);
		prt("s4: " + s4);
		
		long l = 5;
		l = -l;
		System.out.println(l);

		boolean isTrue = true;
		isTrue = !isTrue;
		// !isTrue; // compiler error:
	}

	static void prt(String s) {
		System.out.println(s);
	}
}
