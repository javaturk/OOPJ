
package org.javaturk.oopj.ch03.references.car;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class CarReferences {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.make = "Mercedes";
		car1.model = "C200";
		car1.year = "2015";
		car1.distance = 0;
		car1.speed = 0;
		System.out.println("car1:   " + car1.getInfo());
		
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "i8";
		car2.year = "2016";
		car2.distance = 10_000;
		car2.speed = 160;
		System.out.println("car2:   " + car2.getInfo());
		
		Car tmpCar = car1;
		car1 = car2;
		car2 = tmpCar;
		
		System.out.println("\ncar1:   " + car1.getInfo());
		System.out.println("car2:   " + car2.getInfo());
		System.out.println("tmpCar: " + tmpCar.getInfo());
		
		car2.accelerate(180);
		car2.go(25);
		
		System.out.println("\ncar2:   " + car2.getInfo());
		System.out.println("tmpCar: " + tmpCar.getInfo());
		
		tmpCar.go(50);
		tmpCar.stop();
		
		System.out.println("\ncar2:   " + car2.getInfo());
		System.out.println("tmpCar: " + tmpCar.getInfo());
		
		car1 = null;
//		car1.accelerate(150);
//		car1.go(50);
//		if(car1 != null)
//			System.out.println("\ncar1:   " + car1.getInfo());
//		else
//			System.out.println("It is a null reference!");
		
		tmpCar.accelerate(150);
		tmpCar.go(50);
		
		car1 = null;
//		car1.accelerate(150);
//		car1.go(50);
		System.out.println("tmpCar: " + tmpCar.getInfo());
		
		tmpCar = new Car();
		tmpCar.go(100);
		tmpCar.accelerate(80);
		System.out.println("tmpCar: " + tmpCar.getInfo());
	}
}
