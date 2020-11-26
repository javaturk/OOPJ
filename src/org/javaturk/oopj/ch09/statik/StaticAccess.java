package org.javaturk.oopj.ch09.statik;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class StaticAccess {
	static int i = 10;
	int j = 10;
	
	public static void main(String args[]) {
//		System.out.println(this.j);
		System.out.println("StaticAccess.i: " + i);
		System.out.println("StaticAccess.i: " + StaticAccess.i);
		
		StaticAccess.increaseI(9);

		System.out.println("StaticAccess.i: " + StaticAccess.i);

		increaseI(17);
//		increaseJ(21); // Can't make a call to a instance method
	}

	 static void increaseI(int i) {
//		this.i = 10; // i is not part of an object
//		this.j = 20; // j is not part of an object
		StaticAccess.i = i;
		i++;
		StaticAccess.i++;
		System.out.println("Local i: " + i);
		System.out.println("StaticAccess's i: " + StaticAccess.i);
		aMethod();
//		increaseJ(); // Can't make a call to a instance method
	}
	
	static void aMethod() {
		System.out.println("in aMethod()");
	}
	
	void increaseJ(int j) {
		this.j = j;
		j++;
		this.j++;
		System.out.println("local j: " + j);
		System.out.println("Instance's j: " + this.j);
		aMethod();  // Can make a call to a static method
	}
}