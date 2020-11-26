package org.javaturk.oopj.ch02;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      That's a <b>Javadoc</b> comment!
 *                                    
 */
public class Comments {

	private String name = "Comments"; // That's just a String.

	/**
	 * This method calculates the double of passed parameter and returns it.
	 * 
	 * @param x		The value to be doubled.
	 * @return 		Double of the value of x passed as parameter.
	 */
	public int doubleIt(int x) {

		/*
		 * That's a comment block!
		 */
		return 2 * x; // Just multiply x by 2!
	}
}
