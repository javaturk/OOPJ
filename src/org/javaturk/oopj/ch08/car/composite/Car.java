package org.javaturk.oopj.ch08.car.composite;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Car {
	String make;
	String model;
	String year;
	int speed;
	int distance;
	
	// Owner of the car
	Person owner;
	
	public void go(int newDistance){
		distance += newDistance;
	}
	
	public void accelerate(int newSpeed){
		speed = newSpeed;
	}
	
	public void stop(){
		speed = 0;
	}
	
	public String getInfo(){
		String info = "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
		if(owner != null)
			info += " And its owner is " + owner.firstName + " " + owner.lastName;
		else
			info += " And it does not have an owner!";
		return info;
	}
}
