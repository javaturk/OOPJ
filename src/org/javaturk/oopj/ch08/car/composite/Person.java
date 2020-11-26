package org.javaturk.oopj.ch08.car.composite;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Person {
	String tckn;
	String firstName;
	String lastName;
	
	// Car of the person
	Car vehicle;
	
	public String getInfo(){
		String info = "Person Info: " + tckn + " " + firstName + " " + lastName;
		if( vehicle != null)
				info += " and has a car: " + vehicle.getInfo();
		else
			info += " and has no car.";
		
		return info;
	}
}
