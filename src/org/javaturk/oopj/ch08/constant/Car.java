package org.javaturk.oopj.ch08.constant;

public class Car {
	String make;
	String model;
	String year;
	int speed;
	int distance;
	
	String owner;
	
	// final parameter
	public void speedUp(final int newSpeed){
//		Can't do that
//		newSpeed *= 2;
		speed = newSpeed;
	}
	
	public void setOwner(final String newOwner){
//		Can't do that
//		newOwner = "Selim Efe";
		owner = newOwner;
	}
}
