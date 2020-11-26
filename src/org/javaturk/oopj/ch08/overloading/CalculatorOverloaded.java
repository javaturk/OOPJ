package org.javaturk.oopj.ch08.overloading;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class CalculatorOverloaded {

	int add(byte first, byte second) {
		System.out.println("Arguments are in byte");
		return first + second;
	}

	int add(short first, short second) {
		System.out.println("Arguments are in short");
		return first + second;
	}

	int add(char first, char second) {
		System.out.println("Arguments are in char");
		return first + second;
	}

	int add(int first, int second) {
		System.out.println("Arguments are in int");
		return first + second;
	}

	long add(long first, long second) {
		System.out.println("Arguments are in long");
		return first + second;
	}
	
	long add(short first, long second) {
		System.out.println("Arguments are in short");
		return first + second;
	}

	float add(float first, float second) {
		System.out.println("Arguments are in float");
		return first + second;
	}

	double add(double first, double second) {
		System.out.println("Arguments are in double");
		return first + second;
	}

	public static void main(String[] args) {

		CalculatorOverloaded calculator = new CalculatorOverloaded();
		byte b1 = 18;
		byte b2 = -7;
		System.out.println(calculator.add(b1, b2));
		
		double d1 = 3.1415;
		double d2 = 2.71828;
		System.out.println(calculator.add(d1, d2));
		
		byte s = 33;
		long l1 = 4;
		System.out.println(calculator.add(s, l1));
		
		double d3 = 3.1415;
		long l2 = 4;
		System.out.println(calculator.add(d1, l2));
	}
}
