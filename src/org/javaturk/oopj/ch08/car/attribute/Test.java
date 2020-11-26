package org.javaturk.oopj.ch08.car.attribute;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Test {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		System.out.println("My Car: " + myCar.year + " " + myCar.make + " " + myCar.model + " " +  myCar.speed  + " " + myCar.distance);
		
		myCar.make = "Mercedes";
		myCar.model = "E200";
		myCar.year = "2011";
		myCar.speed = 80;
		myCar.distance = 30_000;	

		System.out.println("My Car: " + myCar.year + " " + myCar.make + " " + myCar.model + " " +  myCar.speed  + " " + myCar.distance);
		
		Car yourCar = new Car();
		yourCar.make = "Toyota";
		yourCar.model = "Camry";
		yourCar.year = "2011";
		yourCar.speed = 0;
		yourCar.distance = 60_000;
		System.out.println("Your Car: " + yourCar.year + " " + yourCar.make + " " + yourCar.model + " " +  yourCar.speed  + " " + yourCar.distance);

		System.out.println();
		
		//Following shows the difference between a reference and an object.	
		Car tmpCar = myCar;
		myCar = yourCar;
		yourCar = tmpCar;
		System.out.println("My Car: " + myCar.year + " " + myCar.make + " " + myCar.model);
		System.out.println("Your Car: " + yourCar.year + " " + yourCar.make + " " + yourCar.model);
		
		myCar.speed= 150;
		yourCar.speed = 200;
		
		System.out.println(myCar.speed + " " + yourCar.speed + " " + tmpCar.speed);
		
	}

}
