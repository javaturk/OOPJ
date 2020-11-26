package org.javaturk.oopj.ch09.init.initializers;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class MemberDefinition {
	
//	Compiler error! Forward reference!
//	double totalPercentage = counter * percentage;
//	int counter = 1; // Source of the error.
//	static double percentage = 5.8;
	
//	Compiler error! Can't make static reference to a non-static field.
//	static double totalPercentage = counter * percentage;
	
//	That's ok.
//	double totalPercentage = counter * percentage;
//	static double percentage = 5.8;

}
