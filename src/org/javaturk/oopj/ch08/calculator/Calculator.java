package org.javaturk.oopj.ch08.calculator;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Calculator {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	void whoAreYou(){
		System.out.println("I'm a Calculator, my name is " + name);
	}

	public int add(int first, int second) {
		return first + second;
	}

	public int subtract(int first, int second) {
		return first - second;
	}

	public int multiply(int first, int second) {
		int sonuc =  first * second;
		return sonuc;
	}
	
	public int multiplyByAdding(int first, int second) {
		int multiplication = 0;
		for(int i = 1; i <= second; i++)
			multiplication += first;
		System.out.println("Multiplication: " + multiplication);
		return multiplication;
	}

	public double divide(int first, int second) {
		return (double)first / second;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setName("Texas Instruments T-308");
		
		calculator.whoAreYou();
		
		int i = calculator.add(12, 27);
		System.out.println("12 + 27 = " + i);
		
		double d = calculator.divide(82, 9);
		System.out.println("82 / 9 = " + d);
		
		System.out.println("83 - 56 = " + calculator.subtract(83, 56));
		System.out.println("8 * 7 = " + calculator.multiply(8, 7));
		
		// Calling it for its side effect
		calculator.multiplyByAdding(22, 5);
		
//		System.out.println(calculator.power(2, 5));
// 		
//		System.out.println(calculator.mod(36, 5));
//		
//		System.out.println(calculator.factorial(5));
	}
}
//