package org.javaturk.oopj.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example that shows how '+' can be used to concatenate String
 *      objects.
 */
public class CharConcat {
	
	public static void main(String[] args) {
		char a = 'a', b = 'b';
		char c1 = (char) (a + b);   
		System.out.println("c1: " + c1);
		
		int c2 = a + b;   
		System.out.println("c2: " + c2);
		
		System.out.println(a + b);
		System.out.println("a + b: " + 'a' + 'b');
		System.out.println('a' + 'b');
	}
}
