package org.javaturk.oopj.ch08.overloading;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class OverloadingOverReturnType {
	
	public static void calculateExp(int base, int exp){
		System.out.println("calculateExp(int base, int exp)");
		double result = Math.pow(base, exp);
		System.out.println(base + " ^ " + exp + " = " + result);
	}
	
	public static void calculateExp(double base, int exp){
		System.out.println("calculateExp(double base, int exp)");
		double result = Math.pow(base, exp);
		System.out.println(base + " ^ " + exp + " = " + result);
	}
	
//  Can't overload over return type!	
//	public double calculateExp(double base, int exp){
//		System.out.println("calculateExp(double base, int exp)");
//		double result = Math.pow(base, exp);
//		System.out.println(base + " ^ " + exp + " = " + result);
//	}

	public static void main(String[] args) {
		calculateExp(5, 7);
		System.out.println();
		calculateExp(5d, 7);
	}

}
