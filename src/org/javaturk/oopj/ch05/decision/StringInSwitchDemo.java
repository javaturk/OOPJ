package org.javaturk.oopj.ch05.decision;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example that shows arithmetic promotions made in operators.
 */

public class StringInSwitchDemo {

	public static void main(String[] args) {
		String dayInEnglish = args[0];
		
		final String s = "sunday"; // Constant exp.
		
		switch(dayInEnglish){
			case "monday":		System.out.println("Pazartesi"); break;
			case "tuesday":		System.out.println("Sali"); 	break;
			case "wednesday":	System.out.println("Çarsamba"); break;
			case "thursday":	System.out.println("Persembe"); break;
			case "friday":		System.out.println("Cuma"); 	break;
			case "saturday":	System.out.println("Cumartesi");break;
			case s:				System.out.println("Pazar"); 	break;
		}
	}
}
