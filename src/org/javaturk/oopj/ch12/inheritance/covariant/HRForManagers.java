package org.javaturk.oopj.ch12.inheritance.covariant;

import org.javaturk.oopj.ch12.factories.factory3.Manager;
import org.javaturk.oopj.ch12.factories.factory3.Employee;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class HRForManagers extends HR{
	
	public Manager getAnEmployee(){  // Covariant return type
		return new Manager(2, "Fatma", 3, "Production", "Production");
	}
}
