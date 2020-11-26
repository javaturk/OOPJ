/**
 * 
 */
package org.javaturk.oopj.ch12.inheritance.covariant;

import org.javaturk.oopj.ch12.factories.factory3.Employee;
import org.javaturk.oopj.ch12.factories.factory3.Manager;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class HRTest {

	public static void main(String[] args) {
		HR hr = new HR();
		Employee employee1 = hr.getAnEmployee();
		
		HRForManagers hrForManagers = new HRForManagers();
		Employee employee2 = hrForManagers.getAnEmployee();
		employee2.work();
		
		Manager manager = hrForManagers.getAnEmployee();
		manager.manage();
		
	}
}
