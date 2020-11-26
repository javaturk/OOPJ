package org.javaturk.oopj.ch11.access.classAccess;

import org.javaturk.oopj.ch11.access.classAccess.x.ClassXX;

//import org.javaturk.oopj.ch11.access.classAccess.x.ClassZZ;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class ClassA {
	ClassB b = new ClassB();
	
	ClassXX x;
	
//	Not visible! Package accessible!
//	ClassZZ z;
}
