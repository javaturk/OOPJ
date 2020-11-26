
package org.javaturk.oopj.ch12.ObjectClass;

import java.util.ArrayList;
import java.util.Iterator;

import org.javaturk.oopj.ch12.factories.factory3.Employee;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class HashCodeExample {

	public static void main(String[] args) {

		Object o = new Object();

		Integer obj11 = 2009;
		System.out.println("hashCode for an integer " + obj11.hashCode());

		Integer obj12 = new Integer(2009);
		System.out.println("hashCode for an integer " + obj12.hashCode());

		if (obj11.equals(obj12))
			System.out.println(obj11 + " and " + obj12 + " are equal.");

		Long obj13 = new Long(2009);
		System.out.println("\nhashCode for a long " + obj13.hashCode());

		Long obj14 = new Long(2009);
		System.out.println("hashCode for a long " + obj14.hashCode());

		if (obj13.equals(obj14))
			System.out.println(obj11 + " and " + obj12 + " are equal.");

		String obj21 = new String("2009");
		System.out.println("\nhashCode for a string " + obj21.hashCode());

		String obj22 = "2009";
		System.out.println("hashCode for a string " + obj22.hashCode());

		if (obj21.equals(obj22))
			System.out.println(obj21 + " and " + obj22 + " are equal.");

		StringBuffer obj3 = new StringBuffer("2009");
		System.out.println("\nhashCode for a string buffer " + obj3.hashCode());

		ArrayList<Integer> obj4 = new ArrayList<Integer>();
		obj4.add(new Integer(2009));
		System.out.println("\nhashCode for an arraylist " + obj4.hashCode());

		Iterator obj5 = obj4.iterator();
		System.out.println("\nhashCode for an iterator " + obj5.hashCode());

		HashCodeExample obj6 = new HashCodeExample();
		System.out.println("\nhashCode for HashCodeExample " + obj6.hashCode());

		String obj7 = new String("19999999999999999");
		System.out.println("\nhashCode can be negative " + obj7.hashCode());

		Employee e1 = new Employee(111, "Mihrimah", 5, "Production");
		Employee e2 = new Employee(111, "Mihrimah", 3, "Production");
		System.out.println("\nhashCode for an Employee " + e1.hashCode());
		System.out.println("hashCode for an Employee " + e2.hashCode());

		if (e1.equals(e2))
			System.out.println(e1 + " and " + e2 + " are equal.");

		Employee e3 = new Employee(111, "Mihrimah", 7, "Production");
		Employee e4 = new Employee(112, "Mihrimah", 3, "Production");
		System.out.println("\nhashCode for an Employee: " + e3.hashCode());
		System.out.println("hashCode for an Employee: " + e4.hashCode());

		if (!e3.equals(e4))
			System.out.println(e3 + " and " + e4 + " are not equal.");
	}
}
