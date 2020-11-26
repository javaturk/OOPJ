package org.javaturk.oopj.ch09.init.initializers.problem;

import java.time.LocalTime;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      Problem of this approach is duplicating initialization code into
 *      constructors and can't solve it by calling this().
 */
public class InitializationProblem2 {
	String name;
	int i;

	double coefficient;

	InitializationProblem2() {
//		this("default"); // Can't call it!

		LocalTime now = LocalTime.now();
		if (now.isBefore(LocalTime.NOON))
			coefficient = 2;
		else
			coefficient = 4;
	}

	InitializationProblem2(String name, int i) {
		this.name = name;
		this.i = i;

		LocalTime now = LocalTime.now();
		if (now.isBefore(LocalTime.NOON))
			coefficient = 2;
		else
			coefficient = 4;
	}
}
