package org.javaturk.oopj.ch12.inheritance.covariant;

import org.javaturk.oopj.ch12.factories.factory3.Employee;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class HR {
	
	public Employee getAnEmployee(){
		return new Employee(1, "Ali", 8, "Production");
	}
}
