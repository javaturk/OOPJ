package org.javaturk.oopj.ch11.access.memberAccess;

import org.javaturk.oopj.ch11.access.memberAccess.p.ClassP;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class ClassA{

	public static void main(String[] args) {
			
		ClassP p = new ClassP();
		System.out.println(p.x);
//		System.out.println(p.y);
//		System.out.println(p.w);
//		System.out.println(p.z);
		
		p.publicMethod();
//		p.defaultMethod();
//		p.protectedMethod();
//		p.privateMethod();
		
	}
}
