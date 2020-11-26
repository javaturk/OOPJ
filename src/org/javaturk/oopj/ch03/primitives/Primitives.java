package org.javaturk.oopj.ch03.primitives;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Primitives {

	public static void main(String[] args) {
		// Variables
		int anInteger = 18;
		boolean bool = false;
		float sin30 = 0.6f;
		double pi = 3.141_5;
		char char1 = 'c';
		char char2 = '\u221d';
		char char3 = '\u03b2';
		char char4 = '\u0393';
		char nextLine = '\n';
		System.out.println(anInteger + " " + bool + " " + sin30);
		System.out.print(nextLine);
		System.out.println(pi + " " + char1);
		System.out.println(char2 + " " + char3 + " " + char4);

		// Naming
		float corporateCustomerSalesAmount;
		boolean seatBooked;
		char sex;

		int _count;
		float $amount;
		float €total;
		double £Sales;
		double ₺accruedInterest;

		// Wrong naming
		// float x!;
		// int ?i;
		// boolean new;
		// char {oneCharacter};
		// short shorty-pant;
		// long white\black;
		// int _ = 5; // Java 1.8'den itibaren "-" reserved word olmuştur.

		float f;
		double d;
		f = 22f / 7;
		d = 22d / 7;
		System.out.println(f + " - " + d);

		// Many on one line but that's not a good practice!
		double price = 10.27, tax = 0.18, total = price * tax;

		// Many with different types on one line but that's not a good practice!
		double speed = 12.22;
		int time = 14;
		double distance = speed * time;

		// You can do such a weird definition, but don't even think about it!
		int yyyy 
		
		          = 
		                 44;

		// More complex ones
		// Using an operator.
		int hour = 22;
		boolean areLightsOn = hour > 18;

		// By a method call..
		long aLong = returnLong();

		// Exponentials
		double d1 = 1.6e-19;
		float f1 = 6.02E23F;
		System.out.println(d1 + " " + f1);
		
		int iii = 0Xeee10;
		System.out.println("GARİPPP: " + iii);

		// Overflows
		double lowestInt = -Math.pow(2, 31);
		double highestInt = Math.pow(2, 31) - 1;
		System.out.println("Range of int is from " + lowestInt + " to " + highestInt);
		
		double lowestLong = -Math.pow(2, 63);
		double highestLong = Math.pow(2, 63) - 1;
		System.out.println("Range of long is from " + lowestLong + " to " + highestLong);

		// byte b = 128;
		// long lo1 = 2147483648;
		long lo2 = 2147483648L;

		float lowestfloat = 1.40e-45f;
		float biggestfloat = 3.4028235e38f;
		System.out.println(lowestfloat + " - " + biggestfloat);

		double lowestDouble = 4.9e-323; // 1.40129846432481707e-45
		double biggestDouble = 1.7976931348623158e308;
		System.out.println(lowestDouble + " - " + biggestDouble);

		/*
		 * double lowestDouble1 = -Math.pow(2, 63); double highestDouble = Math.pow(2,
		 * 63) - 1; System.out.println("Range of double is from " + lowestDouble1 +
		 * " to " + highestDouble);
		 */

		double elementaryCharge = 1.6e-19;
		float avagadroNumber = 6.02E23F;
		System.out.println(elementaryCharge + " " + avagadroNumber);
		
		//int ten = 1e1; // Error
	}

	public static long returnLong() {
		return 5L;
	}
}
