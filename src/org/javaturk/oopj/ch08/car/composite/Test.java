package org.javaturk.oopj.ch08.car.composite;

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
		Person zeynep = new Person();
		zeynep.tckn = "1";
		zeynep.firstName = "Zeynep";
		zeynep.lastName = "Kaya";
		
		Car mercedes = new Car();
		mercedes.make = "Mercedes";
		mercedes.model = "E200";
		mercedes.year = "2011";
		mercedes.speed = 80;
		mercedes.distance = 30_000;
		
		System.out.println(mercedes.getInfo());
		System.out.println(zeynep.getInfo());
//		
		System.out.println("*************");
		
		//That'a how the relationship/association is established.
		// That's a bi-directional, 1-1 association
		mercedes.owner = zeynep;
		zeynep.vehicle = mercedes;
		
		mercedes.speed = 100;
		mercedes.go(10);
	
		System.out.println(mercedes.getInfo());
		System.out.println(zeynep.getInfo());
//		
		System.out.println("*************");
		
		// A car without an owner
		Car bmw = new Car();
		bmw.make = "BMW";
		bmw.model = "i8";
		bmw.year = "2019";
		bmw.speed = 0;
		bmw.distance = 0;
//		System.out.println(bmw.getInfo());
		
		// A person without a car
		Person ahmet = new Person();
		ahmet.tckn = "2";
		ahmet.firstName = "Ahmet";
		ahmet.lastName = "Ozturk";
//		System.out.println(ahmet.getInfo());
		
		// Person Ahmet buys BMW i8
		ahmet.vehicle = bmw;
		bmw.owner = ahmet;
		
//		System.out.println();
//		
//		System.out.println(bmw.getInfo());
//		System.out.println(ahmet.getInfo());
//		
//		System.out.println();
		
		ahmet.vehicle = null;
		bmw.owner = null;
		mercedes.owner = null;
		
		zeynep.vehicle = bmw;
		bmw.owner = zeynep;
		System.out.println(ahmet.getInfo());
		
		System.out.println(bmw.getInfo());
		System.out.println(mercedes.getInfo());
//		System.out.println(ahmet.getInfo());
		
		System.out.println("Exchange the vehicles");
		ahmet.vehicle = mercedes;
		mercedes.owner = ahmet;
		zeynep.vehicle = bmw;
		bmw.owner = zeynep;
		System.out.println(bmw.getInfo());
		System.out.println(mercedes.getInfo());
		System.out.println(zeynep.getInfo());
		System.out.println(ahmet.getInfo());
		System.out.println();
		
		zeynep.vehicle = null;
		bmw.owner = null;
		System.out.println(bmw.getInfo());
		System.out.println(zeynep.getInfo());
		
//		System.out.println(zeynep.vehicle.model);
		
	}
}
