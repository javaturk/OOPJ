package org.javaturk.oopj.ch04;

public class AssignmentOperator {

	public static void main(String[] args) {

		int i = 3;
		
//		boolean b = (i = 5); // Can't do that: Type mismatch: cannot convert from int to boolean
		
		int j = (i = 5);
		System.out.println(i);
		
		boolean b1, b2;
		b1 = (b2 = true);
		System.out.println(b1);
		
		// Compound assignments
		i = i + 3; // i şimdi 8
		System.out.println(i);
		i += 3;   // i şimdi 11
		System.out.println(i);
		i -= 4;   // i şimdi 7
		System.out.println(i);
		i /= 7;   // i şimdi 1
		System.out.println(i);
	}

}
