package org.javaturk.oopj.ch03;

import java.util.Date;

import org.javaturk.oopj.ch03.references.car.Car;
 
public class VarDemo {

//	  var m = 10; // Hata: 'var' is not allowed here
//	 private static var b = true;

	public static void main(String[] args) {
		
//		var i;	// Cannot use 'var' on variable without initializer
		var j = 5;
		System.out.println("j: " + j);
		
		var jj = 1_0f/2_00_0;
		System.out.println("jj: " + jj);
		
		byte b = 8;
		var jjj = b/4.0;
		System.out.println("jjj: " + jjj);

//		j = true; // var provides type inference, it is not something that enables
		// dynamic typing.

		var d = new Date();
		System.out.println("Date: " + d);

//		var anArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};  // Problem! Array initializer needs an explicit target-type
//		var anotherArray = {1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L};  // Problem!
//		var aStringArray = {"1", "2", "4"};  // Problem!

		var intArray = new int[3];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		System.out.print("Array: ");
		for (var t : intArray)
			System.out.print(t + " ");

		System.out.println("\n");
		var car1 = new Car();
		car1.make = "Mercedes";
		car1.model = "C200";
		car1.year = "2019";
		car1.distance = 0;
		car1.speed = 0;
		System.out.println(car1.getInfo());

		System.out.println("When the car moves.");
		car1.accelerate(125);
		car1.go(100);
		car1.go(50);
		System.out.println(car1.getInfo());
		
		var v1 = " ".isBlank();
		var v2 = " ".isEmpty();
		System.out.println(v1 + " " + v2);
	}
}