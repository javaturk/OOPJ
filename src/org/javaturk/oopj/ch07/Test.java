package org.javaturk.oopj.ch07;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Test {

	public static void main(String[] args) {

		Car car1 = new Car();

		System.out.println("When the car stands still.");
		car1.make = "Mercedes";
		car1.model = "C200";
		car1.year = "2019";
		car1.distance = 0;
		car1.speed = 0;
		System.out.println(car1.getInfo());

		System.out.println("\nWhen the car moves.");
		car1.accelerate(125);
		car1.go(100);
		car1.go(50);
		System.out.println(car1.getInfo());

		System.out.println();

		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "i8";
		car2.year = "2017";
		car2.distance = 10_000;
		car2.speed = 160;
		System.out.println(car2.getInfo());

		car2.accelerate(220);
		double timeToGo = car2.go(1000);
		System.out.println("Time to go 1000 km " + timeToGo + " hour.");
		System.out.println(car2.getInfo());

//		car2 = null;
//		if(car2 != null)
//			car2.accelerate(220);
//		else
//			System.out.println("Null");

//		double time = 1000d/car2.speed;
//		System.out.println(time + " saat");

	}
}
