package org.javaturk.oopj.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example that shows how '+' can be used to concatenate String objects.
 */
public class StringConcat {
	private static String world = "Millet";
	private static String smiley = ":)";

	public static void main(String[] args) {
		String selam = "Selam " + world + smiley ;
		System.out.println("selam: " + selam);
		
		System.out.println("Java" + 1 + 2); 		// Java12
		System.out.println("Java" + (1 + 2)); 	// Java
		System.out.println(1 + 2 + "Java");		// 3Java  
	}
}
