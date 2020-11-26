package org.javaturk.oopj.ch09.init.initializers.problem;

import java.time.LocalTime;
import java.util.Random;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This example shows how to use initializer block to solve all problems
 *      mentioned in InitializationProblem1, InitializationProblem2, InitializationProblem3 and
 *      InitializationProblem4 classes.
 * 
 */
public class InitializationSolution {
	String name;
	double coefficient;

	{
		name = "default";
		
		LocalTime now = LocalTime.now();
//		coefficient = now.isBefore(LocalTime.NOON) ? 2 : 4;

		if (now.isBefore(LocalTime.NOON))
			coefficient = 2;
		else
			coefficient = 4;
	}

	static int ratio;

	// Think about where to put this block to initialize static var "ratio"
	// InitializationProblem1, InitializationProblem2 and InitializationProblem3
	// classes.
	static {
		Random random = new Random();
		int randomInt = random.nextInt();
		randomInt = Math.abs(randomInt);
		double randomDouble = Math.random();
		if (randomDouble < 0.5)
			ratio = randomInt % 9;
		else
			ratio = randomInt % 5;
	}

	InitializationSolution() {
		
	}

	InitializationSolution(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		InitializationSolution ref = new InitializationSolution();
		System.out.println("ratio: " + ratio);
		System.out.println("coefficient: " + ref.coefficient);
	}
}
