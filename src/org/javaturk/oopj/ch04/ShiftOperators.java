package org.javaturk.oopj.ch04;

import static org.javaturk.oopj.ch04.BitwiseLogicalOperators.getBinary;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example that shows arithmetic promotions made in operators.
 */
public class ShiftOperators {

	public static void main(String[] args) {
		makePositiveShifts();
//		makeNegativeShifts();
//		makeUnsignedShifts();
//		shiftCircular();
	}

	private static void makePositiveShifts() {
		int i = 1; // 0000 0000 0000 0001
		System.out.println("i:         " + i + "    Binary: " + getBinary(i));
		i = i << 1; // 0000 0000 0000 0010
		System.out.println("i << 1:    " + i + "    Binary: " + getBinary(i));
		i = i << 6; // 0000 0000 1000 0000
		System.out.println("i << 6:  " + i + "    Binary: " + getBinary(i));
		i = i >> 1; // 0000 0000 0000 0001
		System.out.println("i >> 1:   " + i + "    Binary: " + getBinary(i));
		i = i >> 7; // 0000 0000 0000 0000
		System.out.println("i >> 7:    " + i + "    Binary: " + getBinary(i));
		
		System.out.println();
		
		// If the number is not even then right shift would produce 
		i = 139; // 0000 0000 1000 1011
		System.out.println("i:         " + i + "    Binary: " + getBinary(i));
		i = i >> 1; // 0000 0000 0100 0101
		System.out.println("i >> 1:     " + i + "    Binary: " + getBinary(i));
		i = i >> 1; // 0000 0000 0010 0010
		System.out.println("i >> 1:     " + i + "    Binary: " + getBinary(i));
	}
	
	private static void makeNegativeShifts() {
		int i = -1; // 0000 0000 0000 0001
		System.out.println("i:         " + i + "    Binary: " + getBinary(i));
		i = i << 1; // 0000 0000 0000 0010
		System.out.println("i << 1:    " + i + "    Binary: " + getBinary(i));
		i = i << 6; // 0000 0000 1000 0000
		System.out.println("i << 6:    " + i + "  Binary: " + getBinary(i));
		i = i >> 6; // 0000 0000 0000 0001
		System.out.println("i >> 6:    " + i + "    Binary: " + getBinary(i));
		i = i >> 1; // 0000 0000 0000 0000
		System.out.println("i >> 1:    " + i + "    Binary: " + getBinary(i));
	}
	
	private static void makeUnsignedShifts() {
		int i = 64; 
		System.out.println("i:         " + i + "    Binary: " + getBinary(i));
		i = i >>> 5; 
		System.out.println("i >> 5:     " + i + "    Binary: " + getBinary(i));
		
		i = -64; 
		System.out.println("i:        " + i + "    Binary: " + getBinary(i));
		i = i >>> 5; 
		System.out.println("i >>> 5:  " + i + "    Binary: " + getBinary(i));
	}
	
	public static void shiftCircular() {
		System.out.println("\nShifting Circular");
		int i = 64; 
		System.out.println("i:         " + i + "    Binary: " + getBinary(i));
		i = i >> 5; 
		System.out.println("i >> 5:     " + i + "    Binary: " + getBinary(i));
		
		i = 64; 
		System.out.println("i:         " + i + "    Binary: " + getBinary(i));
		i = i >> 37; 
		System.out.println("i >> 37:    " + i + "    Binary: " + getBinary(i));
		
	}

	public void shifts() {

		System.out.println("Signed Shifts");
		int i = 512;
		System.out.println("i: " + i);
		i = i >> 1;
		System.out.println("i >> 1: " + i); // 256

		i = i >> 3;
		System.out.println("i >> 3: " + i); // 32

		i = i << 5;
		System.out.println("i << 5: " + i); // 1024

		System.out.println("\nSigned Shifts bit Patterns");
		i = 512;
		System.out.println("i:      " + i + " " + getBinary(i));
		i = i >> 1;
		System.out.println("i >> 1: " + i + " " + getBinary(i)); // 256
		i = i >> 1;
		System.out.println("i >> 1: " + i + " " + getBinary(i)); // 128
		i = i >> 7;
		System.out.println("i >> 7:   " + i + " " + getBinary(i)); // 1
		i = i >> 1;
		System.out.println("i >> 1:   " + i + " " + getBinary(i)); // 0
		i = i >> 1;
		System.out.println("i >> 1:   " + i + " " + getBinary(i)); // 0

		System.out.println();

		i = 1;
		System.out.println("i:         " + i + " " + getBinary(i)); // 1
		i = i << 1;
		System.out.println("i << 1:    " + i + " " + getBinary(i)); // 2
		i = i << 1;
		System.out.println("i << 1:    " + i + " " + getBinary(i)); // 4
		i = i << 7;
		System.out.println("i << 7:  " + i + " " + getBinary(i)); // 512
		i = i << 1;
		System.out.println("i << 1: " + i + " " + getBinary(i)); // 0
		i = i << 1;
		System.out.println("i << 1: " + i + " " + getBinary(i)); // 0

		System.out.println("\nSigned Shift of A Negative");

		i = -1;
		System.out.println("i:         " + i + " " + getBinary(i)); // -1
		i = i << 1;
		System.out.println("i << 1:    " + i + " " + getBinary(i)); // 2
		i = i << 3;
		System.out.println("i << 3:    " + i + " " + getBinary(i)); // 2
//        
//        i = -3;
//        System.out.println("i: " + i);
//        i = i >> 1;
//        System.out.println("i >> 1: " + i);
//        
//        i = i << 5;
//        System.out.println("i << 5: " + i);
//        
//        System.out.println("\nUnsigned Shift of A Negative");
//        
//        i = -3;
//        System.out.println("i: " + i);
//        i = i >>> 1;
//        System.out.println("i >>> 1: " + i);
//        
//        i = i << 5;
//        System.out.println("i << 5: " + i);
//        
//        i = i >>> 8;
//        System.out.println("i >>> 8: " + i);
//        
//        long l1 = 9;
//        l1 = l1 >> 2;
//        System.out.println("l1: " + l1);
//        
////		Promotions
//        l1 = 200L;
//        byte b1 = 2;
//        long l2 = l1 >> b1;
//        System.out.println("l2: " + l2);
//        byte b2 = b1; // b1 isn't promoted to int
//        
////		byte c = b1 << 5;
//		byte c = (byte) (b1 << 5);
//		System.out.println("c: " + c);
//		
//		int i2 = (byte) (b1 << 5L); // Promoted only to int
//		System.out.println("c: " + c);
//		
////		i2 =  l1 << 5L; // Promoted to long
//		i2 =  (int) (l1 << 5L);
//		System.out.println("l1: " + l1);
//		
//		System.out.println(Integer.toBinaryString(-1>>>0));
	}
}
