package org.javaturk.oopj.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example that shows bitwise logical operators.
 */
public class BitwiseLogicalOperators {

	public static void main(String[] args) {
		
		int i = 4; // 0100
		int j = 8; // 1000
		
		int k = i & j;
		System.out.println(i + " & " + j + " = " + k);
		System.out.println(getBinary(i) + " & " + getBinary(j) + " = " + getBinary(k));
		
		System.out.println();
		
		k = i | j;
		System.out.println(i + " | " + j + " = " + k);
		System.out.println(getBinary(i) + " & " + getBinary(j) + " = " + getBinary(k));
		
		System.out.println();
		
		k = i ^ j;
		System.out.println(i + " ^ " + j + " = " + k);
		System.out.println(getBinary(i) + " & " + getBinary(j) + " = " + getBinary(k));
		
		System.out.println();
		
		long u = 6; // 0110
		long v = 2; // 0010
//		int w = u & v; // Needs cast!
//		int w = (int) (u & v);
		long w = u & v;
		System.out.println(u + " & " + v + " = " + w);
		System.out.println(getBinary(u) + " & " + getBinary(v) + " = " + getBinary(w));
		
		System.out.println();
		
		byte m = 6;
		byte n = 2;
//		byte l = m & n;
		byte l = (byte) (m & n);
		System.out.println(m + " & " + n + " = " + l);
		System.out.println(getBinary(m) + " & " + getBinary(n) + " = " + getBinary(l));
		
		System.out.println();
		
		long cL = ~l;
		System.out.println("l  = " + l + ", cL = " + ~l);
		System.out.println("l = " + getBinary(l) + ", ~l = " + getBinary(cL));
	}
	
	public static String getBinary(int l) {
		return Integer.toBinaryString(l);
	}
	
	public static String getBinary(long l) {
		return Long.toBinaryString(l);
	}
}
