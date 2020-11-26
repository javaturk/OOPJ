package org.javaturk.oopj.ch09.init.initializers.problem;

import java.time.LocalTime;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      Problem of this approach is the initialziation code is too complicated!
 */
public class InitializationProblem4 {
	String name;

	double coefficient = LocalTime.now().isBefore(LocalTime.NOON) ? 2 : 4;
	
	// Where to initialize the static array? Only a static initialization method!
	static int[] ints = new int[10];

	InitializationProblem4() {
		name = "default";
	}

	InitializationProblem4(String name) {
		this.name = name;
		
		// Too late to initialize
//		System.out.println("\nInitializing the static array.");
//		for (int i = 0; i < ints.length; i++)
//			ints[i] = (i + 1) * 10;
	}
	
	static void initializeArray() {
		System.out.println("\nInitializing the static array.");
		for (int i = 0; i < ints.length; i++)
			ints[i] = (i + 1) * 10;
	}
	
	public static void main(String[] args) {
		// First initialize array
		initializeArray();
		
		System.out.println();
		
		for(int i : ints)
			System.out.print(i + " ");
		
		System.out.println("\n");
		
		System.out.println(new InitializationProblem4().coefficient);
	}
}
