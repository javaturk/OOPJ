package org.javaturk.oopj.ch05.loop;

public class HaltingProblem {

	public static void main(String[] args) {

		while (true)
			System.out.println("Selam");
		
//		double d = Math.random();
////
//		while (d < 0.5)
//			System.out.println(d);
//		
//		for(;;)
//			System.out.println(d);

//		solveHaltingProblem();
	}

	public static void solveHaltingProblem() {
		double d = Math.random();

//		while (d < 0.5) {
//			d = Math.random();
//			System.out.println(d);
//		}

		for (; d < 0.5;) {
			d = Math.random();
			System.out.println(d);
		}
	}
}
