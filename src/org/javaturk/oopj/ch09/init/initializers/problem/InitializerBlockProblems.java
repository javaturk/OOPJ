package org.javaturk.oopj.ch09.init.initializers.problem;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class InitializerBlockProblems {

	static {
//		i = j + 2; 	// Error! Reading j before declaring it!
		j = 10; // That's OK.
//		i = j + 2;	// Error! Reading j before declaring it!
	}

	static {
//		k = k+1; // Error! Reading j before declaring it!
//		k++;     // Error! Reading j before declaring it!
	}
	static int i, j, k;

	static {
		j = 4;
	}

// 	 Can't do this
	 static boolean[] b;
	
	 static{
//		 b = {true, true, false};
	 }
	
	int t = 10;
	
	static double f;
	
	static {
//		f = t * Math.random(); // Error! Can't make static reference
	}
}
