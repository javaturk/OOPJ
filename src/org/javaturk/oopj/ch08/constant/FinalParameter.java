package org.javaturk.oopj.ch08.constant;

public class FinalParameter {

	public static void main(String[] args) {
//		Car is a final reference
		final Car car; //= new Car("CLK200", "2011", 0, 0);
		
//		Can do this only if car is not defined above!
		car = new Car();
		car.make = "Mercedes";
		car.model = "E200";
		car.year = "2011";
		car.speed = 80;
		car.distance = 30_000;
		
//		Can't do this
//		car = new Car();

		car.speedUp(80);
		car.setOwner("Zeynep");
	}

}
