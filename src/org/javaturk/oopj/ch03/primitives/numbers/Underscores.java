package org.javaturk.oopj.ch03.primitives.numbers;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class Underscores {

	public static void main(String[] args) {

		int anInt = 10_000_000;
		System.out.println(anInt);
		
		int anotherInt = 10_00_00;
		System.out.println(anotherInt);
		
		int otherInt = 10__0_0____0_0;
		System.out.println(otherInt);
		
		int otherInt2 = 1________0;
		System.out.println(otherInt2);
		
		int otherInt3 = 0________0;
		System.out.println(otherInt3);

		long aLong = 2_147_483_648L;
		System.out.println(aLong);
		
		float aFloat = 3.14_15F;
		System.out.println(aFloat);
		
		double aDouble = 3.1_4_1_5;
		System.out.println(aDouble);
		
		
//		These are compile time errors.
//		int otherInt2 = 10__0_0____0_0_;
//		int otherInt2 = _10__0_0____0_0;
//		long aLong2 = 2_147_483_648_L;
//		float aFloat = 2_147_483_648_F;
		
//		int aHex = 0X_36;
//		int anHex = 0_X36;
//		int aBinary = 0b_10;
//		int aBinary = 0_B10;
		
		int anOctal = 0_27;  // That's ok. "_" must be between digits!
		
		double d = 2_577.930_113;
		float f = 6.02E2_3F;
		
		int otherInt4 = 10________0;
		System.out.println(otherInt4);
		
		int otherInt5 = 010________0;
		System.out.println(otherInt5);
		
		int otherInt6 = 10________0________0;
		System.out.println(otherInt6);

		int aBinary = 0b0001_1100__0011_0111__0010_1011__1010_0011;
		System.out.println(aBinary);
		
		System.out.println(Integer.parseInt("00011100001101110010101110100011", 2));
		
		long longBinary = 0b1111_0001_1100__0011_0111__0010_1011__1010_0011L;
		System.out.println(longBinary);	
		
		String s = "10_000";
		int i = Integer.valueOf(s); // NumberFormatException
	}
}
