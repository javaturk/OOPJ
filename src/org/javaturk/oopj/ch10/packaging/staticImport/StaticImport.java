
package org.javaturk.oopj.ch10.packaging.staticImport;

//import static java.lang.Math.pow;
//import static java.lang.Math.PI;

import static java.lang.Math.*;

import static org.javaturk.oopj.ch10.packaging.staticImport.AClass.*;

//import static org.javaturk.oopj.ch10.packaging.staticImport.AClass.A_CONSTANT;
//import static org.javaturk.oopj.ch10.packaging.staticImport.AClass.aStaticVariable;
//import static org.javaturk.oopj.ch10.packaging.staticImport.AClass.aStaticMethod;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class StaticImport {

	public static void main(String[] args) {
		System.out.println(A_CONSTANT);
		System.out.println(aStaticVariable);
		aStaticMethod();
		
		System.out.println();
		
		System.out.println(Math.PI + " " + PI);
		System.out.println(Math.pow(2, 10) + " " + pow(2,10));
		
		System.out.println(PI + " " + PI);
		System.out.println(pow(2, 10) + " " + pow(2,10));
	}
}
