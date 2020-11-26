
package org.javaturk.oopj.ch08.calculator;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class StatefulCalculator {

	String name;
	
	int firstArgument;
	int secondArgument;
	double result;
	char operation;
	
	// That's the engine that does calculations.
	Calculator calculator = new Calculator();

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	void whoAreYou() {
		System.out.println("I'm a Calculator, my name is " + name);
	}

	public int getFirstArgument() {
		return firstArgument;
	}

	public void setFirstArgument(int newFirstArgument) {
		firstArgument = newFirstArgument;
	}

	public int getSecondArgument() {
		return secondArgument;
	}

	public void setSecondArgument(int newSecondArgument) {
		secondArgument = newSecondArgument;
	}

	public char getOperation() {
		return operation;
	}

	public void setOperation(char newOperation) {
		operation = newOperation;
	}
	
	public double getResult() {
		switch(operation){
			case '+':	result = calculator.add(firstArgument, secondArgument); break;
			case '-':	result = calculator.subtract(firstArgument, secondArgument); break;
			case '*':	result = calculator.multiply(firstArgument, secondArgument); break;
			case '/':	result = calculator.divide(firstArgument, secondArgument); break;
		}

		return result;
	}
	
	public static void main(String[] args) {
		StatefulCalculator calculator = new StatefulCalculator();
		
		int a = 12;
		int b = 27;

		calculator.setFirstArgument(a);
		calculator.setSecondArgument(b);
		calculator.setOperation('*');
		double result = calculator.getResult();
		
		System.out.println("Result: " + result);
		System.out.println(calculator.getFirstArgument() + " " + calculator.getOperation() + " " + calculator.getSecondArgument() + " = " + result);
		
		calculator.setFirstArgument(17);
		calculator.setSecondArgument(92);
		calculator.setOperation('/');
		result = calculator.getResult();
		System.out.println("Result: " + result);
		System.out.println(calculator.getFirstArgument() + " " + calculator.getOperation() + " " + calculator.getSecondArgument() + " = " + result);
	}
}
