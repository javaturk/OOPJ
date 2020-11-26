package org.javaturk.oopj.ch10.packaging.packageA;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class ClassA {

//	ClassX x1; // Error!
	org.javaturk.oopj.ch10.packaging.packageX.ClassX x;
	
	public ClassA(org.javaturk.oopj.ch10.packaging.packageX.ClassX x) {
		this.x = x;
	}
}
