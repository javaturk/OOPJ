package org.javaturk.oopj.ch09.init.initializers.problem;

import java.time.LocalTime;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      Problem of this approach is duplicating initialization code into constructors.
 */
public class InitializationProblem1 {
	String name;
//	name = "default";
	
	double coefficient;
//	coefficient = 0.5; // That's problem

	InitializationProblem1() {
		name = "default";
		
		LocalTime now = LocalTime.now();
		if (now.isBefore(LocalTime.NOON))
			coefficient = 2;
		else
			coefficient = 4;
	}

	InitializationProblem1(String name) {
		this.name = name;
		
		LocalTime now = LocalTime.now();
		if (now.isBefore(LocalTime.NOON))
			coefficient = 2;
		else
			coefficient = 4;
	}
}
